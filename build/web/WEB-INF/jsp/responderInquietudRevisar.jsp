<%-- 
    Document   : responderInquietudRevisar
    Created on : 4/02/2018, 10:08:23 AM
    Author     : sergioandres
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>BeMonitor</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>
    <body>
        <div class="container">
            <header class="col-xs-12"><h1 align="center">Revisar Inquietudes</h1>
            </header>
            <div class="panel panel-primary">                
                <div class="panel-body">                                          
                    <form:form method="GET">                            
                        <form:errors path="*" element="div" cssClass="alert alert-danger" />
                        <div class="col-xs-offset-2 col-xs-12 container">                                   
                            <p> 
                            <div class="col-xs-offset-0 col-xs-4">                                  
                                <br>
                                <br>
                                <br>                                       
                            </div> 
                            </p>                                    
                        </div> 
                        <div class="col-xs-offset-0 col-xs-12">
                            <hr>
                        </div> 
                        <table class="table table-bordered table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>Tema</th>
                                    <th>descripción</th>
                                    <th>Fecha de publicación</th>
                                    <th>Nombre Estudiante</th>
                                    <th>Correo Estudiante</th>
                                    <th>Mas Detalles - Responder</th>
                                </tr>
                            </thead>                             
                            <tbody>
                                <c:forEach items="${respuestas}" var="respuestas">
                                    <tr>
                                        <td><c:out value="${respuestas.tema}" /></td>
                                        <td><c:out value="${respuestas.descripcion}" /></td>
                                        <td><c:out value="${respuestas.fechaPublicacion}" /></td>
                                        <td><c:out value="${respuestas.codigoEstudiante}" /></td>
                                        <td><c:out value="${respuestas.correo}" /></td>
                                        <td>
                                            <button href="<c:url value="generarReporteInquietudesFrecuentes.htm"></c:url>"class="btn boxed-action" id="responder-inquietud"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                            <a href="responderInquietud.htm?codigo=${respuestas.idInquietud}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>

                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>