<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveEmployee">
CODE<input type="text" name="code"/>
NAME<input type="text" name="name"/>
<input type="submit">

</form>
<table>
<c:forEach items="${employeelist}" var="employee" >
<tr>

<td>${employee.code }</td>
<td>${employee.name }</td>
</tr>
</c:forEach>
</table>


</body>
</html>