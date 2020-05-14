<%-- 
    Document   : payment
    Created on : 1 Mar, 2020, 8:59:59 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         
           
           input[type=text] {
  
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}



input[type=submit] {
  width: 10%;
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
    <center>  
        <h1>PAYMENT DETAILS</h1>
        
        <img src="images/card.png" width=300>
        <form>
<table cellspacing="5" cellpadding="5">
<tr><th>PAYMENT METHOD</th></tr>
<tr> 
  <tr><td><input type="radio" name="payment" value="COD"/>COD cash on Delivery</td></tr>
  <tr><td><input type="radio" name="payment" value="Card"/>Card</td></tr>
  
</table> <br><br>
  
</form>
        
        <form name="f2" method="post"  action="update.jsp">
            <label>Card Number&nbsp;&nbsp;<input type="text" name="number" size="50"></label><br>
            <label>Name on Card&nbsp;&nbsp;<input type="text" name="name" size="50"></label><br>
            <label>Expiry Date&nbsp;&nbsp;<input type="text" name="date" placeholder="MM/YY" size="3">
                CVV<input type="text" name="cvv" size="3"></label>
            
            <input type="submit" value="PROCEED">
        </form>
    </center>  
           </body>
</html>
