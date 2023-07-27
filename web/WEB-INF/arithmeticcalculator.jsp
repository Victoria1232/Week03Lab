<%-- 
    Document   : arithmeticcalculator
    Created on : May 25, 2023, 12:59:42 PM
    Author     : Victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            <label>First:  </label><input type="text" name="first" value="${first}" required><br>  
            <label>Second: </label><input type="text" name="second" value="${second}"  required><br>  
            <br>
          <input type="submit" value="+" name="+" >
          <input type="submit" value="-" name="-" >
          <input type="submit" value="*" name="*"> 
          <input type="submit" value="%" name="%"> 
        </form>
        
        <P>You entered: ${first} ${symbol} ${second}</P>
        <P>Results: ${result} </P>
        
        
         <a href="./age" name="ageLink">Age Calculator</a>
    </body>
</html>
