<%-- 
    Document   : table
    Created on : 20-Jun-2024, 1:32:09 pm
    Author     : mahen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            Enter a number <input type="text" name="t1"><br><!-- comment -->
            <input type="submit" value="submit"><!-- comment -->
        </form>
    </body>
</html>
<%
    String a;
    a=request.getParameter("t1");
    try {
                    int n = Integer.parseInt(a);
                    for (int i = 1; i <= 10; i++) {
                        out.println(n + " x " + i + " = " + (n * i) + "<br>");
                    }
                } catch (Exception e) {
                    out.println(e);
                }



%>