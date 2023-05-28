<%-- 
    Document   : ageCalculator
    Created on : 28-May-2023, 12:05:48 PM
    Author     : Victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head></head>
        <title>Week3Lab_Calculators</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div>
            <form method="post" action="age">
                <h1>AGE CALCULATOR</h1>
                <label for="ageNumber">Enter your age</label>
                <input type="number" name="ageNumber">
                <input type="submit" value="Age Next Birthday">
            </form>
            <br>
            <p>${next_age}</p>
            <br>
            <a href="./math" target="_blank">Arithmatic Calculator</a>
            
        </div>
    </body>
</html>
