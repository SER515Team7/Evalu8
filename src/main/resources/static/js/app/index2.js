function updateKeyBoard() {


    var numWrapper = document.getElementById("numWrapper");
    numWrapper.innerHTML = "";
    var numberDoc = document.createDocumentFragment();
    start = dragId;

    $("#numWrapper").append("<div id='deleteElement' class='dropBox deleteDropBox'ondrop='drop(event)' ondragover='allowDrop(event)'></div> <div class='save'> </div><div id='10'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> +</span></div><div id='11'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> -</span></div><div id='12'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> *</span></div><div id='13'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> /</span></div>  <div id='15'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> %</span></div>");


}

var dragId = 14;
var start = 0;

