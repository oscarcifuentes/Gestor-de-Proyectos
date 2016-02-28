<%-- 
    Document   : CrearProyecto
    Created on : 21/02/2016, 07:57:16 PM
    Author     : OSCAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CREAR UN PROYECTO NUEVO </title>
        <link rel="stylesheet" href="estilos.css">
    </head>
 <body>
        <div id="d3">
            <center>
                <h1>RCREAR UN PROYECTO NUEVO</h1>
                    <form action="" method="post">
                        <h2>Nombre De Proyecto</h2>
                        <input type="text" name="NombreProyecto"/><br>
                        <h2>Fecha Inicio</h2>
                        <input type="date" name="FechaI"/><br>
                        <h2>Fecha Culminacion</h2>
                        <input type="date" name="Usuario" /><br>
                        <h2>Primer Responsable</h2>
                        <input type="tex" name="R1"/><br>
                        <h2>Segundo Responsable</h2>
                        <input type="tex" name="R2"/><br>
                        <h2>Tercer Responsable</h2>
                        <input type="tex" name="R3"/><br>
                        <h2>Cuarto Responsable</h2>
                        <input type="tex" name="R4"/><br>
                        <br>
                        <h2>Descripcion Del Proyecto</h2>
                        <input type="tex" name="descripcion"/><br>
                        <br>
                        <input type="submit" value="Crear Proyecto" id="registrar" />
                    </form>
                </center>
           </div>
        </body>
 </html>
