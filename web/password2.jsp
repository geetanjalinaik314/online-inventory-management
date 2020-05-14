<%-- 
    Document   : password2
    Created on : 4 Mar, 2020, 9:37:08 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
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
                
                                String u=request.getParameter("user");

                String np=request.getParameter("npassword");
                String cp=request.getParameter("cpassword");
                
                 int i=st.executeUpdate("update adminlogin set password='"+np+"' where username='"+u+"'" );
                     
                if(i>0)
                {%>
    <center> <font size="15" color="green" ><%out.print("password changed successfully");%></font><br><br><br><br><br><br>
   <a href="adminlogin.jsp"><img src="images/user4.png" width="160">GO TO LOGIN PAGE</a></center>
               <% }
                
                else
                {
                    out.print("username DOESNOT MATCH");
                    //response.sendRedirect("adminlogin.jsp");
                }
                
            }
                
        
        catch(Exception e)
        {
            out.print(e);
        }
            %>
                
                
            
    </body>
</html>

    </body>
</html>
