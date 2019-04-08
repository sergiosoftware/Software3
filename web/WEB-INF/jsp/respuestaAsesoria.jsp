<%-- 
    Document   : respuestaAsesorias
    Created on : 28-mar-2019, 16:20:17
    Author     : JulianCamilo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@page contentType="text/html; charset=UTF-8"%>
    <json:object>
        <json:property name="idasesoria" value="${respuesta.idasesoria}"/>
        <json:property name="codigoAsignatura" value="${respuesta.codigoAsignatura}"/>
        <json:property name="tema" value="${respuesta.tema}"/>
        <json:property name="fechaPublicacion" value="${respuesta.fechaPublicacion}"/>
        <json:property name="estudiante" value="${respuesta.codigoEstudiante}"/>
    </json:object>
