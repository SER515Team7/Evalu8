 document.getElementById("errorMessage").style.display="none";  
     function validateLogin(){
       userName = document.getElementById("userName").value;
       dob  = document.getElementById("dob").value;
     
       jsonWrapper ={};
       var loginJson = {};
       loginJson["username"] = userName;
       loginJson["dob"] = dob;
       jsonWrapper["login"] = loginJson;
       console.log(jsonWrapper);
       loginAjaxCall(jsonWrapper);
     
     
     
     }
     
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
            
            
            
     }