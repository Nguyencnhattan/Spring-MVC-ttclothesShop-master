<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><dec:title default="Trang chủ" /></title>

<meta name="viewport" http-equiv="Content-Type"	content="width=device-width, initial-scale=1, shrink-to-fit=no, text/html">
   <title>TTClothes Shop</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link rel="shortcut icon" href="<c:url value="images/favicon.ico" />" type="image/x-icon">
    <link rel="apple-touch-icon" href="<c:url value="images/apple-touch-icon.png" />">

	<link rel="stylesheet"	href="<c:url value='/template/web/css/bootstrap.min.css' />" />
	<link rel="stylesheet"	href="<c:url value='/template/web/css/style.css' />" />
	<link rel="stylesheet"	href="<c:url value='/template/web/css/responsive.css' />" />
	<link rel="stylesheet"	href="<c:url value='/template/web/css/custom.css' />" />
	<script	src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
	
	<style>
	 .all-title-box{
	 	background: url(<c:url value="/images/all-bg-title.jpg" />) no-repeat center center;
	 }
	</style>
</head>
<body>
	
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->

	<!-- Page Content -->

		<dec:body />

	<!-- Page Content -->

	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- footer -->
	
	<!-- ALL JS FILES -->
	<script type="text/javascript" src="<c:url value='/template/web/js/popper.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/bootstrap.min.js' />"></script>
<%-- 	<script type="text/javascript" src="<c:url value='/template/web/js/jquery-3.2.1.min.js' />"></script>
 --%>	<!-- ALL PLUGINS -->
	<script type="text/javascript" src="<c:url value='/template/web/js/jquery.superslides.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/bootstrap-select.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/inewsticker.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/bootsnav.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/images-loded.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/isotope.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/owl.carousel.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/baguetteBox.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/form-validator.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/contact-form-script.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/custom.js' />"></script>
	<script src="<c:url value='/template/admin/assets/js/jquery-ui.min.js'/>"></script>
	<script src="<c:url value='/template/paging/jquery.twbsPagination.js'/>"></script>
</body>
</html>