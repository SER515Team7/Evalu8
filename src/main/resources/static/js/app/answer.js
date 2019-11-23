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

