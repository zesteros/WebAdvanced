/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.CarritoBean;
import domainmodel.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbeans.ICarritosLocal;

/**
 *
 * @author Angelo
 */
public class CarritoServlet extends HttpServlet {

    @EJB
    private ICarritosLocal carritos;
    private CarritoBean carritoBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        synchronized (this) {
            HttpSession session = request.getSession();
            String idSesion = session.getId();
            carritos.usarCarrito(idSesion);
            if (session.getAttribute("carritoBean") == null) {
                carritoBean = new CarritoBean();
                session.setAttribute("carritoBean", carritoBean);
            } else {
                carritoBean = (CarritoBean) session.getAttribute("carritoBean");
            }
            String nombreProducto = request.getParameter("nombre");
            String precioProducto = request.getParameter("precio");
            String nUnidadesProducto = request.getParameter("nunid");

            double precio = 0.0d;
            int nUnidades = 0;

            try {
                precio = Double.parseDouble(precioProducto);
                nUnidades = Integer.parseInt(nUnidadesProducto);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (precio != 0.0d && nUnidades != 0) {
                domainmodel.Producto p = new Producto();
                nombreProducto = new String(nombreProducto.getBytes("ISO-8859-1"), "UTF-8");
                p.setNombre(nombreProducto);
                p.setPrecio(precio);
                p.setnUnidades(nUnidades);
                carritos.anadirProductoCarrito(idSesion, p);
                System.out.println("El carrito tiene: " + carritos.getProductos(idSesion).size() + " productos.");

            }
            carritoBean.setProductos(carritos.getProductos(idSesion));
            carritoBean.setPrecioTotal(carritos.getPrecioTotalCarrito(idSesion));
            response.sendRedirect("index.jsp");
        }
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CarritoServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CarritoServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
