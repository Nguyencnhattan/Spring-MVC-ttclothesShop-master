<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Start All Title Box -->
	<div class="all-title-box">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h2>Cart</h2>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Shop</a></li>
						<li class="breadcrumb-item active">Cart</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- End All Title Box -->

	<!-- Start Cart  -->
	<div class="cart-box-main">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="table-main table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th>Images</th>
									<th>Product Name</th>
									<th>Price</th>
									<th>Quantity</th>
									<th>Total</th>
									<th>Remove</th>
								</tr>
							</thead>
							<tbody>
							<c:if test="${not empty giohang}">
							<c:forEach var="item" items="${giohang}">
								<tr>
									<input type="hidden" class = "id" value="${item.getId() }"/>
									<td class="thumbnail-img"><a href="#"> <img
											class="img-fluid" src="<c:url value="${item.getProductImage()}"/>" alt="" />
									</a></td>
									<td class="name-pr"><a class="size-color" defaultValue="${item.getProductColor()}" data-value="${item.getProductSize()}" href="<c:url value="/product/${item.getShortDescription()}" />" > ${item.getShortDescription()} màu ${item.getProductColor()}  size  ${item.getProductSize()} </a></td>
									<td class="price-pr" >
										<p class="price" value="${item.getPrice()}">${item.getPrice()} đ</p>
									</td>
									<td class="quantity-box"><input style="width: 200px" type="number" size="4"
									value="${item.getProductQuantity()}" id="quantity" min="1" max="10" step="1" class="c-input-text qty text quantity"></td>
									<td class="total-pr">
										<p id="price" class="total-price" value="${item.getProductQuantity() * item.getPrice()}">${item.getProductQuantity() * item.getPrice()} đ</p> 
									</td>
									<td class="remove-pr"><button class="deleteSP"> <i
											class="fas fa-times"></i>
									</button></td>
								</tr>
								</c:forEach>
								</c:if>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="row my-5">
				<div class="col-lg-6 col-sm-6">
					<div class="coupon-box">
						<div class="input-group input-group-sm">
							<input class="form-control" placeholder="Enter your coupon code"
								aria-label="Coupon code" type="text">
							<div class="input-group-append">
								<button class="btn btn-theme" type="button">Apply
									Coupon</button>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-8 col-sm-8"></div>
				<div class="col-lg-4 col-sm-8">
					<div class="order-box">
						<h3>Order summary</h3>
						<div class="d-flex">
							<h4>Sub Total</h4>
							<div class="ml-auto font-weight-bold" id="sub-total">0 đ</div>
						</div>
						<div class="d-flex">
							<h4>Discount</h4>
							<div class="ml-auto font-weight-bold">0 đ</div>
						</div>
						<hr class="my-1">
						<div class="d-flex">
							<h4>Coupon Discount</h4>
							<div class="ml-auto font-weight-bold">0 đ</div>
						</div>
						<div class="d-flex">
							<h4>Tax</h4>
							<div class="ml-auto font-weight-bold">0 đ</div>
						</div>
						<div class="d-flex">
							<h4>Shipping Cost</h4>
							<div class="ml-auto font-weight-bold" value = "0">Free</div>
						</div>
						<hr>
						<div class="d-flex gr-total">
							<h5>Grand Total</h5>
							<div class="ml-auto h5" value = "0" id="grand-total">0 đ</div>
						</div>
						<hr>
					</div>
				</div>
				<div class="col-12 d-flex shopping-box">
					<a href="<c:url value="/checkout" />" class="ml-auto btn hvr-hover">Checkout</a>
				</div>
			</div>
		</div>
	</div>
	<!-- End Cart -->
	
	<script>	
		var tongtien = 0;
		function calTotalPrice(){
			$(".total-price").each(function(){
				tongtien += parseInt($(this).attr('value'))
				var tongtienFM = tongtien.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
				$("#sub-total").text(tongtienFM + " đ")
				$("#grand-total").text(tongtienFM + " đ")
				$("#grand-total").attr('value', tongtien)
			})
		}
			$(".price").each(function(){
				var giatien = parseInt($(this).text()).toString()
				var format = giatien.replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
				$(this).text(format + " đ")
			})
	
			$(".total-price").each(function(){
				var total = parseInt($(this).text()).toString()	
				var format = total.replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
				$(this).text(format + " đ")		
				tongtien += parseInt($(this).attr('value'))
				var tongtienFM = tongtien.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
				$("#sub-total").text(tongtienFM + " đ")
				$("#grand-total").text(tongtienFM + " đ")
				$("#grand-total").attr('value', tongtien)
				//alert(tongtien)
			})
			
			
		$('.quantity').change(function(){
			tongtien = 0 
			var soluong = $(this).val()
			var giatien = $(this).closest("tr").find(".price").attr("value")
			var format = (soluong*giatien).toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
			$(this).closest("tr").find(".total-price").attr('value', soluong*giatien)
			//var format = tongtien.toFixed(3).replace(/(\d)(?=(\d{3})+\.)/g, "$1.")
			$(this).closest("tr").find(".total-price").text(format + " đ")
			calTotalPrice()
			var data = {
				productQuantity: soluong,
				productSize: $(this).closest("tr").find(".size-color").attr('data-value'),
				productColor: $(this).closest("tr").find(".size-color").attr('defaultValue'),
				id: $(this).closest("tr").find(".id").val()
			}
			
			$.ajax({
				url: "/api/updateCart",
				type: 'POST',
        		contentType: 'application/json',
        		data: JSON.stringify(data),
        		success: function (result) {
                	console.log(result)
               },
               error: function (error) {
               		console.log(error)
               }
			})
			//xử dụng phương pháp ajax lồng ajax để cập nhật lại số lượng cho giỏ hàng nhỏ.
		})
		
		$(".deleteSP").click(function(e){
			e.preventDefault()
			var productColor = $(this).closest("tr").find(".size-color").attr('defaultValue')
			var id = $(this).closest("tr").find(".id").val()
			var productSize = $(this).closest("tr").find(".size-color").attr('data-value')
			
			var data = {
				productColor: productColor,
				id: id,
				productSize: productSize
			}
		
			$.ajax({
				url: "/api/deleteItem",
				type: 'POST',
        		contentType: 'application/json',
				data: JSON.stringify(data),
				success: function (result) {
                	alert("Xoa san pham thanh cong !")
                	location.reload()
               },
               error: function (error) {
               		console.log(error)
               }
			})
		})
		
	</script>
	<!-- những cách ngu đã thử -->
		<!-- 	tongtien = tongtien + 1*giatien
			var tongtienFM = tongtien.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
			$("#sub-total").text(tongtienFM + " đ")
			$("#grand-total").text(tongtienFM + " đ")
			$("#grand-total").attr('value', tongtien) -->
	<!-- tongtien += (soluong*giatien)
			var formatTT = tongtien.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")
			$("#sub-total").text(formatTT + " đ")
			$("#grand-total").text(formatTT + " đ")
			$("#grand-total").attr('value', tongtien) -->
</body>
</html>