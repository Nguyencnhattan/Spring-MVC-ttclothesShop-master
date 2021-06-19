package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orderTable")
public class OrderEntity extends BaseEntity {
	
	//quan he (1-n) voi bang user
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity users;

	@OneToMany(mappedBy = "order")
	List<ProductOrderEntity> product_order = new ArrayList<>();
	
	@Column(name = "payment")
	private String payment;
	
	@Column(name = "customerEmail", length = 100)
	private String customerEmail;
	
	@Column(name = "customerName", length = 100)
	private String customername;
	
	@Column(name = "customerPhone", length = 15)
	private String customerPhone;
	
	@Column(name = "customerAddress")
	private String customerAddress;
	
	@Column(name = "orderStatus")
	private String orderStatus;
	
	@Column(name = "quantityProduct")
	private Long quantityProduct;
	
	@Column(name = "totalPrice")
	private Long totalPrice;
	
	@Column(name = "delivery")
	private String delivery;
	
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

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
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

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public List<ProductOrderEntity> getProduct_order() {
		return product_order;
	}

	public void setProduct_order(List<ProductOrderEntity> product_order) {
		this.product_order = product_order;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}	
	
}
