<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 31.01.2019
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jqueryDev</title>
</head>
<body>

<div id="allDevelopers">

</div>


<script
        src="https://code.jquery.com/jquery-3.3.1.js"
        integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
        crossorigin="anonymous"></script>

<script>
    $.ajax({
        type : 'GET',
        url : '/developer/all',
        success : function(resp){
            console.log("get all developers" + resp)
            drawDevelopers(resp);
        },
        error: function(error){
            console.log("get all developers" + error);
        },
        dataType: 'json'
    });

    function drawDevelopers(developers) {
        for (var i = 0; i < developers.length; i++) {
            var result = $("<h3>" + developers[i].name + "</h3>");
            $("#allDevelopers").append(result);
        }
    }
</script>

</body>
</html>
