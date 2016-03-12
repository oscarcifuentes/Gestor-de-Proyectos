<%-- 
    Document   : MostrarProyectos
    Created on : 28/02/2016, 10:49:18 AM
    Author     : OSCAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PROYECTOS</title>
    </head>
    <body>
        <h1>proyecto</h1>
        <form action="mostrar" method="POST" name="ver">
            <p>INGRSE EL NOMBRE DEL PROYECTO</p><input type="text" name="proyectoNom"/>
            <input type="submit" value="Buscar proyecto" name="buscar"/>
        </form>
    </body>
</html>
