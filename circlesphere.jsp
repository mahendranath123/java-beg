<%-- 
    Document   : circlesphere
    Created on : 20-Jun-2024, 5:43:20 pm
    Author     : mahen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circle or Sphere Calculation</title>
    </head>
    <body>
        <form method="post">
            Enter a number: <input type="text" name="t1"><br>
            <input type="radio" name="t2" value="circle">Circle<br>
            <input type="radio" name="t2" value="sphere">Sphere<br>
            <input type="submit" value="Submit">
        </form>
        <%
            String a = request.getParameter("t1");
            String b = request.getParameter("t2");
            
            if(a != null && b != null) {
                try {
                    int r = Integer.parseInt(a);
                    double result = 0;
                    
                    if(b.equals("circle")) {
                        result = circle(r);
                        out.println("Area of the circle: " + result);
                    } else if(b.equals("sphere")) {
                        result = sphere(r);
                        out.println("Surface area of the sphere: " + result);
                    }
                } catch (NumberFormatException e) {
                    out.println("Please enter a valid number.");
                }
            }
        %>
    </body>
</html>
<%!
    double circle(int a) {
        return 3.14 * a * a;
    }

    double sphere(int a) {
        return 4 * 3.14 * a * a;
    }
%>
