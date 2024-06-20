<%-- 
    Document   : autoarm
    Created on : 20-Jun-2024, 7:23:03 pm
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
            Enter a number <input type="text" name="t1"><br>
            <input type="radio" name="t2" value="par"> palindrome <br>
            <input type="radio" name="t2" value="arm"> armstrong <br>
            <input type="submit" value="submit">
        </form>
        
        <%
            String a = request.getParameter("t1");
            String b = request.getParameter("t2");
            
            if (a != null && b != null) {
                try {
                    int i = Integer.parseInt(a);
                    
                    if (b.equals("par")) {
                        int result = 0, remainder, m;
                        m = i;
                        
                        while (i > 0) {
                            remainder = i % 10;
                            result = result * 10 + remainder;
                            i = i / 10;
                        }
                        
                        if (m == result) {
                            out.print("Palindrome: " + m);
                        } else {
                            out.print("Not a palindrome: " + m);
                        }
                    } else if (b.equals("arm")) {
                        int result = 0, remainder, m;
                        m = i;
                        
                        while (i > 0) {
                            remainder = i % 10;
                            result = result + remainder * remainder * remainder;
                            i = i / 10;
                        }
                        
                        if (m == result) {
                            out.print("Armstrong number: " + m);
                        } else {
                            out.print("Not an Armstrong number: " + m);
                        }
                    } else {
                        out.print("Invalid operation");
                    }
                } catch (Exception e) {
                    out.print("Error: " + e.getMessage());
                }
            }
        %>
    </body>
</html>
