<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Organization Information</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="/../css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	S padding-bottom: 40px;
}
</style>
<link href="/../css/bootstrap-responsive.min.css" rel="stylesheet">

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

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="/rdproject-app/dashboard">Back to
					Dashboard</a>
			</div>
		</div>
	</div>

	<div class="container">
		<form:form modelAttribute="orgForm">
			<div class="text-error">
				<form:errors />
			</div>
			<legend>Organization info.</legend>
			<div class="row-fluid">
				<div class="span4">
					<label>Organization Name</label>
					<form:input path="orgName" />
					<form:errors path="orgName" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Director Title</label>
					<form:input path="dirTitle" />
					<form:errors path="dirTitle" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Contact Title</label>
					<form:input path="conTitle" />
					<form:errors path="conTitle" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Address 1</label>
					<form:input path="orgAddr1" />
					<form:errors path="orgAddr1" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. First Name</label>
					<form:input path="dirFName" />
					<form:errors path="dirFName" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. First Name</label>
					<form:input path="conFName" />
					<form:errors path="conFName" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Address 2</label>
					<form:input path="orgAddr2" />
					<form:errors path="orgAddr2" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Middle Name</label>
					<form:input path="dirMName" />
					<form:errors path="dirMName" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Middle Name</label>
					<form:input path="conMName" />
					<form:errors path="conMName" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. City</label>
					<form:input path="orgCity" />
					<form:errors path="orgCity" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Last Name</label>
					<form:input path="dirLName" />
					<form:errors path="dirLName" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Last Name</label>
					<form:input path="conLName" />
					<form:errors path="conLName" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. State</label>
					<form:input path="orgState" />
					<form:errors path="orgState" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Suffix</label>
					<form:input path="dirSuffix" />
					<form:errors path="dirSuffix" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Suffix</label>
					<form:input path="conSuffix" />
					<form:errors path="conSuffix" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Zip Code</label>
					<form:input path="orgZip" />
					<form:errors path="orgZip" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Phone #</label>
					<form:input path="dirPhone" />
					<form:errors path="dirPhone" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Phone #</label>
					<form:input path="conPhone" />
					<form:errors path="conPhone" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Web</label>
					<form:input path="orgWeb" />
					<form:errors path="orgAddr2" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Extention</label>
					<form:input path="dirExt" />
					<form:errors path="dirExt" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Fax</label>
					<form:input path="conFax" />
					<form:errors path="dirExt" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Phone #</label>
					<form:input path="orgPhone" />
					<form:errors path="orgPhone" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Fax</label>
					<form:input path="dirFax" />
					<form:errors path="dirFax" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Con. Email</label>
					<form:input path="conEmail" />
					<form:errors path="conEmail" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Fax</label>
					<form:input path="orgFax" />
					<form:errors path="orgFax" cssClass="text-error" />
				</div>
				<div class="span4">
					<label>Dir. Email</label>
					<form:input path="dirEmail" />
					<form:errors path="dirMName" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<label>Org. Email</label>
					<form:input path="orgEmail" />
					<form:errors path="orgEmail" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6 offset 6">
					<button type="submit" class="btn">Submit</button>
				</div>
			</div>
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

</body>
</html>
