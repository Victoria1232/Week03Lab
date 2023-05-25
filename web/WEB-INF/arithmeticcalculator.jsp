<%-- 
    Document   : arithmeticcalculator
    Created on : May 25, 2023, 12:59:42 PM
    Author     : mfgperez
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
            <label>First: </label><input type="text" name="first" ><br>  
            <label>Second: </label><input type="text" name="second" ><br>  
         <input type="button" value="+" ><br>  
         <input type="button" value="-" >
         <input type="button" value="*" > 
         <input type="button" value="%" > 
        </form>
    </body>
</html>
