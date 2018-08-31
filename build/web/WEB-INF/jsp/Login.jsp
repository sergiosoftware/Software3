<%-- 
    Document   : Login
    Created on : 8/01/2018, 10:39:48 PM
    Author     : sergioandres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--crear una directiva para poder levantar una sesion-->
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset="utf-8">
	<title>Login BeMonitor</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="<c:url value="/assets/login/css/animate.css"/>">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="<c:url value="/assets/login/css/style.css"/>">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Be <span>Monitor</span></span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
                    <form action="LoginServlet" method="POST">
                        <label for="username">Username</label>
			<br/>
                        <input type="text" id="txtUsername" name="txtUsername" placeholder="Nombre de usuario">
			<br/>
			<label for="password">Password</label>
			<br/>
                        <input type="password" id="txtPassword" name="txtPassword" placeholder="Contraseña">
			<br/>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <button type="submit" name="btnLogin" id="btnLogin">Sign In</button>
			<br/>
			<a href="#"><p class="small">Forgot your password?</p></a>
                    </form>			
		</div>
                <% 
                HttpSession sesion = request.getSession();
                String rol="";
                if(request.getAttribute("rol")!=null){
                    rol=(String)request.getAttribute("rol");
                    if(rol.equalsIgnoreCase("administrador")){
                        sesion.setAttribute("nombre", request.getAttribute("nombre"));
                        sesion.setAttribute("rol", rol);
                        response.sendRedirect("PerfilUsuarioAdmin.htm");
                        
                    }
                }
                %>
</body>

<script>
	$(document).ready(function () {
    	$('#logo').addClass('animated fadeInDown');
    	$("input:text:visible:first").focus();
	});
	$('#username').focus(function() {
		$('label[for="username"]').addClass('selected');
	});
	$('#username').blur(function() {
		$('label[for="username"]').removeClass('selected');
	});
	$('#password').focus(function() {
		$('label[for="password"]').addClass('selected');
	});
	$('#password').blur(function() {
		$('label[for="password"]').removeClass('selected');
	});
</script>

</html>