var dragId = 14;
var start = 0;
 /*
  This function allows draggable object to be dropped
 */
function allowDrop(ev) {
    ev.preventDefault();

}

/*
  This function allows object to be dragged
 */
function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);

}


/*
  This function  is to create the expression from div elements dropped by the user
 */
function getExpression(){
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
    dbCallForExpressionValidation(builtExp);
}

/*
  This function  is to database call to validate the expression created and print the result
 */

function dbCallForExpressionValidation(exp){

    expJson ={}
    expJson["expression"] = exp.replace(" ","");

      console.log(expJson);



    $.ajax({
        url: "http://localhost:8080/sandbox/validate/",
        data: expJson,
        success: function (result) {
            console.log(result);

            if (result['status'] != 404) {
                 document.getElementById("result").innerHTML = result["result"][0];
            } else {
                 document.getElementById("result").innerHTML = "Invalid Expression"; 
            }
        },
        error: function (result) {

        }

    });


}


/*
  This function  is to drop the dragged objects and perform a reiteration of button section
 */
function drop(ev) {
    var elementId = ev.srcElement.getAttribute("id");
    var data = ev.dataTransfer.getData("text");
    var element = document.getElementById(data);
    if (elementId != "deleteElement") {
        ev.preventDefault();


        element.style.margin = 0;
        ev.target.appendChild(element);


        var gameScreen = document.getElementById("exp");
        var children = gameScreen.childNodes.length + 1;


        if (parseInt(element.getAttribute("id")) >= start) {
            var doc = document.createDocumentFragment();
            var div = document.createElement("div");
            div.setAttribute("ondrop", "drop(event)");
            div.setAttribute("ondragover", "allowDrop(event)");
            div.setAttribute("id", "div" + (children));
            div.setAttribute("class", "dropBox gameScreenDropBox");

            doc.appendChild(div);
            document.getElementById("exp").appendChild(doc);


            updateKeyBoard();

        }


    }
    //delete
    else {
        console.log("delete");
        deleteNumberDropBoxElement(element);


    }
    getExpression();
}


/*
  This function  is to delete the objects dropped
 */

function deleteNumberDropBoxElement(element) {
    var parentNode = element.parentNode;
    parentNode.removeChild(element);
    parentNode.parentNode.removeChild(parentNode);
}

/*
  This function  is to update the button section depending on the user interface
 */
function updateKeyBoard() {
    grade = localStorage.getItem("grade");

    if (grade <= 3) {
        keyboard = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, '+', '-'];
        keyboardClasses = ["number", "number", "number", "number", "number", "number", "number", "number", "number", "number", "operator", "operator"];
    } else if (grade > 3 && grade <= 8) {
        keyboard = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, '+', '-', 'x', '%', '(', ')'];
        keyboardClasses = ["number", "number", "number", "number", "number", "number", "number", "number", "number", "number", "operator", "operator", "operator", "operator", "operator", "operator"];
    }
    var numWrapper = document.getElementById("numWrapper");
    numWrapper.innerHTML = "";
    var numberDoc = document.createDocumentFragment();
    start = dragId;

    $("#numWrapper").append("<div id='deleteElement' class='dropBox deleteDropBox'ondrop='drop(event)' ondragover='allowDrop(event)'></div> <div class='save'> </div>");

    for (var i = 0; i < keyboard.length; i++) {


        var numberDiv = document.createElement("div");

        numberDiv.setAttribute("id", dragId);
        numberDiv.setAttribute("draggable", "true");
        numberDiv.setAttribute("ondragstart", "drag(event)");

        var span = document.createElement("span");
        span.setAttribute("class", "numberOperatorText");

        numberDiv.setAttribute("class", keyboardClasses[i] + " flexCommon");
        span.appendChild(document.createTextNode(keyboard[i]));

        numberDiv.appendChild(span);
        dragId = dragId + 1;
        numberDoc.appendChild(numberDiv);

    }

    numWrapper.appendChild(numberDoc);

}
