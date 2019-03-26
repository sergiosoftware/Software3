<%-- 
    Document   : add
    Created on : 22-sep-2017, 16:08:47
    Author     : sergioandres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>BeMonitor</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Lista Asignaturas</h1>
                <p>
                    <a href="<c:url value="addAsignatura.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Nombre</th>
                            <th>Creditos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${asignaturas}" var="asig">
                            <tr>
                                <td><c:out value="${asig.codigo}" /></td>
                                <td><c:out value="${asig.nombre}" /></td>
                                <td><c:out value="${asig.creditos}" /></td>
                                <td>
                                    <a href="<c:url value="editAsignatura.htm?codigo=${asig.codigo}" />"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
                                    <a href="<c:url value="deleteAsignatura.htm?codigo=${asig.codigo}" />"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
