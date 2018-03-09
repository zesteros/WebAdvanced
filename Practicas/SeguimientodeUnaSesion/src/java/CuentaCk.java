/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo
 */
public class CuentaCk extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String scuenta = null;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("cuenta.ck")) {
                    scuenta = cookies[i].getValue();
                }
            }
        }

        Integer objCuenta = null;

        if (scuenta == null) {
            objCuenta = new Integer(1);
        } else {
            objCuenta = new Integer(Integer.parseInt(scuenta) + 1);
        }
        Cookie c = new Cookie("cuenta.ck", objCuenta.toString());
        response.addCookie(c);
        out.println("<html>");
        out.println("Has visitado esta página " + objCuenta.toString()
                + ((objCuenta.intValue()) == 1 ? "vez." : "veces."));
        out.println("</html>");
        out.close();
    }

}
