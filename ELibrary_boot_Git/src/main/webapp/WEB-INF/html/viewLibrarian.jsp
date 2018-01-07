<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Librarian</title>
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>

	<%@include file="/WEB-INF/html/navadmin.jsp"%>
	<div class='container'>

		<table class='table table-bordered table-striped'>

			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Mobile</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<c:if test="${empty list }">

				<%@include file="/WEB-INF/html/librarianNotFound.jsp"%>

			</c:if>



			<c:if test="${not empty list}">

				<c:forEach var="bean" items="${list}">
					<tr>
						<td><c:out value="${bean.id}" /></td>
						<td><c:out value="${bean.name}" /></td>
						<td><c:out value="${bean.email}" /></td>
						<td><c:out value="${bean.password}" /></td>
						<td><c:out value="${bean.mobile}" /></td>
						<td><a
							href='EditLibrarianForm?id=<c:out value="${bean.id}"/>'>Edit</a></td>
						<td><a
							href='DeleteLibrarian?id=<c:out value="${bean.id}"/>'>Delete</a></td>
					</tr>
				</c:forEach>

			</c:if>

		</table>

	</div>

	<%@include file="footer.jsp"%>


</body>
</html>