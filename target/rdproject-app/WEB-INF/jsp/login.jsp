<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>RightDose Foundation</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link
	href="../css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>
<link
	href="../css/bootstrap-responsive.min.css"
	rel="stylesheet">

<!--  HTML5 shim for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<!-- Le fav and touch icons -->
<link rel="shortcut icon"
	href="twitter-bootstrap-v2/docs/examples/images/favicon.ico">
<link rel="apple-touch-icon"
	href="twitter-bootstrap-v2/docs/examples/images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="twitter-bootstrap-v2/docs/examples/images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="twitter-bootstrap-v2/docs/examples/images/apple-touch-icon-114x114.png">
</head>

<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="#">RightDose Login</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="http://www.rightdosefoundation.org/">Home</a></li>
						<form:form modelAttribute="loginForm" class="navbar-form pull-right">
						    <form:errors cssClass="text-error"/>
							<form:input class="span2" path="username" placeholder="Username"/>
							<form:errors path="username" cssClass="text-error"/>
							<form:password class="span2" path="password" placeholder="Password"/>
							<form:errors path="password" cssClass="text-error"/>
							<button type="submit" class="btn btn-small btn-primary">Login</button>
							<a href="/rdproject-app/createaccount">Create Account</a>
						</form:form>
					</ul>
				</div>
			</div>
		</div>
	</div>


	<div class="container">
		<div class="hero-unit">
			<h1>The RightDose Foundation</h1>
		</div>

		<hr>

		<footer>
		<p>&copy; RightDose Foundation 2012</p>
		</footer>
	</div>
	<!-- javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../assets/js/jquery.js"></script>
	<script src="../assets/js/bootstrap-transition.js"></script>
	<script src="../assets/js/bootstrap-alert.js"></script>
	<script src="../assets/js/bootstrap-modal.js"></script>
	<script src="../assets/js/bootstrap-dropdown.js"></script>
	<script src="../assets/js/bootstrap-scrollspy.js"></script>
	<script src="../assets/js/bootstrap-tab.js"></script>
	<script src="../assets/js/bootstrap-tooltip.js"></script>
	<script src="../assets/js/bootstrap-popover.js"></script>
	<script src="../assets/js/bootstrap-button.js"></script>
	<script src="../assets/js/bootstrap-collapse.js"></script>
	<script src="../assets/js/bootstrap-carousel.js"></script>
	<script src="../assets/js/bootstrap-typeahead.js"></script>

</body>
</html>
