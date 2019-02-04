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
    <title>CreateDeveloper</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<body>
<h1>
    Enter Developer's details
</h1>
<form:form method="POST"
           action="/TheBestSpringProject_war_exploded/developer/addDev" modelAttribute="developer">

    <table>
        <tr>
            <td><form:label path="developerName">Name</form:label></td>
            <td><form:input path="developerName"/></td>
        </tr>
        <tr>
            <td><form:label path="developerAge">Age</form:label></td>
            <td><form:input path="developerAge"/></td>
        </tr>
        <tr>
            <td><form:label path="developerSalary">Salary</form:label></td>
            <td><form:input path="developerSalary"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>