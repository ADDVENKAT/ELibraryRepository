<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Book Form</title>
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />
</head>
<body>


	<%@include file="/WEB-INF/html/navlibrarian.jsp"%>

	<div class='container'>
		<form action="SearchBookForm" method="post" style="width: 300px"
			onsubmit="return validate()">
			<div class="form-group">
				<label for="isbno1">IsbNumber</label> <input type="text"
					class="form-control" name="isbno" id="isbno1" placeholder="Isbno"
					onblur="validateIsbNo()" /><span id="checkIsbno1"
					style="color: red"></span>
			</div>
			<div class="form-group">
				<label for="author1">Author</label> <input type="text"
					class="form-control" name="author" id="author1"
					placeholder="Author" onblur="validateAuthor()" /><span
					id="checkAuthor1" style="color: red"></span>
			</div>
			<button type="submit" class="btn btn-primary">Search Book</button>
		</form>
	</div>


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

		function validateAuthor() {
			var author = document.getElementById("author1").value;
			if (author == "" || author == null) {
				document.getElementById("checkAuthor1").innerHTML = 'Author Name Should Not Empty or Null !';
				return false;
			} else {

				document.getElementById("checkAuthor1").innerHTML = '';
				return true;
			}

		}

		function validate() {

			var isbno = document.getElementById("isbno1").value;
			var author = document.getElementById("author1").value;

			if (isbno == "" || isbno == null) {
				return false;
			}

			if (author == "" || author == null) {
				return false;
			}

			return true;

		}
	</script>


	<%@include file="/WEB-INF/html/footer.jsp"%>



</body>
</html>