<%-- 
    Document   : Eliminar
    Created on : 9/03/2016, 09:29:32 AM
    Author     : OSCAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Proyecto</title>
    </head>
    <body>
       <h1>proyecto</h1>
        <form action="eliminar" method="POST" name="ver">
            <p>Ingrese  EL codigo del proyecto</p><input type="text" name="codigo"/>
            <input type="submit" value="Eliminar proyecto" name="buscar"/>
        </form>
    </body>
</html>
