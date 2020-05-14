<%-- 
    Document   : order
    Created on : 16 Feb, 2020, 12:08:45 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <style>
            
            
            body{
background-color:lightblue;
background-repeat: no-repeat;
background-size: cover;
}
           input[type=text] {
  width: 50%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}



input[type=submit] {
  width: 30%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 15px;
  background-color: limegreen;
}


label {
  margin-bottom: 10px;
  display: block;
  font-size:130%;
  //color: blue;
}



   .span
   {
       font-size:12px;
      
   }
     
   .new{
       border:3px dotted black;
       width:50%;
       line-height:1;
       background-color:lightgrey;
   }
   .col50
   {
       float:left;
       width:50%;
   }
   
   
        </style>
    </head>
    <body>
       
        <h1>ENTER ORDER DETAILS</h1>
        <form name="f6" action="placeorder.jsp" method="post">
            <label for="product"> Select Product Name</label>
             <%

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement(); 
                
                 
               
                ResultSet rs3=st.executeQuery("select pname from product");
                %>
           
               
                 <select name="pname"  style="width:100px; height:30px;">
                   <%
                     while(rs3.next())
                {
                    %><option><%out.print(rs3.getString("pname"));%></option><%
                }
                    %>
                </select>
               <br>
               <br><label for="quantity">Quantity</label><input type="text" name="qty" required>
                 
     
              
                
            <h3>Delivery Address</h3>
            <label for="fname"><img src="images/icon/user-480.png"  width="25"> Full Name</label>
            <input type="text"  name="cname" placeholder="John M. Doe" required>
            <label for="email"><img src="images/icon/download.png" width="25"> Email</label>
            <input type="text"  name="email" placeholder="john@example.com">
            <div class="col50"><label for="adr"><img src="images/icon/images.png" width="25"> Address</label>
            <input type="text"  name="area" placeholder="542 W. 15th Street" required>
            <label for="city"><img src="images/icon/download (1).png" width="25"> City</label>
            <input type="text" id="city" name="city" placeholder="New York">
            </div>
            <div class="col50">
                <label for="state">State</label>
                <input type="text"  name="state" placeholder="NY" required>
            </div>
            <div class="col50">
                <label for="zip">Zip</label>
                <input type="text"  name="pincode" placeholder="10001" required>
           
            
                <br><br>
         
       
        
        <input type="submit" value="Continue to checkout" >
     </div>
  
 
        
        </form>
    </body>
</html>