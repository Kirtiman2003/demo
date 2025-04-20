<%-- 
    Document   : PrimeCheck
    Created on : 20-Apr-2025, 8:49:26 pm
    Author     : OM SHUKLA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Prime Check Result</title>
    </head>
    <body>
       <h1>Prime Check</h1><hr/>
<%
int number = Integer.parseInt(request.getParameter("primeNum"));
try {
    com.dd.Prim service = new com.dd.Prim();
    com.dd.PrimSoap port = service.getPrimSoap();
    boolean result = port.isPrime(number);
    if(result) {
        out.println(number + " is a Prime Number.");
    } else {
        out.println(number + " is NOT a Prime Number.");
    }
} catch (Exception ex) {
    out.println("Error: " + ex.getMessage());
}
%>
<hr/>
    </body>
</html>
