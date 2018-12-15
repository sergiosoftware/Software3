<%-- 
    Document   : perfilUsuario
    Created on : 14-dic-2018, 17:39:07
    Author     : JulianCamilo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href="<c:url value="/assets/img/favicon.png" />" >
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/assets/img/favicon.ico" />">
        <link rel="apple-touch-icon" href="<c:url value="/assets/img/apple-touch-icon.png"/>">
        <link rel="apple-touch-icon" sizes="72x72" href="<c:url value="/assets/img/apple-touch-icon-72x72.png"/>">
        <link rel="apple-touch-icon" sizes="114x114" href="<c:url value="/assets/img/apple-touch-icon-114x114.png"/>">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <!-- Bootstrap -->
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/bootstrap.css" />">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/fonts/font-awesome/css/font-awesome.css"/>">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil de Usuario</title>
        
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/style.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/prettyPhoto.css"/>" >
        <script type="text/javascript" src="<c:url value="/assets/js/modernizr.custom.js"/>" ></script>
    </head>
    <body>
        <div class="container">
            <div class="header col-xs-12">
                <diiv class="col-xs-4 img-responsive imagenUsusairo">
                    <img src="<c:url value="/assets/img/team/admin.png"/>">
                </diiv>
                <div class="col-xs-8 text-justify">
                    <label><h1><c:out value="${usuario.nombre}" default="Nombre de prueba 1 "/>
                            <c:out value="${usuario.apellido}" default="Apellido de prueba 1"/></h1>
                    </label>
                </div>
                
            </div>
            <div class="nav col-xs-12">
                <div class="col-xs-6 text-justify info">
                    <label><h2>Correo: <c:out value="${usuario.correo}" default="example@example.com"/></h2></label>
                </div>
                <div class="col-xs-6 text-justify info">
                    <label><h2>Programa: <c:out value="${usuario.programa}" default="Ingenieria de sistemas"/></h2></label>
                </div>
                    <c:choose>
                        <c:when test="${usuario.monitor==true}">
                            <div class="col-xs-6 text-justify info">
                                <label><h2>Es Monitor.</h2></label>
                            </div>
                            <div class="col-xs-6 text-justify info">
                                <label><h2>Calificacion: <c:out value="${usuario.calificacion}" default="0"/></h2></label>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="col-xs-6 text-justify info">
                                <label><h2>Aun no es monitor.</h2></label>
                            </div>
                        </c:otherwise>
                    </c:choose>
            </div>
        </div>
    </body>
</html>
