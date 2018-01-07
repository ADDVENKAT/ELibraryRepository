<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">eLibrary</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="index.html" class="active">Home</a></li>
					<li><a href="#">Admin</a></li>
					<li><a href="#">Librarian</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="container-fluid">
		<h1>eLibrary</h1>

		<div class="row">
			<div class="col-md-6">
				<h3>Admin Login</h3>
				<form action="adminlogin" method="post" style="width: 300px">
					<div class="form-group">
						<label for="email1">Email address</label> <input type="email"
							class="form-control" name="email" id="email1" placeholder="Email"
							onblur="validateAdminEmail()" /><span id="checkEmail1"
							style="color: red"></span>
					</div>
					<div class="form-group">
						<label for="password1">Password</label> <input type="password"
							class="form-control" name="password" id="password1"
							placeholder="Password" onblur="validateAdminPassword()" /><span
							id="checkPassword1" style="color: red"></span>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
				<%
					Object obj = session.getAttribute("admin");
					if (obj != null) {
						String role = (String) obj;
						if (role.equals("false")) {
				%>
				<div style="color: red">Username or Password is invalid !
					Please check once...</div>
				<%
					}
					}
				%>

			</div>
			<div class="col-md-6">
				<h3>Librarian Login</h3>
				<form action="librarianlogin" method="post" style="width: 300px">
					<div class="form-group">
						<label for="email1">Email address</label> <input type="email"
							class="form-control" id="email2" name="email" placeholder="Email"
							onblur="validateLibrarianEmail()" /><span id="checkEmail2"
							style="color: red"></span>

					</div>
					<div class="form-group">
						<label for="password1">Password</label> <input type="password"
							class="form-control" id="password2" name="password"
							placeholder="Password" onblur="validateLibrarianPassword()" /><span
							id="checkPassword2" style="color: red"></span>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
				<%
					Object obj1 = session.getAttribute("user");
					if (obj1 != null) {
						String role = (String) obj1;
						if (role.equals("false")) {
				%>
				<div style="color: red">Username or Password is invalid !
					Please check once...</div>
				<%
					}
					}
				%>

			</div>
		</div>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<script type="text/javascript">
		function validateAdminEmail() {

			var email1 = document.getElementById("email1").value;

			if (email1 == "" || email1 == null) {
				document.getElementById("checkEmail1").innerHTML = 'Email Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkEmail1").innerHTML = '';
				return true;
			}

		}

		function validateAdminPassword() {
			var password1 = document.getElementById("password1").value;
			if (password1 == "" || password1 == null) {
				document.getElementById("checkPassword1").innerHTML = 'Password Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkPassword1").innerHTML = '';
				return true;
			}

		}

		function validateLibrarianEmail() {
			var email2 = document.getElementById("email2").value;
			if (email2 == "" || email2 == null) {
				document.getElementById("checkEmail2").innerHTML = 'Email Should Not Empty or Null !';
				return false;
			} else {

				document.getElementById("checkEmail2").innerHTML = '';
				return true;
			}

		}

		function validateLibrarianPassword() {
			var password2 = document.getElementById("password2").value;
			if (password2 == "" || password2 == null) {
				document.getElementById("checkPassword2").innerHTML = 'Email Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkPassword2").innerHTML = '';
				return true;
			}

		}

		function validateAdmin() {

			var email1 = document.getElementById("email1").value;
			var password1 = document.getElementById("password1").value;

			if (email1 == "" || email1 == null) {
				return false;
			}

			if (password1 == "" || password1 == null) {
				return false;
			}

			return true;

		}

		function validateLibrarian() {
			var email2 = document.getElementById("email2").value;
			var password2 = document.getElementById("password2").value;

			if (email2 == "" || email2 == null) {
				return false;
			}

			if (password2 == "" || password2 == null) {
				return false;
			}

			return true;

		}
	</script>


</body>
</html>