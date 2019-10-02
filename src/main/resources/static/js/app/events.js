var dragId = 14;
var start = 0;
function allowDrop(ev) {
    ev.preventDefault();

}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);

}



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
}




function deleteNumberDropBoxElement(element){
    var parentNode = element.parentNode;
    parentNode.removeChild(element);
    parentNode.parentNode.removeChild(parentNode);
}

function updateKeyBoard() {

    keyboard = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, '+', '-', 'x', '/'];
    keyboardClasses = ["number", "number", "number", "number", "number", "number", "number", "number", "number", "number", "operator", "operator", "operator", "operator"];
    var numWrapper = document.getElementById("numWrapper");
    numWrapper.innerHTML = "";
    var numberDoc = document.createDocumentFragment();
    start = dragId;

    $("#numWrapper").append( "<div id='deleteElement' class='dropBox deleteDropBox'ondrop='drop(event)' ondragover='allowDrop(event)'></div> <div class='save'> </div>");

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
