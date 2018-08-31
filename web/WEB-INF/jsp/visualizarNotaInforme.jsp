<%-- 
    Document   : visualizarNotaInforme
    Created on : 30/10/2017, 02:58:10 PM
    Author     : sergioandres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <title>Informe Examen</title>
    </head>
    <body class="body">
        <div class="container">
            <header class="col-xs-12">
                <h3><font color="red"><span class="glyphicon glyphicon-warning-sign"></span> Si la nota es inferior a 4.0, debe recordar que esta evaluación estará nuevamente disponible para usted en 7 dias calendario. </font></h3>
                <br>
                <div align="center">
                    <br>
                    <br>
                    <h4>Muchas gracias por usar la aplicación BeMonitor</h4>
                    <br>
                    <br>
                    <button class="btn btn-success" id="confirmarMensaje" name="confirmarMensaje"><span class="glyphicon glyphicon-ok"></span>Regresar a la página estudiante</button>                    
                </div>
            </header>
        </div>
    </body>
</html>
