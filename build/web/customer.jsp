<%-- 
    Document   : custmer
    Created on : 2 Mar, 2020, 7:19:19 AM
    Author     : hp
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
            function validate()
            {
                if(document.f4.cname.value=="")
                {
                    alert("Please enter customer name ");
                    return false;
                }
                
                if(document.f4.caddress.value=="")
                {
                    alert("Please enter address ");
                    return false;
                }
                
        alert("Record inserted succcessfully\nnew supplier added");
                
                return true;
            }
           </script> 
        <style>
            
            
            body{
background-image:linear-gradient(#a3bded,#f5efef);
background-repeat: no-repeat;
background-size: cover;
}
           input[type=text] {
  width: 30%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}



input[type=submit] {
  width: 20%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 15px;
  background-color: limegreen;
}
            
            
            
            .font
            {
                font-family: Comic Sans MS;
                font-size: 20px;
            }
            
        </style>
    </head>
    <body>
         <h1>CUSTOMER DETAILS</h1>
        <h3>ENTER CUSTOMER DETAILS CAREFULLY</h3>
        
        <div class="box1">
            <form name="f4" action="insertcustomer.jsp" method="post" onsubmit="return validate()">
              <img src="images/img2.png"  align="right" width=300>
           <label class="font">Customer Name</label><br>
           <input type="text" pattern="[A-Za-z]+" name="cname" class="form-control" ><br> <br>
               
              <label class="font">Phone Number</label><br>
              <input type="text" name="cphone" class="form-control"> <br> <br> 
               
            <label class="font">Address</label><br>
            <input type="text" name="caddress" class="form-control"  ><br>  <br>
             
           
            <label  class="font">Email</label><br>
            <input type="text"  name="cemail" class="form-control" ><br><br>
           
            
                         <input type="submit"  value="SUBMIT">
            
                  
                  
        </form>
        </div>
    </body>
</html>

    
