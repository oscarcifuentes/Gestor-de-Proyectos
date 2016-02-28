<%-- 
    Document   : registro
    Created on : 6/02/2016, 10:55:50 PM
    Author     : OSCAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO </title>
        <link rel="stylesheet" href="estilos.css">
    </head>
 <body>
        <div id="d3">
            <center>
                <h1>REGISTRO</h5>
                    <form action="registro" method="post">
                        <h2>Nombre</h1>
                        <input type="text" name="Nombre"/><br>
                        <h2>Apellido</h2>
                        <input type="text" name="Apellido"/><br>
                        <h2>Usuario</h3>
                        <input type="text" name="Usuario" /><br>
                        <h2>Contraseña</h5>
                        <input type="password" name="PASSWORD"/><br>
                        <br>
                        <input type="submit" value="Registrar" id="registrar" />
                    </form>
                </center>
           </div>
        </body>
 </html>
