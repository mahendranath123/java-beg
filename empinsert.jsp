<%-- 
    Document   : empinsert
    Created on : 15-Jun-2024, 12:31:12 pm
    Author     : mahen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import=" java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post">
            Enter  a  Employee id<input type="text" name="t1"><!-- comment -->
            Enter a Employee name <input type="text" name="t2"><br><!-- comment -->
            Enter a salary <input type="text" name="t3"><br><!-- comment -->
            Enter a contact number <input type="text" name="t4"><br><!-- comment -->
            Enter  a  working hours <input type="text" name="t5"><br><!-- comment -->
            <input type="Submit" value="Submit"><!-- comment -->
            
        </form>
    </body>
</html>
<%!
    Connection con;
    public void jspInit()
{
   
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pr1","root","root"); 
}
catch(Exception e)
{
       System.out.println(e);
}
} 
    
%>

<%  
String  a,b,c,d,e;
a=request.getParameter("t1");
b=request.getParameter("t2");
c=request.getParameter("t3");
d=request.getParameter("t4");
e=request.getParameter("t5");
if(a!=null &&b!=null&&c!=null&&d!=null &&e!=null) 
{
Statement st=con.createStatement();
st.execute("insert into emp45  values ('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");
out.print("valued instered");



}

%>