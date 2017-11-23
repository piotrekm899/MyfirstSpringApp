<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 23.11.2017
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Surveyt</title>
</head>
<body>

Please complete the survey and hit submit button.

<br><br>

 <form:form action="processForm" modelAttribute="respondent">

    First Name:

     <br>
    
        <form:input path="name"/>

     <br><br>

    Last Name:

    <br>

     <form:input path="lastName"/>

     <br><br>

    Country:

    <br>

     <form:select path="countryFile">
         <form:options items="${theCountryOptionsFile}" />
     </form:select>

     <br><br>

    Do you have a driving licence?

    <br>

     Yes <form:radiobutton path="drivingLicence" value="Yes"/>
     No <form:radiobutton path="drivingLicence" value="No"/>
     
    <br><br>

    Favourite car(s) (multiple choice):

    <br>
     
     <form:checkbox path="favouriteCar" value="Audi"/> Audi <br>
     <form:checkbox path="favouriteCar" value="Volkswagen"/> Volkswagen <br>
     <form:checkbox path="favouriteCar" value="Fiat"/> Fiat <br>
     <form:checkbox path="favouriteCar" value="BMW"/> BMW <br>
     <form:checkbox path="favouriteCar" value="Mercedes"/> Mercedes <br>

    <br><br>

     <input type="submit" value="submit">

 </form:form>

</body>
</html>