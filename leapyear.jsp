<%-- 
    Document   : leapyear
    Created on : 17-Jun-2024, 2:02:31 pm
    Author     : mahen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leap Year Checker</title>
    </head>
    <body>
        <h2>Leap Year Checker</h2>
        <form method="post">
            Enter a year: <input type="text" name="year"><br>
            <input type="submit" value="Check"> 
        </form>
        <br>
        <%
            String yearStr = request.getParameter("year");
            if (yearStr != null ) { 
                try {
                    int year = Integer.parseInt(yearStr);

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        out.println(year + " is a leap year.");
                    } else {
                        out.println(year + " is not a leap year.");
                    }
                } catch (Exception e) {
                    out.println(e);
                }
            }
        %>
    </body>
</html>