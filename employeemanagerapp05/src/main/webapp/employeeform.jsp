<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
    <h2><spring:message code="lbl.page" text="Add New Employee" /></h2>
    <br/>
    <form:form target="employeeformn" method="POST">  
    <p>${error}</p>
	<p>Enter ID: <form:input path="id" /> </p>
	<p>Enter Name: <form:path="name" /> </p>
	<p>Enter Age: <form:path="age" /> </p>
	<p>Enter Designation: <form:path="designation" /> </p>
	<p>Enter Department: <form:path="department" /> </p>
	<p>Enter Country: <form:path="country" /> </p>
           
                <p><button type="submit" value="Submit">Submit</button> <button type="reset" value="Reset">Reset</button> </p>
</form:form>
</body>
</html>