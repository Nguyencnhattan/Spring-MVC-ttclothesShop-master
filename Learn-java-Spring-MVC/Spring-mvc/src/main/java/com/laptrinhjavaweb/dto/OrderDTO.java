package com.laptrinhjavaweb.dto;

public class OrderDTO extends AbstractDTO<OrderDTO>{
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private String customerAddress;
	private String orderStatus;
	private Long quantityProduct;
	private Long totalPrice;
	private String payment;
	private String delivery;
	
	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public String getCustomerPhone() {
		return customerPhone;
	}
	
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public Long getQuantityProduct() {
		return quantityProduct;
	}
	
	public void setQuantityProduct(Long quantityProduct) {
		this.quantityProduct = quantityProduct;
	}
	
	public Long getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getPayment() {
		return payment;
	}
	
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
}
