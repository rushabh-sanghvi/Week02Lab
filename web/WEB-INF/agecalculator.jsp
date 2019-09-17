<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 2:02:12 PM
    Author     : 794466
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action="age" method="post">
                Enter your age: <input type="text" name="agec" value="${agecalc}"><br><br>
                
                <input type="submit" value="Age next birthday"><br>
            </form>
               ${message}${agecalc}
        </div>
        <a href="http://localhost:8084/Week2Labs_Calculators/arithmetic"> Arithmetic Calculator
    </body>
</html>
