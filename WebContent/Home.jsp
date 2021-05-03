<%@page import="obix.model.Bureau"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<base href="${pageContext.request.contextPath}">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Tableau de bord obix</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/public/assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/public/assets/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/public/assets/css/style.css">
<!-- End layout styles -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/public/assets/images/favicon.ico" />



</head>
<body>
	<script>
      var list = [
          <c:forEach items="${temperatureBureaus}" var="hero">
            '<c:out value="${hero}" />',  
          </c:forEach>
       ];
       console.log(list);
	   console.log(list);
	</script>

	<script language='javascript'>
	
	

</script>

	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->
		<nav
			class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
			<div
				class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
				<a class="navbar-brand brand-logo" href="index.html"><img
					src="${pageContext.request.contextPath}/public/assets/images/logo.svg"
					alt="logo" /></a> <a class="navbar-brand brand-logo-mini"
					href="index.html"><img
					src="${pageContext.request.contextPath}/public/assets/images/logo-mini.svg"
					alt="logo" /></a>
			</div>
			<div class="navbar-menu-wrapper d-flex align-items-stretch">
				<button class="navbar-toggler navbar-toggler align-self-center"
					type="button" data-toggle="minimize">
					<span class="mdi mdi-menu"></span>
				</button>
				<div class="search-field d-none d-md-block">
					<form class="d-flex align-items-center h-100" action="#">
						<div class="input-group">
							<div class="input-group-prepend bg-transparent">
								<i class="input-group-text border-0 mdi mdi-magnify"></i>
							</div>
							<input type="text" class="form-control bg-transparent border-0"
								placeholder="Search projects">
						</div>
					</form>
				</div>

				<button
					class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
					type="button" data-toggle="offcanvas">
					<span class="mdi mdi-menu"></span>
				</button>
			</div>
		</nav>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">

			<!-- partial:partials/_sidebar.html -->
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
				<ul class="nav">
					<!--             <li class="nav-item nav-profile"> -->
					<!--               <a href="#" class="nav-link"> -->
					<!--                 <div class="nav-profile-image"> -->
					<!--                   <img src="${pageContext.request.contextPath}/public/assets/images/faces/face1.jpg" alt="profile"> -->
					<!--                   <span class="login-status online"></span> -->
					<!--                   change to offline or busy as needed -->
					<!--                 </div> -->
					<!--                 <div class="nav-profile-text d-flex flex-column"> -->
					<!--                   <span class="font-weight-bold mb-2">David Grey. H</span> -->
					<!--                   <span class="text-secondary text-small">Project Manager</span> -->
					<!--                 </div> -->
					<!--                 <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i> -->
					<!--               </a> -->
					<!--             </li> -->
					<li class="nav-item"><a class="nav-link" href="#"> <span
							class="menu-title">Tableau de bord</span> <i
							class="mdi mdi-home menu-icon"></i>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#"> <span
							class="menu-title">Donnée statiques</span> <i
							class="mdi mdi-crosshairs-gps menu-ico"></i>
					</a></li>



				</ul>
			</nav>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<!--             <div class="row" id="proBanner"> -->
					<!--               <div class="col-12"> -->
					<!--                 <span class="d-flex align-items-center purchase-popup"> -->
					<!--                   <p>Get tons of UI components, Plugins, multiple layouts, 20+ sample pages, and more!</p> -->
					<!--                   <a href="https://www.bootstrapdash.com/product/purple-bootstrap-admin-template?utm_source=organic&utm_medium=banner&utm_campaign=free-preview" target="_blank" class="btn download-button purchase-button ml-auto">Upgrade To Pro</a> -->
					<!--                   <i class="mdi mdi-close" id="bannerClose"></i> -->
					<!--                 </span> -->
					<!--               </div> -->
					<!--             </div> -->
					<div class="page-header">
						<h3 class="page-title">
							<span class="page-title-icon bg-gradient-primary text-white mr-2">
								<i class="mdi mdi-home"></i>
							</span> Tableau de bord
						</h3>
						<nav aria-label="breadcrumb">
							<ul class="breadcrumb">
								<li class="breadcrumb-item active" aria-current="page"><span></span>Overview
									<i
									class="mdi mdi-alert-circle-outline icon-sm text-primary align-middle"></i>
								</li>
							</ul>
						</nav>
					</div>
				
				<%
						//ArrayList<Bureau> temperatureBureaux = (ArrayList<Bureau>)request.getAttribute("bureaus");
						%>

				<pre> 
							taille  : 
				</pre>

				</div>
				<!-- content-wrapper ends -->
				<!-- partial:partials/_footer.html -->
				<footer class="footer">
					<div class="container-fluid clearfix">
						<span
							class="text-muted d-block text-center text-sm-left d-sm-inline-block">Projet
							universitaire Obix 2021</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="${pageContext.request.contextPath}/public/assets/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script
		src="${pageContext.request.contextPath}/public/assets/vendors/chart.js/Chart.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script
		src="${pageContext.request.contextPath}/public/assets/js/off-canvas.js"></script>
	<script
		src="${pageContext.request.contextPath}/public/assets/js/hoverable-collapse.js"></script>
	<script
		src="${pageContext.request.contextPath}/public/assets/js/misc.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page -->
	<script
		src="${pageContext.request.contextPath}/public/assets/js/dashboard.js"></script>
	<script
		src="${pageContext.request.contextPath}/public/assets/js/todolist.js"></script>
	<!-- End custom js for this page -->
</body>
</html>