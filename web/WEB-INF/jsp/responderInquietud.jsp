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
<html>
    <head>
        <meta charset="utf-8" />
        <title>BeMonitor</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>
    <body>
        <div class="col-xs-12 container">                                        
            <form:form method="post" commandName="responderInquietud">
                <cemter>
                    <div class="modal-dialog container"> 
                        <h1>Responder Inquietud</h1>
                        El codigo es: <c:out value="${codigo}"/>
                        <br>
                        <br>
                        <label for="" >Fecha:</label><input type="date" id="fechaRespuesta" name="fechaRespuesta"> 
                        <br>
                        <br> 
                        <label for="">Hora inicio:</label><input type="time" id="horaInicioRespuesta" name="horaInicioRespuesta">   
                        <br>
                        <br>
                        <br>
                        <br>
                        <button class="btn btn-success" type="button" name="agregarHorarios" id="agregarHorarios">Agregar Horarios</button> 
                        <button class="btn btn-success" type="submit" name="enviarRespuesta" id="enviarRespuesta">Enviar Respuesta</button>
                        
                    </div> 
                </cemter> 
            </form:form>
            <c:out value="${respuesta}"></c:out>
        </div>
    </body>
</html>