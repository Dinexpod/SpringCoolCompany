<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 30.01.2019
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/resources/styles/style1.css"/>
    <title>CreateDeveloper</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<div id="login">
<body>
<h1>
    Enter Developer's details
</h1>
<form method="POST"
      action="${pageContext.request.contextPath}/developer/addDev" modelattribute="developer">
<%--<form:form method="POST"--%>
           <%--action="/TheBestSpringProject_war_exploded/developer/addDev" modelAttribute="developer">--%>
    <span class="fontawesome-user"></span>
    <input  name="developerName" type="text" id="developerName" placeholder="developerName">

    <span class="fontawesome-user"></span>
    <input  name="developerAge" type="text" id="developerAge" placeholder="developerAge">

    <span class="fontawesome-user"></span>
    <input  name="developerSalary" type="text" id="developerSalary" placeholder="developerSalary">

    <input type="submit" value="Submit"/>
    </form>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="developerName">Name</form:label></td>--%>
            <%--<td><form:input path="developerName"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="developerAge">Age</form:label></td>--%>
            <%--<td><form:input path="developerAge"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="developerSalary">Salary</form:label></td>--%>
            <%--<td><form:input path="developerSalary"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><input type="submit" value="Submit"/></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
</body>
    </div>
</html>