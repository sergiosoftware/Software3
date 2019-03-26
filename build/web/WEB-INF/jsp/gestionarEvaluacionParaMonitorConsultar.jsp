<%-- 
    Document   : gestionarEvaluacionParaMonitorConsultar
    Created on : 22/10/2017, 01:59:19 PM
    Author     : sergioandres
--%>

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
            <header class="col-xs-12"><h1 align="center">Consultar evaluación para monitor</h1>
            </header>
            <div class="panel panel-primary">                
                <div class="panel-body">                                          
                        <form:form method="post" commandName="gestionarevaluacion">            
                                <div class="col-xs-offset-2 col-xs-12 container">                                   
                                    <p> 
                                        <div class="col-xs-offset-0 col-xs-4">                                  
                                            <br>
                                            <br>
                                            <br>
                                            <table class="table table-bordered table-striped table-hover">
                                                <thead>
                                                    <tr>
                                                        <th><label path="#">Asignatura</label></th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${asignatura}" var="asig">
                                                        <tr>
                                                            <td>
                                                                <select name="" id="">
                                                                    <c:option value="${asig.nombre}"/>"${asig.nombre}"</option>
                                                                </select>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>                                        
                                        </div> 
                                    </p>                                    
                                </div> 
                                <div class="col-xs-offset-0 col-xs-12">
                                    <hr>
                                </div> 
                                <table class="table table-bordered table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th>Enunciado</th>
                                            <th>Imagen adjunta</th>
                                            <th>Opciones de respuesta</th>
                                            <th>Editar - Eliminar</th>
                                        </tr>
                                    </thead> 
                                    
                                        <dialog id="confirm-delete" class="site-dialog">
                                            <header class="dialog-header">
                                                <h1>¿Desea eliminar esta pregunta?</h1>
                                            </header>
                                            <div class="btn-group cf">
                                                <button class="btn btn-info" id="delete">Confirmar</button>
                                                <button class="btn btn-danger" id="cancelar">Cancelar</button>
                                            </div>
                                        </dialog>                             
                                        <tbody>
                                        <c:forEach items="${inquietud}" var="inq">
                                            <tr>
                                                <td><c:out value="${inq.descripcion}" /></td>
                                                <td><c:out value="${inq.nombre}" /></td>
                                                <td><c:out value="${inq.creditos}" /></td>
                                                <td>
                                                    <button href="<c:url value="gestionarEvaluacionParaMonitorEditar.htm?codigo=${inq.idInquietud}" />"  class="btn boxed-action"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button>
                                                    <button href="#" class="btn boxed-action" id="delete-account"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                                                        <script type="text/javascript">
                                                            (function($) {
                                                                'use strict';
                                                                var $accountDelete = $('#delete-account'),
                                                                $accountDeleteDialog = $('#confirm-delete');
                                                                $accountDelete.on('click', function() {
                                                                $accountDeleteDialog[0].show();
                                                                });
                                                                $('#cancelar').on('click', function() {
                                                                $accountDeleteDialog[0].close();
                                                                });
                                                            })(jQuery);
                                                        </script>
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