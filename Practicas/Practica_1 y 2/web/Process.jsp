<%-- 
    Document   : Process
    Created on : 7/09/2017, 07:52:19 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String nombre = request.getParameter("txtName");
    String edad = request.getParameter("txtAge");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Datos obtenidos</h3>
        <br>
        Nombre: <%=nombre%>
        <br>
        Edad: <%=edad%>
        <br>
        <br>
        <a href="index.jsp">Ir al index</a>
    </body>
</html>
