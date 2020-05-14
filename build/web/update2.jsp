<%-- 
    Document   : update2
    Created on : 28 Mar, 2020, 10:33:03 PM
    Author     : hp
--%>

<%-- 
    Document   : alert
    Created on : 28 Mar, 2020, 7:10:49 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
                
                
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st2=con2.createStatement();
                
                 
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st3=con3.createStatement();
                
                             
                 ResultSet rs=st.executeQuery("select quantity, pname from order_1 where id=(select max(id) from order_1)");
                 
               rs.next();
                 {
                     ResultSet rs2=st2.executeQuery("select pqty from inv where pname='"+rs.getString(2)+"'");
                     
                     rs2.next();
                     {
                        int product=rs2.getInt(1);
                         int order=rs.getInt(1);
                         
                    
                     
                     int n=(product-order);
                     
                     
               int i=st3.executeUpdate("update inv set pqty='"+n+"' where pname='"+rs.getString(2)+"'");
               
               if(i>0)
                  out.println("Payment Successfull"); 
              
                     }
                         
                 }
      
                 
                 %>
    </body>
</html>
