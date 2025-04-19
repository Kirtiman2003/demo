<%-- 
    Document   : indexaction
    Created on : 19 Apr, 2025, 1:16:50 PM
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
            tycs.Tempwebservice port =obj.getTempwebservicePort();
            String val=request.getParameter("txt");
            float temp=Float.parseFloat(val);
            float result1=port.convertFtoC(temp);
            float result2=port.convertCtoF(temp);
            out.println("Temperature conversion from F to C: "+result1);
            %>
            </br>
            <%
                out.println("Temperature conversion from C to F: "+result2);
                %>
        
    </body>
</html>
