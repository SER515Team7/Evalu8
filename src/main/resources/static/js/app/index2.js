
function getExpression(){
    var builtExp ="";
    var expression = document.getElementById("exp").childNodes;
    for(i=0; i<expression.length; i++){
        if(expression[i].nodeName != "#text"){
            var child = expression[i];
            console.log(child.getElementsByClassName("numberOperatorText").length);
            if(child.getElementsByClassName("numberOperatorText").length > 0){
                //Implement this
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
}
