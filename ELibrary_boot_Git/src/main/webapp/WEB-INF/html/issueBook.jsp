<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Object obj = session.getAttribute("issuebook");
		if (obj != null) {

			String role = (String) obj;
			if (role.equals("true")) {
	%>

	<div style="color: blue" align="center">
		<center>Issued Book records saved sucessfully ...</center>
	</div>

	<%
		}else{
	%>
		<div style="color: blue" align="center">
			<center>Issued Book records saved sucessfully ...</center>
		</div>
   
   <%
		}

		}
	%>

</body>
</html>