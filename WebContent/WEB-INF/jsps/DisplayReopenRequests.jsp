<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Reopen Request List</h1>

<table border="1px">
<tr>
	<th>Rid</th>
	<th>eid</th>
	<th>date</th>
	<th>reason</th>
	<th>status</th>
	<th>Action</th>
</tr>
<c:forEach items="${requestScope.list}" var="reopen">
<tr>
	<td>${reopen.rId}</td>	<!-- property name and not field name  -->
	<td>${reopen.eId}</td>
	<td>${reopen.reopenDate}</td>
	<td>${reopen.reopenReason}</td>
	<td>${reopen.reopenStatus}</td>
	<td><a href="updateAprrove.mt?id=${reopen.rId}">approve</a>
	<a href="updateReject.mt?id=${reopen.rId}">Reject</a></td>
</tr>
</c:forEach>
</table>	
</body>
</html>