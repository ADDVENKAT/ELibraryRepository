<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Section</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>


	<%
		String role = (String) session.getAttribute("admin");
		if (role.equals("true")) {
	%>

	<%@ include file="/WEB-INF/html/navadmin.jsp"%>
	<%@ include file="/WEB-INF/html/admincarousel.jsp"%>

	<%
		} else {
	%>

	<%@include file="/WEB-INF/html/navhome.jsp"%>
	<div class='container'>
		<h3>Username or password error</h3>
		<%@ include file="/WEB-INF/html/adminloginform.jsp"%>
	</div>
	<%
		}
		
	%>

	<%@include file="/WEB-INF/html/footer.jsp"%>
	



	<%-- <%
		String role = (String) session.getAttribute("admin");
		if (role.equals("true")) {
			request.getRequestDispatcher("navadmin.html").include(request, response);
			request.getRequestDispatcher("admincarousel.html").include(request, response);
		} else {
			request.getRequestDispatcher("navhome.html").include(request, response);
			out.println("<div class='container'>");
			out.println("<h3>Username or password error</h3>");
			request.getRequestDispatcher("adminloginform.html").include(request, response);
			out.println("</div>");
		}

		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	%>
 --%>

</body>
</html>