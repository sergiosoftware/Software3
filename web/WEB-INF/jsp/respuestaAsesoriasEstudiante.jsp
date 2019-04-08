<%-- 
    Document   : respuestaAsesoriasEstudiante
    Created on : 08-abr-2019, 0:34:26
    Author     : JulianCamilo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@page contentType="text/html; charset=UTF-8"%>

<c:forEach items="${respuestas}" var="respuestas">
    <p>
<json:object>
    <json:property name="idasesoria" value="${respuestas.idasesoria}"/>
    <json:property name="Asignatura" value="${respuestas.nombre}"/>
    <json:property name="codigoAsignatura" value="${respuestas.codigoAsignatura}"/>
    <json:property name="tema" value="${respuestas.tema}"/>
    <json:property name="fechaPublicacion" value="${respuestas.fechaPublicacion}"/>
    <json:property name="estudiante" value="${respuestas.codigoEstudiante}"/>
</json:object>
    </p>
</c:forEach>
