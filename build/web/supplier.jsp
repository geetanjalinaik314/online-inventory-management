<%-- 
    Document   : supplier
    Created on : 2 Feb, 2020, 9:47:34 PM
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
                if(document.f4.sname.value=="")
                {
                    alert("Please enter supplier ");
                    return false;
                }
                
                if(document.f4.snumber.value=="")
                {
                    alert("Please enter snumber ");
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
         <h1>SUPPLIER DETAILS</h1>
        <h3>ENTER SUPPLIER DETAILS CAREFULLY</h3>
        
        <div class="box1">
            <form name="f4" action="insertsupplier.jsp" method="post"  onsubmit="return validate()">
              <img src="images/img2.png"  align="right" width="50%">
           <label class="font">Supplier Name</label><br>
           <input type="text" pattern="[A-Za-z]+" name="sname" class="form-control" ><br> <br>
               
              <label class="font">Supplier Number</label><br>
              <input type="text" name="snumber" class="form-control"  ><br> <br> 
               
            <label class="font">Product Supplied</label><br>
            <input type="text" name="supplied" class="form-control" ><br>  <br>
             
           
            <label  class="font">address</label><br>
            <input type="text"  name="saddress" class="form-control" ><br><br>
           
            <label  class="font">Contact Number</label><br>             
            <input type="text"  name="contact" class="form-control" ><br><br>
              
           
            
            
                         <input type="submit"  value="SUBMIT">
            
                  
                  
        </form>
        </div>
    </body>
</html>

    
