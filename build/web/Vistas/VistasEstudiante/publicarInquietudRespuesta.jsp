<%-- 
    Document   : publicarInquietudRespuesta
    Created on : 7/10/2017, 10:11:46 PM
    Author     : sergioandres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <title>BeMonitor</title>
    </head>
    <body >
	<div class="container">
            <header class="col-xs-12"><h1 align="center">Inquietud publicada con éxito</h1></header>
                <form:form method="post" class="form-horizontal col-xs-8" commandName="respuestainquietud">
                    <div class="form-group">
			<label class="control-label col-xs-3">Asignatura:</label>
                            <div class="col-xs-7">
				<input class="form-control" id="inputAsignaturaRespuesta" placeholder="Asignatura">
                            </div>
                    </div>
                    <div class="form-group">
			<label class="control-label col-xs-3">Tema:</label>
                            <div class="col-xs-7">
                                <input class="form-control" id="inputTemaRespuesta" placeholder="Tema">
                            </div>
                    </div>
                    <div class="form-group">
			<label class="control-label col-xs-3">Fecha de publicación:</label>
                            <div class="col-xs-7">
                                <input type="date" class="form-control" id="inputFecharespuesta" placeholder="Usuario">
                            </div>
                    </div>
                    <div class=" col-xs-11">                    
                        <div class="col-xs-offset-3 col-xs-9" align="center">
                            <h4>Su inquietud esta a la espera de una respuesta de un monitor</h4>
                            <h6>Recuerde que dispone de 3 días antes de que la inquietud pase</h6>
                            <h6>a estado "vencido" donde el profesor será el encargado de</h6>
                            <h6>responderla.</h6>  
                            <button type="reset" class="btn btn-danger" id="btnPublicarInquietudContinuar"><span class="glyphicon glyphicon-ok"></span>Continuar</button>                      
                        </div>
                    </div>
		</form:form>
        </div>		
    </body>
</html>
