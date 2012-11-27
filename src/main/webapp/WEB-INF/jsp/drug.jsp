<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Drug Information</title>
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
		<h1>Adding new drug!</h1>
		<form:form modelAttribute="drugForm">
			<div class="text-error">
				<form:errors />
			</div>
			<legend>Drug Information</legend>
			<div class="row-fluid">
				<div class="span6">
					<label>Drug Generic Name</label>
					<form:input path="drugGName" />
					<form:errors path="drugGName" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Drug Trade name</label>
					<form:input path="drugTName" />
					<form:errors path="drugTName" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Drug Focus</label>
					<form:input path="drugFocus" />
					<form:errors path="drugFocus" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Route of Administration</label>
					<form:input path="routeAdmin" />
					<form:errors path="routeAdmin" cssClass="text-error" />
				</div>

				<div class="span6">
					<label>Reason for Administration</label>
					<form:input path="reasonAdmin" />
					<form:errors path="reasonAdmin" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Dose Unit Value</label>
					<form:input path="doseWPVValue" />
					<form:errors path="doseWPVValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Dose Unit</label>
					<form:input path="doseWPVUnit" />
					<form:errors path="doseWPVUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Concentration Weight Value</label>
					<form:input path="concWValue" />
					<form:errors path="concWValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Concentration Weight Unit</label>
					<form:input path="concWUnit" />
					<form:errors path="concWUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Concentration Volume Value</label>
					<form:input path="concVValue" />
					<form:errors path="concVValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Concentration Volume Unit</label>
					<form:input path="concVUnit" />
					<form:errors path="concVUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Fluid Equivalent Volume Value</label>
					<form:input path="fluidEVValue" />
					<form:errors path="fluidEVValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Fluid Equivalent Weight/Volume unit</label>
					<form:input path="fluidEWVUnit" />
					<form:errors path="fluidEWVUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Method of Administration</label>
					<form:input path="methodAdmin" />
					<form:errors path="methodAdmin" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Minimum Single-Dose Weight Value</label>
					<form:input path="minSDWValue" />
					<form:errors path="minSDWValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Minimum Single-Dose Weight Unit</label>
					<form:input path="minSDWUnit" />
					<form:errors path="minSDWUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Maximum Single-Dose Value</label>
					<form:input path="maxSDWValue" />
					<form:errors path="maxSDWValue" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Maximum Single-Dose Unit</label>
					<form:input path="maxSDWUnit" />
					<form:errors path="maxSDWUnit" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Maximum Total Dose</label>
					<form:input path="maxTTLDose" />
					<form:errors path="maxTTLDose" cssClass="text-error" />
				</div>
				<div class="span6">
					<label>Maximum Weight Display</label>
					<form:input path="maxWDisplay" />
					<form:errors path="maxWDisplay" cssClass="text-error" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="span6">
					<label>Special Notes</label>
					<form:input path="sNotes" />
					<form:errors path="sNotes" cssClass="text-error" />
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
