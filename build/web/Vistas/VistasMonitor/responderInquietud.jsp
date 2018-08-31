<%-- 
    Document   : responderInquietud
    Created on : 7/10/2017, 10:44:06 PM
    Author     : sergioandres
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>BeMonitor</title>
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Favicons
            ================================================== -->
        <link rel="icon" type="image/png" href="<c:url value="/assets/img/favicon.png" />" >
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/assets/img/favicon.ico" />">
        <link rel="apple-touch-icon" href="<c:url value="/assets/img/apple-touch-icon.png"/>">
        <link rel="apple-touch-icon" sizes="72x72" href="<c:url value="/assets/img/apple-touch-icon-72x72.png"/>">
        <link rel="apple-touch-icon" sizes="114x114" href="<c:url value="/assets/img/apple-touch-icon-114x114.png"/>">

        <!-- Bootstrap -->
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/bootstrap.css" />">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/fonts/font-awesome/css/font-awesome.css"/>">

        <!-- Stylesheet
            ================================================== -->
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/style.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/prettyPhoto.css"/>" >
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700,900,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="<c:url value="/assets/js/modernizr.custom.js"/>" ></script>

    </head>
    <body>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Formulario</div>
                <div class="panel-body">

                    
                    <form action="responderInquietud" method="POST">
                        <p>
                            <form:label path="codigo">Fecha:</form:label>
                            <form:input path="codigo" cssClass="form-control" />

                        </p>
                        <button class="btn btn-success" id="agregarHoraro" name="agregarHorario">Agregar Horario</button>
                        <button class="btn btn-success" id="enviarRespuesta" name="enviarRespuesta" type="submit">Enviar Respuesta</button>
                        <input type="submit" value="Enviar" class="btn btn-danger" />
                    </form>
                </div>
            </div>

        </div>
        <h1>Hello World!</h1>
    </body>
</html>
