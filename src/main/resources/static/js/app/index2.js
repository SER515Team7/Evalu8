
function getExpression(){
    var builtExp ="";
    var expression = document.getElementById("exp").childNodes;
    for(i=0; i<expression.length; i++){
        if(expression[i].nodeName != "#text"){
            var child = expression[i];
            console.log(child.getElementsByClassName("numberOperatorText").length);
            if(child.getElementsByClassName("numberOperatorText").length > 0){
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

                if(child.getElementsByClassName("numberOperatorText").length > 1){
                    var input = child.getElementsByTagName("input")[0];
                    builtExp += input.value;
                    builtExp+=")";
                }

            }
            else{

                if(child.getElementsByTagName("div").length > 0){
                    var div = child.getElementsByTagName("div")[0];
                    var input = div.getElementsByTagName("input")[0];
                    builtExp += input.value;
                }
            }



        }

    }


    console.log(builtExp);
    var rs = math.eval(builtExp.replace(" ","").toLowerCase());
    if(rs!= undefined){
        document.getElementById("result").innerHTML= math.eval(builtExp.replace(" ","").toLowerCase());
    }
    else{
        document.getElementById("result").innerHTML="";
    }
}
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

