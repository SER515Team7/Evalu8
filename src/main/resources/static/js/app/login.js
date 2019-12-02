
document.getElementById("errorMessage").style.display = "none";
/*
  This function  is to  validate the login page
 */
function validateLogin() {
    userName = document.getElementById("userName").value;
    dob = document.getElementById("dob").value;


    var loginJson = {};
    loginJson["studentId"] = userName;
    loginJson["dateOfBirth"] = dob;
    
    if(userName.toString() == "1000"){
          window.location.href="indexTeacher.html";
    }
    else {
        ajaxCallForLogin(loginJson);

    }console.log(loginJson);

}

/*
  This function  is to database call to check for authentication
 */
function ajaxCallForLogin(loginJson) {

    document.getElementById("errorMessage").style.display ="none";
    myJson = JSON.stringify(loginJson);
    urlLink = "http://localhost:8080/login/" + myJson;
    $.ajax({
        url: "http://localhost:8080/login/",
        data: loginJson,
        success: function (result) {
            console.log(result);

            if (result['status'] != 404) {
                navigate(result['grade']);
            } else {
                document.getElementById("errorMessage").style.display ="block";
                document.getElementById("errorMessage").innerHTML = "Invalid Login Credentials";
            }
        },
        error: function (result) {
            document.getElementById("errorMessage").innerHTML = "Invalid Login  Credentials";
            console.log("error message");
            document.getElementById("errorMessage").style.display ="block";
        }

    });

}
/*
  This function  is to nvaugate to differen pages depending on the grades
 */

function navigate(grade) {
    localStorage.setItem("grade", grade);
    if (grade <= 3) {
        window.location.href = ("index.html");
    } else if (grade > 3 && grade < 8) {
        window.location.href = ("index1.html");
    } else if (grade >= 8 && grade <= 12) {
        window.location.href = ("index2.html");
    }


}

