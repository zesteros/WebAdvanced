<%-- 
    Document   : OtraPagina
    Created on : 21/09/2017, 07:59:19 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("user") == null){
                response.sendRedirect("index.html");
            }
            String userName = null;
            String sessionId = null;
            Cookie [] cookies = request.getCookies();
            if(cookies != null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("user"))
                        userName = cookie.getValue();
                }
            }
        %>
        <h3>Hola <%=userName%> esta es otra página.</h3>
        
        <br>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
