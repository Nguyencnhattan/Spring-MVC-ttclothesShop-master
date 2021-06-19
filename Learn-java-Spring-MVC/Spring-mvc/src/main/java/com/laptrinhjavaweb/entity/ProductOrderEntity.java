package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Product")
public class ProductOrderEntity {
	private static ProductOrderEntity productOrderEntity;
	
	@EmbeddedId
	private ProductOrderKey id;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private ProductEntity products;
	
	@ManyToOne
	@MapsId("orderId")
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	@Column(name = "quantity")
	private Long quantity;
	
	
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public ProductOrderKey getId() {
		return id;
	}

	public void setId(ProductOrderKey id) {
		this.id = id;
	}

	public ProductEntity getProduct() {
		return products;
	}

	public void setProduct(ProductEntity product) {
		this.products = product;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public static  ProductOrderEntity getInstance() {
		if(productOrderEntity == null) {
			productOrderEntity = new ProductOrderEntity();
		}
		return productOrderEntity;
	}

	
}
