<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Issued Book</title>
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>

	<%@include file="/WEB-INF/html/navlibrarian.jsp"%>

	<div class='container'>


		<table class='table table-bordered table-striped'>
			<tr>
				<th>Book IsbNo</th>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Student Mobile</th>
				<th>Issued Date</th>
			</tr>

			<c:if test="${empty list }">
				<%@include file="/WEB-INF/html/librarianNotFound.jsp"%>
			</c:if>

			<c:if test="${not empty list}">
				<c:forEach var="bean" items="${list}">
					<tr>
						<td><c:out value="${bean.isbno}" /></td>
						<td><c:out value="${bean.studentid}" /></td>
						<td><c:out value="${bean.studentname}" /></td>
						<td><c:out value="${bean.studentmobile}" /></td>
						<td><c:out value="${bean.issueddate}" /></td>
					</tr>
				</c:forEach>
			</c:if>

		</table>

	</div>

	<%@include file="/WEB-INF/html/footer.jsp"%>


</body>
</html>