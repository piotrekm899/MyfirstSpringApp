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
    <title>Survey</title>

    <style>
        .errors {color: red}
    </style>

</head>
<body>

Please complete the survey and hit submit button.
* means that the field is required.

<br><br>

 <form:form action="processForm" modelAttribute="respondent">

    First Name*:

     <br>
    
        <form:input path="name"/>
        <form:errors path="name" cssClass="errors"/>

     <br><br>

    Last Name*:

    <br>

     <form:input path="lastName"/>
     <form:errors path="lastName" cssClass="errors"/>

     <br><br>

     Age: <br>
     <form:input path="age"/>
     <form:errors path="age" cssClass="errors"/>

     <br><br>

     Postal Code: <br>
     <form:input path="postalCode" placeholder="XX-XXX"/>
         <form:errors path="postalCode" cssClass="errors"/>

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

     What are your car's plates? <br>

     <form:input path="carPlates" placeholder ="must start with KR"/>
     <form:errors path="carPlates" cssClass="errors"/>

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