
      // databse call to get the list of quiz available for the person logged in depedning on the grade
      var data;          
      var parent= document.getElementById("quizList");
      console.log(localStorage.getItem("grade"))
      json ={};
      json["grade"] = localStorage.getItem("grade");
      $.ajax({
                  url: "http://localhost:8080/retrieveAssign/",
                  data:json,
                  success: function (result) {
                      console.log(result);
                      data = result;
                      for (var i=0; i<result.length; i++){
                             console.log(result[i]["quizName"]);
                             var name = result[i]["quizName"];
                             $(parent).append("<tr><td>"+result[i]["quizName"]+"</td><td id='next' class='takeQuiz' onclick=quiz("+i+")> <span  class='takeQuizText'> TAKE QUIZ</span></td></tr>");
                      }
                     
                  },
                  error: function (result) {
                     
                  }
                });
      
      
              function quiz(quizName){
          
                localStorage.setItem("quizIndex", quizName);
                localStorage.setItem("quizJson",JSON.stringify(data));
                 window.location.href = "answer.html";
              }  
      
