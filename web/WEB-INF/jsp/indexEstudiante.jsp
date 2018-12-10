<%-- 
    Document   : index
    Created on : 5/01/2018, 06:28:42 PM
    Author     : sergioandres
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>BeMonitor</title>
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Favicons
            ================================================== -->
        <link rel="icon" type="image/png" href="<c:url value="/assets/img/favicon.png" />" >
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/assets/img/favicon.ico" />">
        <link rel="apple-touch-icon" href="<c:url value="/assets/img/apple-touch-icon.png"/>">
        <link rel="apple-touch-icon" sizes="72x72" href="<c:url value="/assets/img/apple-touch-icon-72x72.png"/>">
        <link rel="apple-touch-icon" sizes="114x114" href="<c:url value="/assets/img/apple-touch-icon-114x114.png"/>">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <!-- Bootstrap -->
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/bootstrap.css" />">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/fonts/font-awesome/css/font-awesome.css"/>">

        <!-- Stylesheet
            ================================================== -->
        <link rel="stylesheet" type="text/css"  href="<c:url value="/assets/css/style.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/prettyPhoto.css"/>" >
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700,900,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="<c:url value="/assets/js/modernizr.custom.js"/>" ></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
              <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
              <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <!-- Navigation
            ==========================================-->
        <nav id="menu" class="navbar navbar-default navbar-fixed-top">
            <div class="container"> 
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a class="navbar-brand" href="index.htm"><i class="fa fa-sun-o"></i> BeMonitor<strong></strong></a> </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#home" class="page-scroll">Home</a></li>
                        <li><a href="#services-section" class="page-scroll">Servicios</a></li>
                        <li><a href="#works-section" class="page-scroll">Funciones</a></li>
                        <li><a href="#about-section" class="page-scroll">Sobre nosotros</a></li>
                        <li><a href="#team-section" class="page-scroll">EasySoluciones</a></li>
                        <li><a href="#contact-section" class="page-scroll">Contactanos</a></li>
                        <li><a href="perfil.htm" class="page-scroll"><c:out value="${usuario.nombre} ${usuario.apellido} "/><i class="fa fa-user-circle"></i></a></li>
                    </ul>
                </div>
                <!-- /.navbar-collapse --> 
            </div>
            <!-- /.container-fluid --> 
        </nav>

        <!-- Header -->
        <header class="text-center" name="home">
            <div class="intro-text">
                <h1>Bienvenido a  <strong>BeMonitor</strong></h1>
                <p>La mejor solución para dudas educativas</p>
                <a href="#services-section" class="btn btn-default btn-lg page-scroll">DETALLES</a> </div>
        </header>

        <!-- Services Section -->
        <div id="services-section" class="text-center">
            <div class="container">
                <div class="section-title center">
                    <h2>Nuestras Opciones</h2>
                    <hr>
                    <div class="clearfix"></div>
                    <p>Este es un pequeño vistaso a nuestros servicios</p>
                </div>
                <div class="space"></div>
                <div class="row">
                    <div class="col-md-3 col-sm-6 service"> <i class="fa fa-desktop"></i>
                        <h4>Resolucion de dudas</h4>
                        <p>Podras preguntrar tranquilamente cualquier duda sobre cualquier materia que desees.</p>
                    </div>
                    <div class="col-md-3 col-sm-6 service"> <i class="fa fa-gears"></i>
                        <h4>Contactar con monitores</h4>
                        <p>Podras conocer y aprender de gente muy inteligente de cualquier area.</p>
                    </div>
                    <div class="col-md-3 col-sm-6 service"> <i class="fa fa-rocket"></i>
                        <h4>Nuevas oportunidades</h4>
                        <p>Podras encontrar una oportunidad para acercarte a la docencia</p>
                    </div>
                    <div class="col-md-3 col-sm-6 service"> <i class="fa fa-line-chart"></i>
                        <h4>Mejora academica</h4>
                        <p>Te ayudamos a mejorar y alcanzar mejores notas en toda asignatura.</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Portfolio Section -->
        <div id="works-section">
            <div class="container"> <!-- Container -->
                <div class="section-title text-center center">
                    <h2>Nuestros servicios</h2>
                    <hr>
                    <div class="clearfix"></div>
                    <p>Diferentes funcionalidades dadas en el sistema para tu.</p>
                </div>
                <!--<div class="categories">
                  <ul class="cat">
                    <li>
                      <ol class="type">
                        <li><a href="#" data-filter="*" class="active">All</a></li>
                        <li><a href="#" data-filter=".web">Web Design</a></li>
                        <li><a href="#" data-filter=".app">App Development</a></li>
                        <li><a href="#" data-filter=".branding">Branding</a></li>
                      </ol>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>-->
                <div class="row">
                    <div class="portfolio-items">
                        <div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Presentar Evaluación para Monitor<br>
                                    <a  href="PresentarEvaluacionParaMonitor.htm">
                                    <div class="hover-text">
                                        <h4>Presentar Evaluación para Monitor</h4>
                                        <small>Presentar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                    </a>
                                    <img src="<c:url value="/assets/img/portfolio/01.jpg"/>" class="img-responsive" alt="Presentar Evaluación para Monitor"> </a> </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3 col-lg-3 app">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Calificar Monitor
                                <a href="VistaCalificarMonitor.htm">
                                    <div class="hover-text">
                                        <h4>Calificar Monitor</h4>
                                        <small>Calificar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                                    <img src="<c:url value="/assets/img/portfolio/02.jpg"/>" class="img-responsive" alt="Calificar Monitor"> </a> </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Visualizar Nota<br>
                                <a  href="VisualizarNota.htm">
                                    <div class="hover-text">
                                        <h4>Visualizar Nota</h4>
                                        <small>Visualizar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                                    <img src="<c:url value="/assets/img/portfolio/09.jpg"/>" class="img-responsive" alt="Visualizar Nota"> </a> </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Mis publicaicones<br>
                                    <a  href=<c:url value="misPublicaciones.htm?codigo=${usuario.codigo}"/>>
                                    <div class="hover-text">
                                        <h4>Mis publicaicones</h4>
                                        <small>Presentar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                    </a>
                                    <img src="<c:url value="/assets/img/portfolio/04.jpg"/>" class="img-responsive" alt="Presentar Evaluación para Monitor"> </a> </div>
                            </div>
                        </div>
                        <!--<div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> <a href="publicarInquietudRespuesta.htm">Publicar Inquietud Respuesta</a><br>
                                    <div class="hover-text">
                                        <h4>Publicar Inquietud Respuesta</h4>
                                        <small>Publicar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                    <img src="<c:url value="/assets/img/portfolio/04.jpg"/>" class="img-responsive" alt="Publicar Inquietud Respuesta"> </a> </div>
                            </div>
                        </div>-->
                        <div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Publicar Inquietud</a><br>
                                
                                <a href=<c:url value="publicarInquietud.htm?codigo=${usuario.codigo}"/>>
                                    <div class="hover-text">
                                        <h4>Publicar Inquietud</h4>
                                        <small>Publicar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                                    <img src="<c:url value="/assets/img/portfolio/05.jpg"/>" class="img-responsive" alt="Publicar Inquietud"> </a> </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3 col-lg-3 web">
                            <div class="portfolio-item">
                                <div class="hover-bg"> Visualizar Nota Informe</a><br>
                                <a href="visualizarNotaInforme.jsp">
                                    <div class="hover-text">
                                        <h4>Visualizar Nota Informe</h4>
                                        <small>Visualizar</small>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                                    <img src="<c:url value="/assets/img/portfolio/06.jpg"/>" class="img-responsive" alt="Visualizar Nota Informe"> </a> </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- About Section -->
    <div id="about-section">
        <div class="container">
            <div class="section-title text-center center">
                <h2>Sobre nosotros</h2>
                <hr>
                <div class="clearfix"></div>
                <p>BeMonitor desarrollada por el equipo EasySoluciones, atento a necesidades de los demas</p>
            </div>
            <div class="row">
                <div class="col-md-6"> <img src="<c:url value="/assets/img/about.jpg"/>" class="img-responsive"> </div>
                <div class="col-md-6">
                    <div class="about-text">
                        <h4>Quienes somos</h4>
                        <p>Somos Easysoluciones, un equipo de desarrollo de software dedicado a solucionar de la forma mas facil los problemas de las personas</p>
                        <h4>Que hacemos</h4>
                        <p>Desarrollamos software de cualquier clase, con la mas alta calidad</p>
                        <h4>Porque escogernos</h4>
                        <p>Nuestras soluciones son las mas faciles y eficientes a los problemas que se puedan presentar en la vida diaria</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Achievements Section -->
    <div id="achievements" class="section dark-bg">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-3">
                    <div class="achievement-box"> <span class="count">210</span>
                        <h4>Clientes felices</h4>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3">
                    <div class="achievement-box"> <span class="count">9,500</span>
                        <h4>Horas trabajadas</h4>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3">
                    <div class="achievement-box"> <span class="count">590</span>
                        <h4>Proyectos completados</h4>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3">
                    <div class="achievement-box"> <span class="count">14</span>
                        <h4>Premios ganados</h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Team Section -->
    <div id="team-section" class="text-center">
        <div class="container">
            <div class="section-title center">
                <h2>Conocenos</h2>
                <hr>
                <p>Conoce a todos los integrantes de EasySoluciones</p>
            </div>
            <div id="row">
                <div class="col-md-4 col-sm-6 team">
                    <div class="thumbnail"> <img src="<c:url value="/assets/img/team/admin.png"/>" alt="..." class="img-circle team-img">
                        <div class="caption">
                            <h3>Sergio Andres Cardona Garcia</h3>
                            <p>Founder / Development Engineer / Team leader</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 team">
                    <div class="thumbnail"> <img src="<c:url value="/assets/img/team/calidad.png"/>" alt="..." class="img-circle team-img">
                        <div class="caption">
                            <h3>Jhoan Sebastian Saldarriaga Villada</h3>
                            <p>Founder / Development Engineer / Quality Manager</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 team">
                    <div class="thumbnail"> <img src="<c:url value="/assets/img/team/soporte.png"/>" alt="..." class="img-circle team-img">
                        <div class="caption">
                            <h3>Julian Camilo Lopez Giraldo</h3>
                            <p>Founder / Development Engineer / Support Manager</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                </div>
                <!--<div class="col-md-3 col-sm-6 team">
                  <div class="thumbnail"> <img src="img/team/04.jpg" alt="..." class="img-circle team-img">
                    <div class="caption">
                      <h3>Larry Show</h3>
                      <p>Project Manager</p>
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    </div>
                  </div>
                </div>
                -->
            </div>
        </div>
    </div>
    <!-- Contact Section -->
    <div id="contact-section" class="text-center">
        <div class="container">
            <div class="section-title center">
                <h2>Contact Us</h2>
                <hr>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diamcommodo nibh ante facilisis.</p>
            </div>
            <div class="col-md-8 col-md-offset-2">
                <div class="col-md-4"> <i class="fa fa-map-marker"></i>
                    <p>4321 California St,<br>
                        San Francisco, CA 12345</p>
                </div>
                <div class="col-md-4"> <i class="fa fa-envelope-o"></i>
                    <p>info@company.com</p>
                </div>
                <div class="col-md-4"> <i class="fa fa-phone"></i>
                    <p> +1 123 456 1234</p>
                </div>
                <hr>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-8 col-md-offset-2">
                <h3>Leave us a message</h3>
                <form name="sentMessage" id="contactForm" novalidate>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" id="name" class="form-control" placeholder="Name" required="required">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="email" id="email" class="form-control" placeholder="Email" required="required">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <textarea name="message" id="message" class="form-control" rows="4" placeholder="Message" required></textarea>
                        <p class="help-block text-danger"></p>
                    </div>
                    <div id="success"></div>
                    <button type="submit" class="btn btn-default">Send Message</button>
                </form>
            </div>
        </div>
    </div>
</div>
<div id="social-section">
    <div class="container">
        <div class="social">
            <ul>
                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                <li><a href="#"><i class="fa fa-github"></i></a></li>
                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
            </ul>
        </div>
    </div>
</div>
<div id="footer">
    <div class="container">
        <div class="fnav">
            <p>Copyright &copy; BeMonitor. Designed by <a href="http://www.templatewire.com" rel="nofollow">TemplateWire</a></p>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> 
<script type="text/javascript" src="js/jquery.1.11.1.js"></script> 
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script type="text/javascript" src="<c:url value="/assets/js/bootstrap.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/SmoothScroll.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/jquery.counterup.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/waypoints.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/jquery.prettyPhoto.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/jquery.isotope.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/jqBootstrapValidation.js"/>"></script> 
<script type="text/javascript" src="<c:url value="/assets/js/contact_me.js"/>"></script> 

<!-- Javascripts
    ================================================== --> 
<script type="text/javascript" src="<c:url value="/assets/js/main.js"/>"></script>
</body>
</html>
