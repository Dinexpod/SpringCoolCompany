<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 04.02.2019
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/resources/styles/style1.css"/>
    <title>registration</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<div id="login">

    <body>


    <form name='form-login'>
        <span class="fontawesome-user"></span>
        <input type="text" id="email" placeholder="Email">

        <span class="fontawesome-user"></span>
        <input type="text" id="user" placeholder="Username">

        <span class="fontawesome-user"></span>
        <input type="text" id="name" placeholder="Name">

        <span class="fontawesome-user"></span>
        <input type="text" id="last name" placeholder="Last name">

        <span class="fontawesome-lock"></span>
        <input type="password" id="pass" placeholder="Password">

        <input type="submit" value="Authorization">



    </form>

    </body>
</div>
</html>