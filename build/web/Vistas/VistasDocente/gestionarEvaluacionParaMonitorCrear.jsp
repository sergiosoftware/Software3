<%-- 
    Document   : gestionarEvaluacionParaMonitorCrear
    Created on : 22/10/2017, 01:47:02 AM
    Author     : sergioandres
--%>

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
           <header class="col-xs-12"><h1 align="center">Gestionar evaluación para monitor</h1>
            </header>
            <div class="panel panel-primary">                
                <div class="panel-body">                                          
                        <form:form method="post" commandName="gestionarevaluacion">                            
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />
                                <div class="col-xs-offset-2 col-xs-12 container">                                   
                                    <p> 
                                       <div class="col-xs-offset-0 col-xs-4">                                  
                                        <br>
                                        <br>
                                        <br>
                                        <form:label path="codigo">Asignatura</form:label>
                                        <select>
                                            <option value="#">Seleccionar Asignatura</option>
                                            <option value="#">#</option>
                                            <option value="#">#</option>
                                            <option value="#">#</option>
                                        </select>
                                        </div>  
                                        <div class="col-xs-offset-0 col-xs-6">
                                        <br>
                                        <br>
                                        <br>
                                        <h4 align="right"><span class="glyphicon glyphicon-question-sign"></span> Número de preguntas realizadas<h4>
                                        </div>
                                    </p>                                    
                                </div> 
                                <div class="col-xs-offset-0 col-xs-12">
                                    <hr>
                                </div>                          
                            <div class="col-xs-offset-2 col-xs-12 container">     
                                    <p> 
                                    <form:label path="pregunta">Enunciado de la pregunta</form:label> 
                                        <textarea rows="4" cols="30" placeholder="">
                                        </textarea>  
                                    <input action="/action_page.php" type="file" name="imagenE" accept="image/png,image/jpeg"><span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"></span> </input>
                                                                       
                                </p>                                
                            </div>
                            <div class="col-xs-offset-0 col-xs-12">
                                    <hr size=10>
                            </div> 
                            <div class="col-xs-offset-2 col-xs-12 container">
                                <p>
                                    <form action="/action_page.php" method="get">
                                        <h3 align="center">Opciones de respuesta</h3>
                                        <textarea rows="2" cols="30" placeholder="Opcion 1">
                                        </textarea>
                                        <input type="radio" name="opcion" value="opcion1"> Marcar como correcta<br>
                                        <textarea rows="2" cols="30" placeholder="Opcion 2">
                                        </textarea>
                                        <input type="radio" name="opcion" value="opcion2"> Marcar como correcta<br>
                                        <textarea rows="2" cols="30" placeholder="Opcion 3">
                                        </textarea>
                                        <input type="radio" name="opcion" value="opcion3"> Marcar como correcta<br> 
                                        <textarea rows="2" cols="30" placeholder="Opcion 4">
                                        </textarea> 
                                        <input type="radio" name="opcion" value="opcion4"> Marcar como correcta<br> 
                                    </form>                                                                   
                               </p>
                            </div> 
                            <div class="col-xs-offset-0 col-xs-12 container" align="center">
                                <button type="reset" class="btn btn-info" id="btnGuardarPregunta">Guardar pregunta</button>   
                                <button type="reset" class="btn btn-danger" id="btnCancelarPregunta">Cancelar</button>  
                            </div> 
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
