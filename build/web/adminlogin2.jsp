<%-- 
    Document   : adminlogin2
    Created on : 15 Jan, 2020, 5:41:31 PM
    Author     : hp
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
        <style>
        
           
           .p{
               width:60%;
               position:absolute;
               left:40%;
               top:35%;
               padding:50px;
              text-align:center;
           }
               </style>
    </head>
    <body>
        
        <%
           
                  Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
                
                String u=request.getParameter("user");
                String p=request.getParameter("password");
                
                 ResultSet rs=st.executeQuery("select * from adminlogin where username='"+u+"' and password='"+p+"'");
                     
                if(rs.next())
                {
                  response.sendRedirect("home2.jsp");
                }
                else
                {
                   
                    response.sendRedirect("adminlogin.jsp?m=3");
                }
                
                
        
        
            %>
                
                
            
    </body>
</html>
