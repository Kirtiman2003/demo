<%-- 
    Document   : indexaction
    Created on : 20 Apr, 2025, 4:15:27 PM
    Author     : kirti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             tycs.Tempwebservice_Service obj = new tycs.Tempwebservice_Service();
            tycs.Tempwebservice port = obj.getTempwebservicePort();
            String val1 = request.getParameter("num1");
           
            
            
            float temp1= Float.parseFloat(val1);
           
            float result = port.square(temp1);
            out.println("Sqaure of TWo number is  "+ result);
         %>
    </body>
</html>
