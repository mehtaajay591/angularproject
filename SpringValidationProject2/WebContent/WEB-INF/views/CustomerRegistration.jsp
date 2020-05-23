<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Customer Registration Page</h1>

<sf:form action="registerAction" modelAttribute="customer" method="post">
<table>
<tr>
<td>
<sf:label path="firstName">Enter first name :</sf:label>
</td>
<td>
<sf:input path="firstName"/>
</td>
<td><sf:errors path="firstName"></sf:errors></td>
</tr>
<tr>
<td>
<sf:label path="lastName">Enter Last name :</sf:label>
</td>
<td>
<sf:input path="lastName"/>
</td>
<td><sf:errors path="lastName"></sf:errors></td>
</tr>
<tr>
<td>
<sf:label path="age">Enter Age :</sf:label>
</td>
<td>
<sf:input path="age"/>
</td>

<td><sf:errors path="age"></sf:errors></td>
</tr>
<tr>
<td>
<sf:label path="email">Enter Email :</sf:label>
</td>

<td><sf:errors path="email"></sf:errors></td>
<td>
<sf:input path="email"/>
</td>

</tr>
<tr>
<td>
<sf:label path="mobileNo">Enter Mobile no :</sf:label>
</td>
<td>
<sf:input path="mobileNo"/>
</td>
</tr>

<tr>
<td>
<input type="submit" value="Register"/>
</td>

</tr>
</table>
</sf:form>
</body>
</html>