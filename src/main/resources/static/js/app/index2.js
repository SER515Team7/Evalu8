function updateKeyBoard() {


    var numWrapper = document.getElementById("numWrapper");
    numWrapper.innerHTML = "";
    var numberDoc = document.createDocumentFragment();
    start = dragId;

    $("#numWrapper").append("<div id='deleteElement' class='dropBox deleteDropBox'ondrop='drop(event)' ondragover='allowDrop(event)'></div> <div class='save'> </div><div id='10'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> +</span></div><div id='11'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> -</span></div><div id='12'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> *</span></div><div id='13'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> /</span></div>  <div id='15'  draggable='true' ondragstart='drag(event)' class='operator flexCommon'><span class='numberOperatorText'> %</span></div><div id='19'  draggable='true' ondragstart='drag(event)' class='operator flexCommon' style='width:150px;'><input type ='text' style ='font-size: 25px' class='textBox'/></div>     <div id='20'  draggable='true' ondragstart='drag(event)' class='operator flexCommon' style='width:150px;'><span class='numberOperatorText' style='font-size: 35px'>Sin(</span><input type ='text' style ='font-size: 25px' class='textBox'/><span style='font-size: 35px' class='numberOperatorText'>)</span></div><div id='21'  draggable='true' ondragstart='drag(event)' class='operator flexCommon' style='width:150px;'><span class='numberOperatorText' style='font-size: 35px'>Tan(</span><input type ='text' style ='font-size: 25px' class='textBox'/><span style='font-size: 35px' class='numberOperatorText'>)</span></div><div id='22'  draggable='true' ondragstart='drag(event)' class='operator flexCommon' style='width:150px;'><span class='numberOperatorText' style='font-size: 35px'>Cos(</span><input type ='text'  style ='font-size: 25px' class='textBox'/><span style='font-size: 35px' class='numberOperatorText'>)</span></div>\"");


}

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

