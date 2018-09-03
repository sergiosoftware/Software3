<%-- 
    Document   : gestionarEvaluacionParaMonitoresConfirmarCreacion
    Created on : 21/10/2017, 07:54:18 PM
    Author     : sergioandres
--%>

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
            <header class="col-xs-12"><h1 align="center">Gestionar evaluación para monitor</h1>
                <br>
                <h3 align="center">Pregunta registrada con éxito</h3>
            </header>
            <form:form method="post" class="form-horizontal col-xs-8" commandName="respuestaregistropregunta">
                <div class=" col-xs-11">                    
                    <div class="col-xs-offset-4 col-xs-12 container" align="center">
                        <br>
                        <br>
                        <br>
                        <br>
                        <h4>¿Desea continuar con la</h4>
                        <h4>gestión de pregunta?</h4> 
                    </div>
                    <div class="col-xs-offset-4 col-xs-12 container" align="center">
                        <button type="reset" class="btn btn-info" id="btnRespuestaPreguntaContinuar"><span class="glyphicon glyphicon-ok"></span>CONTINUAR</button>   
                        <button type="reset" class="btn btn-danger" id="btnRespuestaPreguntaCancelar"><span class="glyphicon glyphicon-remove"></span>TERMINAR</button>                     
                    </div>                        
                </div>
            </form:form>
        </div>		
    </body>
</html>

