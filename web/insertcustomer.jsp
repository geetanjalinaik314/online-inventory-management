<%-- 
    Document   : insertcustomer
    Created on : 2 Mar, 2020, 7:28:26 AM
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
             
            
            try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
           
                
                
                String name=request.getParameter("fname");
                String lname=request.getParameter("lname");
                String phone=request.getParameter("phone");
                 String add=request.getParameter("address1");
                 String email=request.getParameter("eaddress");
               String state=request.getParameter("state");
                 String zip=request.getParameter("zip");
                 String city=request.getParameter("city");
               

               int i=st.executeUpdate("insert into customer(fname,lname,phone,address,email,state,pin,city) values('"+name+"','"+lname+"','"+phone+"','"+add+"','"+email+"','"+state+"','"+zip+"','"+city+"')");
                
                if(i>0)
                {
                    //out.print("record entered sucessfully");
                    response.sendRedirect("home2.jsp");
                }
                else
                {
                    out.print("error");
                   // response.sendRedirect("supplier.jsp?m=3");
                }
                }
        
            
            catch(Exception ex)
            {
                out.print(ex);
            }
                        %> 
    </body>
</html>

               
             
                
    