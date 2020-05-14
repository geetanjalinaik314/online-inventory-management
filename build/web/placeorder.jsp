<%-- 
    Document   : image
    Created on : 22 Feb, 2020, 4:55:29 PM
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
                 Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st2=con2.createStatement();
           
                
                
                
                String name=request.getParameter("pname");
                String qty=request.getParameter("qty");
                 String customer=request.getParameter("cname");
                 String area1=request.getParameter("area");
                String city1=request.getParameter("city");
                String state1=request.getParameter("state");
                String pincode1=request.getParameter("pincode");
                
               int i=st2.executeUpdate("insert into order_1(pname,quantity,cname,area,city,state,pincode) values('"+name+"','"+qty+"','"+customer+"','"+area1+"','"+city1+"','"+state1+"','"+pincode1+"')");
             
                int j=st2.executeUpdate("insert into order_2(pname,quantity,cname,area,city,state,pincode) values('"+name+"','"+qty+"','"+customer+"','"+area1+"','"+city1+"','"+state1+"','"+pincode1+"')");
             
     
                 
                 if(i>0)
                {
                    //out.print("stock unavailable");
                    response.sendRedirect("order_3.jsp");
                }
                else
                {
                    out.print("error");
                   // response.sendRedirect("supplier.jsp?m=3");
                }
                
                
               
         
                        
            
                        %> 
    </body>
</html>

               
             
                
    