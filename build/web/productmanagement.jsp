<%-- 
    Document   : productmanagement
    Created on : 23 Jan, 2020, 6:20:00 PM
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
                if(document.f4.pname.value=="")
                {
                    alert("Please enter productname ");
                    return false;
                }
                
                if(document.f4.pnumber.value=="")
                {
                    alert("Please enter number of products ");
                    return false;
                }
                
        alert("Record inserted succcessfully\nnew product inserted");
                
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
         <h1>PRODUCT DETAILS</h1>
        <h3>ENTER PRODUCT DETAILS CAREFULLY</h3>
        
        <div class="box1">
            <form name="f4" action="insertproduct.jsp" method="post" onsubmit="return validate()">
              <img src="images/icon/product.jpg"  align="right" width=700>
           <label class="font">Product Name</label><br>
           <input type="text" pattern="[A-Za-z]+" name="pname" class="form-control" ><br> <br>
               
              <label class="font">Product Type</label><br>
              <input type="text" name="ptype" class="form-control"  ><br> <br> 
               
            <label class="font">Product Area</label><br>
            <input type="text" name="parea" class="form-control" ><br>  <br>
            
             
           
            <label  class="font">Product Cost Per Unit</label><br>             
            <input type="text"  name="pcost" class="form-control" ><br><br>
              
           
            <label class="font">Product Manufacturer</label><br>
            <input type="text" name="pmanufacture" class="form-control"  ><br> <br>
            
            <label  class="font">Number of Products Available in Stock</label><br>
            <input type="text" name="pnumber" class="form-control"  ><br><br> 
            
                         <input type="submit"  value="SUBMIT">
            
                  
                  
        </form>
        </div>
    </body>
</html>
