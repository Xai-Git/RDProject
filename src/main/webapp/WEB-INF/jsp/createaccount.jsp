<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Account Creation</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	S padding-bottom: 40px;
}
</style>
<link href="../css/bootstrap-responsive.min.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="../assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
</head>
<body>
	<div style="width: 100%">
		<div style="width: 800px; margin: 0 auto;">
			<div class="navbar navbar-inverse navbar-fixed-top">
				<div class="navbar-inner">
					<div class="container-fluid">
						<a class="btn btn-navbar" data-toggle="collapse"
							data-target=".nav-collapse"> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
						</a> <a class="brand" href="/rdproject-app/login">Back to login</a>
						<div class="nav-collapse collapse">
							<ul class="nav">
								<li><a href="#about">About</a></li>
								<li><a href="#contact">Contact</a></li>
							</ul>
						</div>
						<!--/.nav-collapse -->
					</div>
				</div>
			</div>

			<div class="container">
				<h1>Creating Page!</h1>
				<form:form modelAttribute="createAcctForm">
					<div class="text-error">
						<form:errors />
					</div>
					<legend>Account Creation</legend>
					<label>username</label>
					<form:input path="username" placeholder="username" />
					<form:errors path="username" cssClass="text-error" />
					<label>Password</label>
					<form:password path="password" placeholder="password" />
					<form:errors path="password" cssClass="text-error" />
					<label>RePassword</label>
					<form:password path="rePassword" placeholder="retype password" />
					<form:errors path="rePassword" cssClass="text-error" />
					<button type="submit" class="btn">Submit</button>
				</form:form>
			</div>
			<!-- /container -->

			<!-- Le javascript
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
		</div>
	</div>
</body>
</html>
