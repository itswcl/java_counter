<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

		<!-- local JS -->
		<script type="text/javascript" src="js/app.js"></script>

		<!-- Bootstrap JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<title>Welcome</title>
	</head>

<body>

	<div class="container">
		<c:set var = "count" scope = "session" value = "${ count }"/>
		<c:if test = "${ count == 0 }">
		<h1 class="text-center">Weclome User!</h1>
		</c:if>

		<h2>You have visied <a href="/">http://localhost:8080</a> <c:out  value="${ count }"/> times.</h2>

		<c:set var = "count" scope = "session" value = "${ count }"/>
		<c:if test = "${ count > 0 }">
		<a class="btn btn-primary" href="/reset">Reset</a>
		</c:if>
		
	</div>

</body>
</html>