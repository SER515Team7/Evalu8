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
            element.style.width ="140px";
            ev.target.appendChild(element);


            var gameScreen = document.getElementById("exp");
            var children = gameScreen.childNodes.length + 1;



            var doc = document.createDocumentFragment();
            var div = document.createElement("div");
            div.setAttribute("ondrop", "drop(event)");
          




        }
        //delete
        else {
            console.log("delete");
            deleteNumberDropBoxElement(element);


        }
        getExpression();
    }