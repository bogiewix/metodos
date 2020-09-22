<%-- 
    Document   : Response
    Created on : 21/09/2020, 09:50:09 PM
    Author     : main
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response/title>
    </head>
    <body>
        <h1>Estudiante</h1>
        <jsp:useBean id="mybean" scope="session" class="co.edu.unipiloto.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        Nombre:
        <jsp:getProperty name="mybean" property="name"/>
        <p><jsp:setProperty name="mybean" property="anonaciemiento"/>
        Edad:
        <jsp:getProperty name="mybean" property="anonaciemiento"/></p>
        <p><jsp:setProperty name="mybean" property="anoingreso"/>
        Año de ingreso:
        <jsp:getProperty name="mybean" property="anoingreso"/></p>
        <p><jsp:setProperty name="mybean" property="semestre"/>
        Semestre:
        <jsp:getProperty name="mybean" property="semestre"/></p>
    </body>
</html>
