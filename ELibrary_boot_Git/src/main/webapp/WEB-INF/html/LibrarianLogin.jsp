<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Section</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>
	<%
		String role = (String) session.getAttribute("user");
		if (role.equals("true")) {
	%>

	<%@ include file="/WEB-INF/html/navlibrarian.jsp"%>
	<%@ include file="/WEB-INF/html/librariancarousel.jsp"%>

	<%
		} else {
	%>

	<%@include file="/WEB-INF/html/navhome.jsp"%>
	<div class='container'>
		<h3>Username or password error</h3>
		<%@ include file="/WEB-INF/html/librarianloginform.jsp"%>
	</div>
	<%
		}
	%>

	<%@include file="/WEB-INF/html/footer.jsp"%>
	

</body>
</html>