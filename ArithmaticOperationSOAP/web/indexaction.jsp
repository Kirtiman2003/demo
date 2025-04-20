<%-- 
    Document   : indexaction
    Created on : 20 Apr, 2025, 3:44:54 PM
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
            String add = request.getParameter("add");
            String sub = request.getParameter("sub");
            
            float temp1 = Float.parseFloat(val1);
            float temp2 = Float.parseFloat(val2);

            float result = 0;
            float result1 = 0;

            if (add != null && add.equals("Addition")) {
                result = port.addition(temp1, temp2);
                out.println("Addition of Two number is  " + result);
            } else if (sub != null && sub.equals("Sub")) {
                result1 = port.subtraction(temp1, temp2);
                out.println("Subtraction of Two number is  " + result1);
            }
            
            
         %>
       
             
    </body>
</html>
