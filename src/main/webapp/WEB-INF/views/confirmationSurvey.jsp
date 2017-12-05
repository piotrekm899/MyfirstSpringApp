<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 23.11.2017
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Confirmation</title>
</head>
<body>

Thank you for submitting your answer!<br><br>

Please find the details you entered below:<br><br>

First name: ${respondent.name}<br>
Last name: ${respondent.lastName}<br>
Age: ${respondent.age}<br>
Postal Code: ${respondent.postalCode}<br>
Country: ${respondent.countryFile}<br>
Car Plates: ${respondent.carPlates}<br>
Driving license: ${respondent.drivingLicence}<br>
Favourite car(s):
<ul>
    <c:forEach var="temp" items="${respondent.favouriteCar}">
        <li>${temp}</li>
    </c:forEach>
</ul>

<br><br>
<hr><a href="survey"> Go back to survey page </a>
<br><br>
<hr><a href="/"> Go back to homepage </a>

</body>
</html>
