<%-- 
    Document   : index
    Created on : 26/10/2017, 07:41:33 AM
    Author     : Angelo
--%>
i
<%@page contentType="text/html" import="javax.ejb.*, javax.naming.*, sessionbeans.*, java.text.DecimalFormat, java.util.*,beans.*,domainmodel.*,servlets.*" pageEncoding="UTF-8"%>
<jsp:useBean id="carritoBean" class="beans.CarritoBean" scope="session"/>
<%!
    DecimalFormat decimales;
%>
<%
    decimales = new DecimalFormat("0.00");
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="files/css/propio.css"/>
        <script type="text/javascript" src="files/js/jquery-3.2.1.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de compras</title>
    </head>
    <body>
        <div class="container">
            <form action="CarritoServlet" method="post">
                <table class="table table-bordered form">
                    <tbody>
                        <tr>
                            <td>
                                Inserte el nombre del producto:
                            </td>
                            <td class="input-field">
                                <input type="text" name="nombre" size="60" maxlength="100"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Inserte el precio del producto:
                            </td>
                            <td class="input-field">
                                <input type="text" name="precio" size="60" maxlength="10"/>
                            </td>
                        </tr> 
                        <tr>
                            <td>
                                Inserte el numero de unidades
                            </td>
                            <td class="input-field">
                                <input type="text" name="nunid" size="60" maxlength="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input type="submit" value="Enviar"/>
                                <input type="reset"/>
                            </td>
                        </tr>
                    </tbody>
                </table>                
            </form>
        </div>
        <div class="container">
            <h1>Estado del carrito</h1>
        </div>
        <div class="container">
            <table class="table table-bordered" >
                <thead>
                    <tr>
                        <th>Nombre del producto</th>
                        <th>Precio</th>
                        <th>Número de unidades</th>
                        <th>Precio producto</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        if (carritoBean != null && carritoBean.getProductos() != null) {
                            List<Producto> productos = carritoBean.getProductos();
                            for (Producto p : productos) {
                                double precioTotal = p.getPrecio() * (double) p.getnUnidades();
                    %>
                    <tr>
                        <td>
                            <%=p.getNombre()%>
                        </td>
                        <td>
                            <%=decimales.format(p.getPrecio())%>
                        </td>
                        <td>
                            <%=p.getnUnidades()%>
                        </td>
                        <td>
                            <%=decimales.format(precioTotal)%>
                        </td>
                    </tr>
                    <%      }
                        }
                    %>
                    <tr>
                        <td colspan="3" class="total">Total:</td>
                        <%
                            if(carritoBean != null && carritoBean.getProductos() != null){
                        %>
                        <td>
                            <%=decimales.format(carritoBean.getPrecioTotal())%>
                        </td>
                        <%} else {%>
                        <td>
                            <%=decimales.format(0.0)%>
                        </td>
                        <%}%>
                    </tr>
                </tbody>
            </table>                
        </div>
    </body>
</html>
