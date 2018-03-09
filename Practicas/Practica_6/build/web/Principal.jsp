<%-- 
    Document   : Principal
    Created on : 21/09/2017, 08:31:35 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Declaración, Scriptles y Expresiones</title>
    <style type="text/css">
        body{
            background: #CEF6F5;
            font-family:Trebuchet MS;
        }
        #volver{
            background-color:#088a86;
            -moz-border-radius:20px;
            -webkit-border-radius:20px;
            border-radius:28px;
            border:1px solid #088a86;
            display:inline-block;
            cursor:pointer;
            color:#ffffff;
            font-family:Trebuchet MS;
            font-size:14px;
            padding:10px 20px;
            text-decoration:none;
            text-shadow:0px 1px 0px #088a86;
        }
        #contenedor{
            padding: 0.5em;
            position: righ; position:relative;
            left: 20em; padding:1em;
            width: 35%; height: 220px;
            border: 4px solid #088A85;
            margin-top: 5em;
            background: white;
            border-radius: 10px;
            box-shadow: 5px 5px 5px 10px white;
        }
        #principal{
            padding: 0.5em;
            position: righ;
            position:relative;
            left: 15em;
            padding:1em;
            width: 60%;
            height: 550px;
            border: 4px solid #088A85;
            margin-top: 5em;
            background: white;
            border-radius: 10px;
            box-shadow: 5px 5px 5px 10px white;
        }
        #der,#derecha{
            float: right;
            width: 50%;
        }
        #izq,#izquierda{
            float:left;
            width: 50%;
        }
    </style>
</head>
<body>
    <div id="principal">
        <%--
        Declaraciones
        --%>
        <% String nombre = (String) request.getParameter("nombre");
            String edad1 = (String) request.getParameter("edad");
            int edad = Integer.parseInt(edad1);
            String rutaintensamente = "C:\\Users\\Angelo\\Downloads\\Escuela\\8VO. SEMESTRE\\Desarrollo de Aplicaciones Empresariales\\8VO. SEMESTRE\\Practica_6\\src\\intensamente.png";
            String rutamalefica = "C:\\Users\\Angelo\\Downloads\\Escuela\\8VO. SEMESTRE\\Desarrollo de Aplicaciones Empresariales\\8VO. SEMESTRE\\Practica_6\\src\\malefica.png";
            String rutaterror = "C:\\Users\\Angelo\\Downloads\\Escuela\\8VO. SEMESTRE\\Desarrollo de Aplicaciones Empresariales\\8VO. SEMESTRE\\Practica_6\\src\\terror.png";
        %>
        <%--
        Scriptles
        --%>
        <h2>Selección de tipo de película</h2>
        <h3>Usted puede ver lo siguiente: </h3>
        <% if (edad < 12) {%>
        Clasificación AA, todo el publico y Niños
        <br>
        <br>
        <div id ="izq">
            <img src="<%=rutaintensamente%>">
        </div>
        <div id="der"><p>
                El camino hacia la madurez se encuentra lleno de baches y
                el de Riley no es la excepción, cuando su padre comienza
                un nuevo trabajo en San Francisco – Riley será guiada por
                sus emociones – Joy (alegría), Fear (temor), Anger (enojo) ,
                Disgust (desagrado) y Sadness (tristeza); quienes la asesoran
                en su vida cotidiana. Mientras Riley y sus emociones se
                esfuerzan por adaptarse a una nueva vida en San Francisco,
                la confusión y la ansiedad se apoderan de su cabeza.
                Aunque Joy, la emoción principal y más importante de Riley,
                trata de mantener las cosas positivas, las emociones entran
                en conflicto sobre cuál es la mejor manera de navegar por
                una nueva ciudad, casa y escuela.
            </p></div>
            <% } else if ((edad >= 12) && (edad <= 18)) {%>
        Clasificación B, para niños mayores de 12.
        <br>
        <br>
        <div id ="izq">
            <img src="<%=rutamalefica%>">
        </div>
        <div id="der"><p>
                Es la historia jamás contada de Maléfica, la villana más
                querida de Disney, la mala de “Sleeping Beauty”
                (La Bella durmiente), el clásico de 1959. La película
                relata los acontecimientos que endurecieron su corazón y
                la llevaron a lanzar una maldición sobre la pequeña Aurora.
            </p></div>
            <% } else {%>
        Clasificación A, apto para todo el público.<br>
        Clasificación C, mayores de 18 años.<br>
        Clasificación D, mayores de 18 con contenido violento, terror y lenguaje explicito.
        <br>
        <br>
        <div id ="izq">
            <img src="<%=rutaterror%>">
        </div>
        <div id="der"><p>
                El conjuro esta basa en la historia real de la familia
                Perron y sus encuentros sobrenaturales en su casa de Rhode Island.
            </p></div>
            <% };%>
        <br><br>
        <div id="derecha">
            <em>Fecha: </em><%= new java.util.Date()%><br>
            <em>Nombre: </em> <%=nombre%><br>
            <em>Edad: </em> <%=edad%> a&ntilde;os
        </div>
        <br>
        <br>
        <div id="izquierda">
            <a href="Inicio.jsp" id="volver">Volver</a></div>
    </div>
</body>
</html>
