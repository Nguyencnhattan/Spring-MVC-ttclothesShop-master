<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" http-equiv="Content-Type"
	content="width=device-width, initial-scale=1, shrink-to-fit=no, text/html">
<title>Register</title>

</head>
<body>
	<h1 style="color: #808080">
		WELCOME TO TTCLOTHES SHOP
	</h1>
	<div class="container justify-content-center">
		<div class="Login-box justify-content-center">
			<div class="row">
				<div class="col-md-6 login-right">
					<h2 style="color: black">Register</h2>
					<c:if test="${param.userNameExist != null}">
						<div class="alert alert-danger ">
							<p class="justify-content-center">Please choose another username !</p>
						</div>
					</c:if>
					<c:if  test="${not empty message}">
						<div class="alert alert-${alert}">${message}
					</div></c:if>
				
					<form id = "formsubmit">
						<div class="form-group">
							<label style="color: black">Your fullname</label> <input type="text"
								name="fullName" value="" placeholder="Fullname"
								class="form-control" />
						</div>

						<div class="form-group">
							<label style="color: black">Username</label> <input
								type="text" name="userName" value="" placeholder="Username"
								class="form-control" />
						</div>

						<div class="form-group">
							<label style="color: black">Password</label> <input
								type="password" id = "password" name="passWord" value="" placeholder="Password"
								class="form-control"/>
						</div>

						<!-- <input type="hidden" value="" id="page" name="page" /> -->
						<div>
							<input type="submit" name="register" id="register" value="register" />
							<button>
								<a style="width: 25px; height: 25px" href='<c:url value="/login"/>'>Login</a>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="social-media">
		<a href="#" class="s"><i class="fab fa-facebook"></i></a>
		<a href="#" class="s"><i class="fab fa-twitter"></i></a>
		<a href="#" class="s"><i class="fab fa-whatsapp"> </i></a>
		<a href="#" class="s"><i class="fab fa-instagram"></i></a>
		<a href="#" class="s"><i class="fab fa-youtube"></i></a>
	</div>
	
	<script>
		$("#register").click(function(e){
			e.preventDefault();
			var data = {};
			var formdata = $('#formsubmit').serializeArray();
			$.each(formdata, function (i,v){
				data[""+v.name+""] = v.value;
			});
			addUser(data);
		});
		
		function addUser(data) {
			$.ajax({
				url: "/authen",
				type: 'POST',
				contentType: 'application/json',
				data: JSON.stringify(data),
			    success: function (result) {
		            alert("Đăng ký thành công !")
		            location.href="/login"
		        },
		        error: function (error) {
		            alert("Đã có lỗi xảy ra !");
		        }
			});
		}
	</script>
</body>
</html>