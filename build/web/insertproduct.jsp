<%-- 
    Document   : insertproduct
    Created on : 23 Jan, 2020, 7:11:33 PM
    Author     : hp
--%>
<%@page import="java.sql.*"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>


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
           
                
                
                String name=request.getParameter("pname");
                String type=request.getParameter("ptype");
                 String area=request.getParameter("parea");
                 String image=request.getParameter("img");
                String cost=request.getParameter("pcost");
                String manufacture=request.getParameter("pmanufacture");
                String number=request.getParameter("pnumber");


               int i=st.executeUpdate("insert into product(pname,ptype,parea,pcost,pmanufacture,pqty) values('"+name+"','"+type+"','"+area+"','"+cost+"','"+manufacture+"','"+number+"')");
                
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

               
             
                
    