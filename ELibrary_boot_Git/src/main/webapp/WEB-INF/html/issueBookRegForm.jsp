<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issue Book Form</title>
</head>
<body>

	<form action="IssueBook" method="post" style="width: 300px" onsubmit="return validate()">
		<div class="form-group">
			<label for="isbno1">Book IsbNo</label> <input type="text"
				class="form-control" name="isbno" id="isbno1" placeholder="Isbno"
				onblur="validateIsbNo()" /><span id="checkIsbno1"
				style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="id1">Student Id</label> <input type="text"
				class="form-control" name="studentid" id="studentid1"
				placeholder="Student Id" onblur="validateStudentId()" /><span
				id="checkStudentId1" style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="name1">Student Name</label> <input type="text"
				class="form-control" name="studentname" id="studentname1"
				placeholder="Student Name" onblur="validateStudentName()" /><span
				id="checkStudentName1" style="color: red"></span>
		</div>
		<div class="form-group">
			<label for="mobile1">Student Mobile</label> <input type="number"
				class="form-control" name="studentmobile" id="studentmobile1"
				placeholder="Student Mobile" onblur="validateStudentMobile()" /><span
				id="checkStudentMobile1" style="color: red"></span>
		</div>

		<div class="form-group">
			<label for="issueddate1">Issued Date</label> <input type="date"
				class="form-control" name="issueddate" id="issueddate1"
				placeholder="Issued Date" onblur="validateIssuedDate()" /><span
				id="checkIssedDate1" style="color: red"></span>
		</div>


		<button type="submit" class="btn btn-primary">Issue Book</button>
	</form>

	<script type="text/javascript">
		function validateIsbNo() {

			var isbno = document.getElementById("isbno1").value;

			if (isbno == "" || isbno == null) {
				document.getElementById("checkIsbno1").innerHTML = 'Book Isbno Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkIsbno1").innerHTML = '';
				return true;
			}

		}

		function validateStudentId() {
			var studentid = document.getElementById("studentid1").value;
			if (studentid == "" || studentid == null) {
				document.getElementById("checkStudentId1").innerHTML = 'StudentId Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkStudentId1").innerHTML = '';
				return true;
			}

		}

		function validateStudentName() {
			var studentname = document.getElementById("studentname1").value;
			if (studentname == "" || studentname == null) {
				document.getElementById("checkStudentName1").innerHTML = 'Student Name Should Not Empty or Null !';
				return false;
			} else {

				document.getElementById("checkStudentName1").innerHTML = '';
				return true;
			}

		}

		function validateStudentMobile() {
			var studentmobile = document.getElementById("studentmobile1").value;
			if (studentmobile == "" || studentmobile == null) {
				document.getElementById("checkStudentMobile1").innerHTML = 'Student Mobile Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkStudentMobile1").innerHTML = '';
				return true;
			}

		}

		function validateIssuedDate() {
			var issueddate = document.getElementById("issueddate1").value;
			if (issueddate == "" || issueddate == null) {
				document.getElementById("checkIssuedDate1").innerHTML = 'Issued Date Should Not Empty or Null !';
				return false;
			} else {
				document.getElementById("checkIssuedDate1").innerHTML = '';
				return true;
			}

		}

		function validate() {

			var isbno = document.getElementById("isbno1").value;
			var studentid = document.getElementById("studentid1").value;
			var studentname = document.getElementById("studentname1").value;
			var studentmobile = document.getElementById("studentmobile1").value;
			var issueddate = document.getElementById("issueddate1").value;

			if (isbno == "" || isbno == null) {
				return false;
			}

			if (studentid == "" || studentid == null) {
				return false;
			}

			if (studentname == "" || studentname == null) {
				return false;
			}

			if (studentmobile == "" || studentmobile == null) {
				return false;
			}

			if (issueddate == "" || issueddate == null) {
				return false;
			}

			return true;

		}
	</script>




</body>
</html>