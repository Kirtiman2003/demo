<%-- 
    Document   : indexaction
    Created on : 20 Apr, 2025, 3:21:04 PM
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
            String val3 = request.getParameter("num3");
            
            float temp1= Float.parseFloat(val1);
            float temp2 = Float.parseFloat(val2);
            float temp3 = Float.parseFloat(val3);
            float result = port.addition(temp1, temp2, temp3);
            out.println("Addition of Three number is  "+ result);
         %>
          
            
            
    </body>
</html>
