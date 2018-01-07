<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<h3>Add Librarian</h3>
	<form action="AddLibrarian" method="post" style="width: 300px"
		onsubmit="return validate() ">
		<div class="form-group">
			<label for="name1">Name</label> <input type="text"
				class="form-control" name="name" id="name1" placeholder="Name"
				onblur="validateName()" /><span id="checkName1" style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="email1">Email address</label> <input type="email"
				class="form-control" name="email" id="email1" placeholder="Email"
				onblur="validateEmail()" /><span id="checkEmail1"
				style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="password1">Password</label> <input type="password"
				class="form-control" name="password" id="password1"
				placeholder="Password" onblur="validatePassword()" /><span
				id="checkPassword1" style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="mobile1">Mobile Number</label> <input type="number"
				class="form-control" name="mobile" id="mobile1" placeholder="Mobile"
				onblur="validateMobile()" /><span id="checkMobile1"
				style="color: red"></span>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<script type="text/javascript">
		function validateName() {

			var name = document.getElementById("name1").value;

			if (name == "" || name == null) {
				document.getElementById("checkName1").innerHTML = 'Name Should Not Be Empty or Null !';
				return false;
			} else {
				document.getElementById("checkName1").innerHTML = '';
				return true;
			}

		}

		function validateEmail() {

			var name = document.getElementById("email1").value;

			if (name == "" || name == null) {
				document.getElementById("checkEmail1").innerHTML = 'Email Should Not Be Empty or Null !';
				return false;
			} else {
				document.getElementById("checkEmail1").innerHTML = '';
				return true;
			}

		}

		function validatePassword() {
			var password = document.getElementById("password1").value;
			if (password == "" || password == null) {
				document.getElementById("checkPassword1").innerHTML = 'Password Should Not Be Empty or Null !';
				return false;
			} else {
				document.getElementById("checkPassword1").innerHTML = '';
				return true;
			}

		}

		function validateMobile() {

			var mobile = document.getElementById("mobile1").value;

			if (mobile == "" || mobile == null) {
				document.getElementById("checkMobile1").innerHTML = 'Mobile No Should Not Be Empty or Null !';
				return false;
			} else {
				document.getElementById("checkMobile1").innerHTML = '';
				return true;
			}

		}

		function validate() {

			var name = document.getElementById("name1").value;
			var password = document.getElementById("password1").value;
			var email = document.getElementById("mobile1").value;
			var mobile = document.getElementById("mobile1").value;

			if (name == "" || name == null) {
				return false;
			}

			if (password == "" || password == null) {
				return false;
			}

			if (email == "" || email == null) {
				return false;
			}

			if (mobile == "" || mobile == null) {
				return false;
			}

			return true;

		}
	</script>


</body>
</html>