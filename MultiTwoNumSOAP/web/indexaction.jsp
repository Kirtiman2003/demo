<%-- 
    Document   : indexaction
    Created on : 20 Apr, 2025, 3:01:51 PM
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
            String val = request.getParameter("txt");
            String val1 = request.getParameter("txt1");
            int temp = Integer.parseInt(val);
            int temp1 = Integer.parseInt(val1);
            float result = port.multiply(temp, temp1);
            out.println("Multiplication of two number is " + result);
         %>
            
    </body>
</html>
