<%-- 
    Document   : digitloop
    Created on : 19-Jun-2024, 2:01:08 pm
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
            Enter a number: <input type="text" name="t1"><br><!-- comment -->
            <input type="submit" value="Submit"><!-- comment -->
        </form>
        
        <% 
        String a = request.getParameter("t1");
        if (a != null ) {
           
                int n = Integer.parseInt(a);
                int result = 0;
                while (n > 0) {
                    int remainder = n % 10;
                    result += remainder;
                    n /= 10;
                }
                out.print("Sum of digits: " + result);
             
        }
        %>
    </body>
</html>
