<%-- 
    Document   : confirm_order
    Created on : 29 Feb, 2020, 10:59:43 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>  
            
           
            .center
           {
               padding:40px;
              text-align:center;
             
           }
           
           .box{
               width:80%;
               position:absolute;
               left:10%;
               top:10%;
              
              
           }
            label
           {
               
                font-family: verdana;
                font-size: 20px;
            }
           
           input[type=submit]
           {
               width:30%;
               margin:8px 0;
               padding:15px 4px;
               border:3px solid black;
               background-color:lightgrey;
               border-radius:4px;
           }
            
            </style>
    </head>
    <body>
        
        <form name="f1"  action="payment.jsp" method="post">
        <div class="center">
            <div class="box">
        <%   
              
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
             
                
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st1=con1.createStatement();
             
                
                ResultSet rs=st.executeQuery("select * from order_1 where id=(select max(id) from order_1)");
              
                rs.next();
                {
                    ResultSet rs1=st1.executeQuery("select pcost from product where pname='"+rs.getString(2)+"'");
                     rs1.next();
        
 float qty=rs.getFloat(3);
 float cost=rs1.getFloat(1);
 
     
      
      float total=((cost*qty));
     
     
              
                       %>
              
               
                      <center> <table bgcolor="white" width="50%" frame="vsides" rowspan="60" colspan="30" cellpadding="7" cellspacing="8">  
                    <tr><td> 
                    <center><h1>CONFIRM ORDER</h1></center>
                    
                        </td></tr>
                    
                    
                          
                    <tr><td>
                  
   
                            <label>NAME:&nbsp;&nbsp;&nbsp;<% out.print(rs.getString(4));%></label></td></tr>
    
                
                     
                 
                    <tr><td><h2> DELIVERY ADDRESS:</h2><br></td></tr>
                       
                           <tr><td><label>ADDRESS:&nbsp&nbsp<%out.print(rs.getString(5));%></label></td></tr>
                           <tr><td> <label>CITY:&nbsp&nbsp<%out.print(rs.getString(6));%></label></td></tr>
        <tr><td> <label>STATE:&nbsp&nbsp<% out.print(rs.getString(7));%></label></td></tr>
        <tr><td><label>PINCODE:&nbsp&nbsp<% out.print(rs.getString(8));%></label></td></tr>
        
        <tr><td>  
                         
                             <label>PRODUCT NAME:&nbsp;&nbsp;<% out.print(rs.getString(2));%></label></td></tr>
                         <tr> <td> <label>QUANTITY:&nbsp;&nbsp;&nbsp;<%out.print(rs.getString(3));%></label><br></tr></td>
            
                               
                               
    
        <tr><td>  <table width="50%" rowspan="20" colspan="20" cellpadding="2" cellspacing="5" >  
                    <tr><td><label>TOTAL&nbsp;&nbsp;&nbsp;<% out.print(total);%></label></td></tr></table>
            </td></tr>
                             
        
 <% }
              %>
              
                       
                          </table> <br><br> 
              <input type="submit"  value="PROCEED TO PAYMENT"></div></div>
                      </form>
    </body>
</html>

                     
                     
                    
                