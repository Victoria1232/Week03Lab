<%-- 
    Document   : agecalculator
    Created on : May 24, 2023, 3:44:23 PM
    Author     : mfgperez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="author" content="Marcel Gallardo"> 
        <meta name="description" content="Week 3 Lab 2. age calculator ">

   
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        
        <form method="post" action="/age">
            <label>Enter Age</label><input type="number" id="age"><br>
            <input type="submit" value="Age Next Birthday">
                  
        </form>
    </body>
</html>
