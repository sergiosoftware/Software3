<%-- 
    Document   : add
    Created on : 22-sep-2017, 16:08:47
    Author     : sergioandres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <ol class="breadcrumb">
                <li><a href="<c:url value="/listAsignatura.htm" />">Lista de asignaturas</a></li>
                <li class="active">Agregar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Formulario</div>
                <div class="panel-body">

                    <form:form method="post" commandName="asignatura">
                        <h1>Complete el formulario</h1>

                        <p>
                            <label path="codigo">Codigo:</label>
                            <input path="codigo" cssClass="form-control" />

                        </p>

                        <p>
                            <label path="nombre">Nombre:</label>
                            <input path="nombre" cssClass="form-control" />

                        </p>

                        <p>
                            <label path="creditos">Creditos:</label>
                            <input path="creditos" cssClass="form-control" />
                        </p>

                        <hr />
                        <input type="submit" value="Enviar" class="btn btn-danger" />
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
