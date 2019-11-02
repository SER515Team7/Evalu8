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

            }
        },
        error: function (result) {

        }

    });


}
