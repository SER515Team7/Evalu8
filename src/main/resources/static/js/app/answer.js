/*
* @author:Prakhar Sambhar
* */

var quizId = localStorage.getItem("quizIndex");
var quizJson = localStorage.getItem("quizJson");
localStorage.setItem("quizview", "true");
quizJson = (JSON.parse(quizJson));




var quizDetails = (quizJson[parseInt(quizId)]);
var questionsList = quizDetails["questionsList"];
var ans = [];
document.getElementById("quizHeader").innerHTML = quizDetails["quizName"];
index = 0;
original = [];
result = 0;
next();


//To retrieve answer that has been dropped by the user from the button section
function getAnswer(){
    var builtExp ="";
    var expression = document.getElementById("exp").childNodes;
    for(i=0; i<expression.length; i++){
        if(expression[i].nodeName != "#text"){
            var child = expression[i];
            var text = child.getElementsByClassName("numberOperatorText")[0];

            if(text != undefined){
                if(text.innerHTML.replace(" ","") == "x"){
                    builtExp += "*";
                    console.log("+ here");

                }
                else{
                    builtExp += (text.innerHTML);
                    console.log(text.innerHTML);

                }
            }


        }

    }

    ans.push(builtExp);


}