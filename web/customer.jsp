


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
        
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
            
            
            html, body {
                min-height: 100%;
            }
			
			
            body, div, form, input, select, textarea, label, p { 
                  padding: 0;
                  margin: 0;
                  outline: none;
                  font-family: Roboto, Arial, sans-serif;
                  font-size: 14px;
                  color: #666;
                  line-height: 22px;
            }
			
			
           input[type=text] {
                width: 70%;
                margin-bottom: 20px;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            .colums {
                  display:flex;
                  justify-content:space-between;
                  flex-direction:row;
                  flex-wrap:wrap;
            }
			
            .colums div {
                   width:50%;
            }
	  
	   label{
		           font-size:15px;
		           font-color:black;
	        }
			
			
          input[type=submit] {
                   width: 70%;
                   margin-bottom: 20px;
                   padding: 12px;
                   border: 1px solid #ccc;
                   border-radius: 15px;
                   background-color: limegreen;
            }
			
          input[type=tel] {
                      width: 70%;
                      margin-bottom: 20px;
                      padding: 12px;
                      border: 1px solid #ccc;
                      border-radius: 3px;
            }


           form {
                     width: 80%;
                     padding: 20px;
                     border-radius: 6px;
                     background: #acb7ae;
                     box-shadow: 0 0 8px  #669999; 
            }

 
         .testbox {
                     display: flex;
                     justify-content: center;
                     align-items: center;
                     height: inherit;
                     padding: 20px;
            }	  
         
        .banner {
                     position: relative;
                     height: 300px;
                     background-image: url("images/inv_1.jpg");  
                     background-size:cover;
                     display: flex;
                     justify-content: center;
                     align-items: center;
                     text-align: center;
              }		 
           
        </style>
    </head>
     <body>
    <div class="testbox">
     <form name="f4" action="insertcustomer.jsp" method="post" onsubmit="return validate()">
        <div class="banner">
          <h1><font size="50px" color="black">New Customer Registration</font></h1>
        </div>
		<br><br>
        <div class="colums">
          <div class="item">
            <label for="fname"> First Name<span>*</span></label>
            <input id="fname" type="text" name="fname" required/>
          </div>
          <div class="item">
            <label for="lname"> Last Name<span>*</span></label>
            <input id="lname" type="text" name="lname" required/>
          </div>
          <div class="item">
            <label for="address1">Address 1<span>*</span></label>
            <input id="address1" type="text"   name="address1" required/>
          </div>
          <div class="item">
            <label for="address2">Address 2<span>*</span></label>
            <input id="address2" type="text"   name="address2" required/>
          </div>
          <div class="item">
            <label for="state">State<span>*</span></label>
            <input id="state" type="text"   name="state" required/>
          </div>
          <div class="item">
            <label for="zip">Zip/Postal Code<span>*</span></label>
            <input id="zip" type="text" name="zip" required/>
          </div>
          <div class="item">
            <label for="city">City<span>*</span></label>
            <input id="city" type="text"   name="city" required/>
          </div>
          <div class="item">
            <label for="eaddress">Email Address<span>*</span></label>
            <input id="eaddress" type="text"   name="eaddress" required/>
          </div>
          <div class="item">
            <label for="phone">Phone<span>*</span></label>
            <input id="phone" type="tel"   name="phone" required/>
          </div>
        </div>
        
        
       
        <div class="btn-block">
          <button type="submit" href="/">Submit</button>
        </div>
      </form>
    </div>
  </body>
</html>

    
