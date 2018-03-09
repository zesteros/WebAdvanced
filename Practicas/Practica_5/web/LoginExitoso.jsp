<%-- 
    Document   : LoginExitoso
    Created on : 21/09/2017, 07:50:59 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Exitoso</title>
    </head>
    <body>
        <%
            String user = null;
            if(session.getAttribute("user") == null){
                response.sendRedirect("index.html");
            }else{
                user = session.getAttribute("user").toString();
            }
            
            String userName = null;
            String sessionId = null;
            Cookie [] cookies = request.getCookies();
            if(cookies != null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("user"))
                        userName = cookie.getValue();
                    if(cookie.getName().equals("JSESSIONID"))
                        sessionId = cookie.getValue();
                }
            }
        %>
        <h3>Hi <%=userName%>, Login Successful, your session id=<%=sessionId%></h3>
        <br>
        User=<%=user%>
        <br>
        <a href="OtraPagina.jsp">Otra Página</a>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
