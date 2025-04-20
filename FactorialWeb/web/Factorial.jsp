<%-- 
    Document   : Factorial
    Created on : 20-Apr-2025, 8:37:31 pm
    Author     : OM SHUKLA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Factorial</h1><hr/>
<%
int num = Integer.parseInt(request.getParameter("num"));
try {
    com.dd.Operation service = new com.dd.Operation();
    com.dd.OperationSoap port = service.getOperationSoap();
    int result = port.factorial(num);
    out.println("Factorial of " + num + " = " + result);
} catch (Exception ex) {
    out.println("Error: " + ex.getMessage());
}
%>
<hr/>
    </body>
</html>
