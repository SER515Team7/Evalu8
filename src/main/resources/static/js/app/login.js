 document.getElementById("errorMessage").style.display="none";  
     function validateLogin(){
       userName = document.getElementById("userName").value;
       dob  = document.getElementById("dob").value;
     
     
       var loginJson = {};
       loginJson["studentId"] = userName;
       loginJson["dateOfBirth"] = dob;
       ajaxCallForLogin(loginJson);
       console.log(loginJson);
     
     
     }


     function ajaxCallForLogin(loginJson){
      grade = 9;

     myJson =JSON.stringify(loginJson);
     urlLink = "http://localhost:8080/sandbox/login/" + myJson;
     $.ajax({
       url: "http://localhost:8080/sandbox/login/",
         data:loginJson,
      success: function(result){
          console.log(result);
      },
         error: function(result){
             console.log(result);
         }
   
     });
      navigate(grade);
    }

     function navigate(grade){
          localStorage.setItem("grade",grade);
          if(grade <=3){
            //window.location.href = ("index.html");
          }
          else if( grade >3 && grade <=8){
            //window.location.href = ("index1.html");
          }
          else if(grade >8 && grade <=12){
           // window.location.href = ("index2.html");
          }
     }