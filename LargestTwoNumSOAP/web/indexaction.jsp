<%-- 
    Document   : indexaction
    Created on : 20 Apr, 2025, 4:23:41 PM
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
            String val2 = request.getParameter("num2");
           
            
            
            float temp1= Float.parseFloat(val1);
            float temp2= Float.parseFloat(val2);
           
            float result = port.largestOfTwoNumber(temp1, temp2);
            out.println("Largest number of given two number is   "+ result);
         %>
    </body>
    </body>
</html>
