<%-- 
    Document   : index
    Created on : 12/09/2017, 07:16:55 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <form name="RegistroComputadora" action="CustomServlet2" method="POST">
                <table>
                    <tr>
                        <td colspan="2">
                            No de Serie 
                        </td>
                        <td colspan="1">
                            <input type="text" name="noSerie" value="" /> 
                        </td>
                    <br>
                    </tr>
                    <tr>
                        <td colspan="2">
                            Marca
                        </td>
                        <td colspan="1">
                            <input type="text" name="marca" value="" /> 
                        </td>
                    <br>
                    </tr>
                    <tr>
                        <td colspan="2">
                            Modelo
                        </td>
                        <td colspan="1">
                            <input type="text" name="modelo" value="" /> 
                        </td>
                    <br>
                    </tr>
                    <tr>
                        <td colspan="2">
                            Color 
                        </td>
                        <td colspan="1">
                            <input type="text" name="color" value="" /> 
                        </td>
                    <br>
                    </tr>
                    <tr>
                        <td colspan="2">
                            Maestro
                        </td>
                        <td colspan="1">
                            <input type="text" name="maestro" value="" /> 
                        </td>
                    <br>
                    <br>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <div align="center">
                                <br>
                                <input type="submit" value="Aceptar" name="Aceptar" />
                                <br>
                            </div>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
