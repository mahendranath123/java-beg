<%-- 
    Document   : reverse
    Created on : 17-Jun-2024, 2:31:21 pm
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
            <input type="Submit" value="Submit"><!-- comment --><!-- comment -->
        </form>
    </body>
</html>
<% 
String a=request.getParameter("t1");
if(a!=null)
{
int a1=Integer.parseInt(a);
int results=0,remainder;
while(a1>0)
{
remainder=a1%10;
results=results*10+remainder;
a1=a1/10;

}
out.println("Reverse of number"+results);
}

%>