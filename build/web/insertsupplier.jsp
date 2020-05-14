<%-- 
    Document   : insertsupplier
    Created on : 2 Mar, 2020, 7:28:13 AM
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
           
                
                
                String name=request.getParameter("sname");
                String no=request.getParameter("snumber");
                 String psupplied=request.getParameter("supplied");
                 String addr=request.getParameter("saddress");
               String contact=request.getParameter("contact");
               

               int i=st.executeUpdate("insert into supplier(sname,snumber,productsupplied,address,contact) values('"+name+"','"+no+"','"+psupplied+"','"+addr+"','"+contact+"')");
                
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

               
             
                
    