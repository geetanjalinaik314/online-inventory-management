<%-- 
    Document   : new
    Created on : 28 Mar, 2020, 11:13:40 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
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
                
                
                
                             
                 ResultSet rs=st.executeQuery("select * from order_1");
                 
               rs.next();
                 {
                     ResultSet rs2=st2.executeQuery("select pqty from product where pname='"+rs.getString(2)+"'");
                     
                     rs2.next();
                     {
                        int product=rs2.getInt(1);
                         int order=rs.getInt(1);
                         
                    
                     
                
                     
                         if(product>=order)
                         
                         {   
                          response.sendRedirect("confirm2.jsp");
                            
                         }    
                          
                         
                          else
                             
                         { 
                             
                             out.println("QUANTITY NOT AVAILABLE");%><br><br>
                            <% out.println("ENTER PROPER QUANTITY");
                         
                             
                 }
                    
                   
                 }
                 }
                     
                 
                 
                 %>
    </body>
</html>
