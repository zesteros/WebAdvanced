/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Angelo
 */
public class SeguimientoSesion extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession sesionCli = request.getSession(true);

        String idSesion = sesionCli.getId();

        long fechaCreacion = sesionCli.getCreationTime();
        long fechaUltimoAcceso = sesionCli.getLastAccessedTime();

        Integer cuenta = (Integer) sesionCli.getAttribute("cuenta.ss");

        if (cuenta == null) {
            cuenta = new Integer(1);
        } else {
            cuenta = new Integer(cuenta.intValue() + 1);
        }
        sesionCli.setAttribute("cuenta.ss", cuenta);
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Seguimient de una Sesion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Demostración de seguimiento de una sesión</h1>");

        out.println("Has visitado esta página " + cuenta + ((cuenta.intValue() == 1) ? " vez." : "veces"));
        out.println("<p>");
        out.println("<h2>Datos de tu sesión</h2>");
        out.println("Sesión:" + idSesion);
        out.println("<br> Fue creada:" + (new Date(fechaCreacion).toString()));
        out.println("<br> Fue accedida por última vez:" + (new Date(fechaUltimoAcceso).toString()));
        out.println("<br>Atributos<br>");
        Enumeration<String> nombresParams = sesionCli.getAttributeNames();
        while(nombresParams.hasMoreElements()){
            String param = (String)nombresParams.nextElement();
            Object valor = sesionCli.getAttribute(param);
            out.println(param+":"+valor.toString()+"<br>");
        }

        out.println("</body>");
        out.println("</html>");

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
