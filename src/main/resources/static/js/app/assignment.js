//java script events to dynamically add new rows  which will consist of questions answers and marks
$(document).ready(function () {
    var counter = 0;
    $("#addrow").on("click", function () {
        var newRow = $("<tr>");
        var cols = "";
        cols += '<td><input type="text" class="form-control" name="name' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="mail' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="phone' + counter + '"/></td>';

        cols += '<td><input type="button" class="ibtnDel btn btn-md btn-danger "  value="Delete"></td>';
        newRow.append(cols);
        $("table.order-list").append(newRow);
        counter++;
    });

    $("table.order-list").on("click", ".ibtnDel", function (event) {
        $(this).closest("tr").remove();       
        counter -= 1
    });
});
document.getElementById("status").style.display = "none";





// onlcick of submit button by the instructor the json will be constructed fromt he dic elements   
$("#submit").on("click", function (){

        root= {};
       
        root["quizName"] = document.getElementById("qname").value;
        root["grade"] = document.getElementById("qgrade").value;
        root["subject"] = document.getElementById("qsubject").value;

        var childNodes = document.getElementById("myTable").getElementsByTagName("tr");
      
        inc =0;
        for(var i = 0; i< childNodes.length; i++){

          if(typeof childNodes[i] != "undefined"){
          var td = childNodes[i].getElementsByTagName("td");
          obj = {};
          for(var j=0; j<td.length; j++){
            if(typeof td[j] != "undefined"){
                    var input = td[j].getElementsByTagName("input");
                    for(var k=0; k< input.length; k++){
                        if(input[k].type == "text"){
                          var val = input[k].value;

                          if( j == 0){
                              obj["question"] = val;
                          }
                          else if( j == 1){
                              obj["answer"] = val;
                          }
                          else if( j == 2){
                              obj["marks"] = val;
                          }
                        }
                    }
            }
        
        }
        
      }//row
            if(Object.keys(obj).length > 0){
                root[inc] = obj;
                inc += 1;
            }
        }
     dbCallToCreateNewAssignment(root);


    });






    // database call to create new assignment the constructed json will be sent via rest
    function dbCallToCreateNewAssignment(root){
         
    $.ajax({
        type: "POST",
        contentType: "application/json; charset=utf-8",
        dataType : 'json',
        url: '/addAssign',
        data: JSON.stringify(root),
        success: function (result) {
            console.log(result);


        },
        error: function (result) {

        }

    });

    document.getElementById("status").style.display = "block";
    document.getElementById("status").innerHTML = "Successfully Submitted";
    }