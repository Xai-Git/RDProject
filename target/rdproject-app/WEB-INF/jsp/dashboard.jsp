<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="/../css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>
<link href="/../css/bootstrap-responsive.min.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="../ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../ico/apple-touch-icon-57-precomposed.png">
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">RightDose Dashboard</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						<a class="btn btn-navbar" data-toggle="collapse"
							data-target=".nav-collapse"> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
						</a> <a class="brand" href="/rdproject-app/login">Logout</a>
					</p>
					<ul class="nav">
						<li class="active"><a
							href="http://www.rightdosefoundation.org/">Home</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Dashboard Actions</li>
						<li><a href="/rdproject-app/drug/add">Add a Drug</a></li>
						<li><a href="/rdproject-app/organization/add">Add your
								organization info.</a>
						<li><a href="/rdproject-app/organization/edit/${user.id}">Edit
								your organization info.</a>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<div class="span9">
				<div class="hero-unit">
					<h1>Drug List</h1>
				</div>
					<div style="overflow: scroll; width: 1150px; height: 350px">
						<display:table requestURI="" name="${drugList}" id="drug"
							class="table table-bordered">
							<display:column property="drugGName" title="Gen. Name" />
							<display:column property="drugTName" title="Trade name" />
							<display:column property="drugFocus" title="Drug Focus" />
							<display:column property="routeAdmin" title="Route Admin." />
							<display:column property="reasonAdmin" title="Reason Admin." />
							<display:column property="doseWPVValue" title="Dose weight/vol." />
							<display:column property="doseWPVUnit"
								title="Dose weight/volume unit" />
							<display:column property="concWValue" title="Conc. Weight" />
							<display:column property="concWUnit" title="Conc. Weight unit" />
							<display:column property="concVValue" title="Conc. Volume" />
							<display:column property="concVUnit" title="Conc. Volume Unit" />
							<display:column property="fluidEVValue" title="Fluid E. Vol." />
							<display:column property="fluidEWVUnit"
								title="Fluid Eq. Weight/Volume Unit" />
							<display:column property="methodAdmin" title="Method Admin." />
							<display:column property="minSDWValue" title="Min. SD Weight" />
							<display:column property="minSDWUnit" title="Min. SD Wgt. Unit" />
							<display:column property="maxSDWValue" title="Max. SD Weight" />
							<display:column property="maxSDWUnit" title="Max. SD Weight Unit" />
							<display:column property="maxTTLDose" title="Max. ttl. Dose" />
							<display:column property="maxWDisplay"
								title="Max. Weight Display" />
							<display:column property="sNotes" title="Special Notes" />
							<display:column title="">
								<a href="/rdproject-app/drug/edit/${drug.id}">edit</a>
							</display:column>
							<display:column title="">
								<a href="/rdproject-app/delete/${drug.id}">delete</a>
							</display:column>
						</display:table>
					</div>
			</div>
			<!--/span-->
		</div>
		<!--/row-fluid-->
	</div>
	<!--/container-fluid-->

	<hr>

	<footer class="footer">
	<div class="container">
		<p class="pull-right">&copy; RightDose Foundation 2012</p>
	</div>

	</footer>

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
