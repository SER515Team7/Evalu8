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







    // database call to create new assignment the constructed json will be sent via rest
    function dbCallToCreateNewAssignment(root){
           $.ajax({
            url: "http://localhost:8080/sandbox/login/",
            data: root,
            success: function (result) {
                console.log(result);          
            },
            error: function (result) {
            }
    
          });

           document.getElementById("status").style.display = "block";
           document.getElementById("status").innerHTML = "Successfully Submitted";
    }