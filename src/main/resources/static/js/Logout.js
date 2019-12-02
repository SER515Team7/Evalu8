
jQuery(document).ready(function() {

    Parse.$ = jQuery;
    Parse.initialize("...", "...");

    $('.form-logout').on('submit', function (e) {
        // Prevent Default Submit Event
        e.preventDefault();

        console.log("Performing submit");

        //logout current user
        if ( Parse.User.current() ) {
            Parse.User.logOut();

            // check if really logged out
            if (Parse.User.current())
                console.log("Failed to log out!");
        }

        // Change color of logout button
        var str = "LogOut!";
        var result = str.fontcolor("blue");
       
        window.location.href = "/Sign_In.html";
    });
});
