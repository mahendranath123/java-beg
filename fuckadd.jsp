<%-- 
    Document   : fuckadd
    Created on : 18-Jun-2024, 11:33:21 pm
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
            Enter  anumber <input type="text" name="t1"><br><!-- comment -->
            Enter a  a number<input type="text" name="t2"><br><!-- comment -->
            <input type="Submit" Value="Submit">
        </form>
    </body>
</html>
<%!      
             int Add(int x,int y)
             {
                 return (x+y);
             }
             int Sub (int x,int y)
             {
                 return (x-y);
             }
             int i=0 ,j=0;
            
        
        %>
        <%  
           String a,b;
           a=request.getParameter("t1");
           b=request.getParameter("t2");
           if(a!=null && b!=null)
           {
           i=Integer.parseInt(a);
           j=Integer.parseInt(b);
           
        }
           
        
        %>
        
        <%= Add(i,j) %>
        <br>
        <%=Sub(i,j) %>