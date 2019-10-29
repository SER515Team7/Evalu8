 document.getElementById("errorMessage").style.display="none";  
     function validateLogin(){
       userName = document.getElementById("userName").value;
       dob  = document.getElementById("dob").value;
     
     
       var loginJson = {};
       loginJson["username"] = userName;
       loginJson["dob"] = dob;
<<<<<<< HEAD
       jsonWrapper["login"] = loginJson;
       console.log(jsonWrapper);
       loginAjaxCall(jsonWrapper);
=======
        ajaxCallForLogin(loginJson);
>>>>>>> US_7_Login
     
     
     
     }
<<<<<<< HEAD
     
     function loginAjaxCall(jsonWrapper){
            
            
            $.ajax({url: "https://api.myjson.com/bins/iwdug", 
                   
                   success: function(data){
                   data = data["login"];
                   if(data["result"] == "success"){
                          if( data["grade"] == "1" ){
                               window.location.href = "index.html";
                          }
                          else if(data["grade"] == "2"){
                               window.location.href = "index1.html";
                          } 
                   }
                   },
                   error:function (e){
                        console.log("Error during Login JSON Call");
                   }
            
            
            });
            
            
            
=======


     function ajaxCallForLogin(loginJson){
       grade = 3;
       navigate(grade);
     }

     function navigate(grade){
          localStorage.setItem("grade",grade);
          if(grade <=3){
            window.location.href = ("index.html");
          }
          else if( grade >3 && grade <=8){
            window.location.href = ("index1.html");
          }
          else if(grade >8 && grade <=12){
            window.location.href = ("index2.html");
          }
>>>>>>> US_7_Login
     }