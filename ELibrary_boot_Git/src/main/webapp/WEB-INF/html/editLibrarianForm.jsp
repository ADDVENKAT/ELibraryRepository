<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Librarian Form</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>
	<%@include file="/WEB-INF/html/navadmin.jsp"%>

	<div class='container'>
		
		<form action='EditLibrarian' method='post' style='width: 300px'>
			<div class='form-group'>
				<input type='hidden' name='id' value=<c:out value="${bean.id}"/> /> <label
					for='name1'>Name</label> <input type='text' class='form-control'
					value=<c:out value="${bean.name}"/> name='name' id='name1'
					placeholder='Name' />
			</div>
			<div class='form-group'>
				<label for='email1'>Email address</label> <input type='email'
					class='form-control' value=<c:out value="${bean.email}"/> name='email'
					id='email1' placeholder='Email' />
			</div>
			<div class='form-group'>
				<label for='password1'>Password</label> <input type='password'
					class='form-control' value=<c:out value="${bean.password}"/> name='password'
					id='password1' placeholder='Password' />
			</div>
			<div class='form-group'>
				<label for='mobile1'>Mobile Number</label> <input type='number'
					class='form-control' value=<c:out value="${bean.mobile}"/> name='mobile'
					id='mobile1' placeholder='Mobile' />
			</div>
			<button type='submit' class='btn btn-primary'>Update</button>
		</form>

	</div>
	<%@include file="/WEB-INF/html/footer.jsp"%>

</body>
</html>