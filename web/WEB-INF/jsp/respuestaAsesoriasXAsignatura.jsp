<%-- 
    Document   : respuestaPublicarRespuesta
    Created on : 28-mar-2019, 16:20:37
    Author     : JulianCamilo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@page contentType="text/html; charset=UTF-8"%>

<c:forEach items="${respuestas}" var="respuestas">
<json:object>
    <json:property name="idasesoria" value="${respuestas.idasesoria}"/>
    <json:property name="codigoAsignatura" value="${respuestas.codigoAsignatura}"/>
    <json:property name="tema" value="${respuestas.tema}"/>
    <json:property name="fechaPublicacion" value="${respuestas.fechaPublicacion}"/>
    <json:property name="estudiante" value="${respuestas.codigoEstudiante}"/>
    <json:property name="nombre" value="${respuestas.nombre}"/>
    <json:property name="apellido" value="${respuestas.apellido}"/>
    <json:property name="programa" value="${respuestas.programa}"/>
    <json:property name="correo" value="${respuestas.correo}"/>
</json:object>
</c:forEach>