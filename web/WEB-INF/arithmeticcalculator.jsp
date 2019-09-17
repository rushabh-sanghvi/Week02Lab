<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2019, 2:15:28 PM
    Author     : 794466
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br>
        <form action="arithmetic" method="post">
            First   : <input type="text" name="first" ><br><br>
            Second : <input type="text" name="second" ><br><br>                   
        
        <input type="submit" value="+" name="button">
        <input type="submit" value="-" name="button">
        <input type="submit" value="*" name="button">
        <input type="submit" value="/" name="button">
        <br><br>
        <h2> ${message} ${totaln}<h2>
        <br> <a href="http://localhost:8084/Week2Labs_Calculators/age"> age calculator
    </body>
</html>
