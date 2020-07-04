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
 background: #acb7ae;
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


form {
                     width: 80%;
                     padding: 20px;
                     border-radius: 6px;
                  background:#c2b490; 
                     box-shadow: 0 0 8px  #669999; 
            }


input[type=submit] {
  width: 20%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 15px;
  background-color: limegreen;
}
            
          .banner {
                     position: relative;
                     height: 300px;
                     background-image: url("images/inv.jpg");  
                     background-size:cover;
                     display: flex;
                     justify-content: center;
                     align-items: center;
                     text-align: center;
              }		   
            
            label{
		           font-size:20px;
		           font-color:black;
	        }
			
            
        </style>
    </head>
    <body>
        <div class="box1">
            <center>
            <form name="f4" action="insertproduct.jsp" method="post" onsubmit="return validate()">
                <div class="banner">
          <h1><font size="100px" color="black">Product Entry</font></h1>
        </div>
		<br><br>
                
             
           <label class="font">Product Name</label>
           <input type="text" pattern="[A-Za-z]+" name="pname" class="form-control" ><br> <br>
               
              <label class="font">Product Type</label>
              <input type="text" name="ptype" class="form-control"  ><br> <br> 
               
            <label class="font">Product Area</label>
            <input type="text" name="parea" class="form-control" ><br>  <br>
            
             
           
            <label  class="font">Cost Per Unit</label>            
            <input type="text"  name="pcost" class="form-control" ><br><br>
              
           
            <label class="font">Manufacturer</label>
            <input type="text" name="pmanufacture" class="form-control"  ><br> <br>
            
            <label  class="font">Products Available in Stock</label>
            <input type="text" name="pnumber" class="form-control"  ><br><br> 
            
                         <input type="submit"  value="SUBMIT">
            
                  
                  
            </form></center>
        </div>
    </body>
</html>
