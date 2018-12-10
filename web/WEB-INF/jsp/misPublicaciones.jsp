<%-- 
    Document   : misPublicaciones
    Created on : 09-dic-2018, 14:06:03
    Author     : JulianCamilo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>BeMonitor</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link rel="icon" type="image/png" href="<c:url value="/assets/img/favicon.png" />" >
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/assets/img/favicon.ico" />">
        <link rel="apple-touch-icon" href="<c:url value="/assets/img/apple-touch-icon.png"/>">
        <link rel="apple-touch-icon" sizes="72x72" href="<c:url value="/assets/img/apple-touch-icon-72x72.png"/>">
        <link rel="apple-touch-icon" sizes="114x114" href="<c:url value="/assets/img/apple-touch-icon-114x114.png"/>">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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
            <div class="row">
                <h1>Mis Inquietudes</h1>
                <c:out value="${error}" default=""/>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Tema</th>
                            <th>Descripción</th>
                            <th>Fecha publicación</th>
                            <th>Estado</th>
                            <th>Monitor</th>
                            <th>Fecha</th>
                            <th>Hora</th>
                    <tbody>
                        <c:forEach items="${respuestas}" var="respuestas">
                            <tr>
                                <td><c:out value="${respuestas.tema}" /></td>
                                <td><c:out value="${respuestas.descripcion}" /></td>
                                <td><c:out value="${respuestas.fechaPublicacion}" /></td>
                                <td><c:out value="${respuestas.respuesta}" /></td>
                                <td><c:out value="${respuestas.nombre} ${respuestas.apellido}" default="Sin respuesta aun" /></td>
                                <td><c:out value="${respuestas.fechaRespuesta}" default="Sin respuesta aun" /></td>
                                <td><c:out value="${respuestas.hora}" default="Sin respuesta aun" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                        </tr>
                    </thead>
                </table>
            </div>
        </div>
    </body>
</html>
