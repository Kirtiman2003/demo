<%-- 
    Document   : Rsconvert
    Created on : 19-Apr-2025, 1:02:11 pm
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
       <h1>Converted Currency</h1>
<%-- start web service invocation --%><hr/>
<%
double num = Double.parseDouble(request.getParameter("txt1"));
try {
com.dd.Operation service = new com.dd.Operation();
com.dd.OperationSoap port = service.getOperationSoap();
// TODO initialize WS operation arguments here
double rs = num;
// TODO process result here
double result = port.rsconvert(rs);
out.println("Result = "+result);
} catch (Exception ex) {
// TODO handle custom exceptions here
}
%>
<%-- end web service invocation --%><hr/>
    
    </body>
</html>
