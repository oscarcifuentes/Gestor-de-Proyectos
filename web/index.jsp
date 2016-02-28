<%-- 
    Document   : index
    Created on : 6/02/2016, 10:41:31 PM
    Author     : OSCAR
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
         <link rel="stylesheet" href="estilos.css">
        
    </head>
    <body>
   <div id="d3">
    <center>
        <h1>INICIAR SESION</h1>
        <form action="sesion" method="post">
            <h2>Usuario</h2>
            <input type="text" name="name"/><br>
             <h2>Contraseña</h3>
             <input type="password" name="pass"/><br><br>
            <input type="submit" value="Iniciar Sesion" id="iniciar" />
        </form>
        <br>
        <h4>Si no tienes usuario asignado por favor registrate ...</h4><a href="registro.jsp" id="a1">REGISTRO</a>
    </center>
   </div>
    </body>
</html>

