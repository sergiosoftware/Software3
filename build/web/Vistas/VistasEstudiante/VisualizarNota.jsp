<%-- 
    Document   : VisualizarNota
    Created on : 30-oct-2017, 14:18:22
    Author     : JulianCamilo
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
        <title>Nota Examen</title>
    </head>
    <body class="body">
        <div class="container">
            <header class="col-xs-12">
                <h1 align="center">Ha realizado su examen con exito</h1>
                <h3><font color="red"><span class="glyphicon glyphicon-warning-sign"></span> NOTA: Recuerde que para aprobar la evaluación que acaba de realizar, su nota debe ser igual o superior a 4.0 </font></h3>
                <label>Su nota es: </label><br>
                <div align="center">
                    <button class="btn btn-info">Confirmar</button>
                </div>
            </header>
        </div>
    </body>
</html>
