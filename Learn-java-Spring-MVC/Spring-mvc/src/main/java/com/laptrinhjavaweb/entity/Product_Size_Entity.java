package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "product_size")
public class Product_Size_Entity {
	
	private static Product_Size_Entity productSizeEntity;
	
	@EmbeddedId
	private ProductSizeKey id;
	

	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private ProductEntity productss;
	
	@ManyToOne
	@MapsId("size_id")
	@JoinColumn(name = "size_id")
	private ProductSizeEntity sizess;
	
	@Column(name = "quantity")
	private Long quantity;

	public ProductSizeKey getId() {
		return id;
	}

	public void setId(ProductSizeKey id) {
		this.id = id;
	}

	public ProductEntity getProductss() {
		return productss;
	}

	public void setProductss(ProductEntity productss) {
		this.productss = productss;
	}

	public ProductSizeEntity getSizess() {
		return sizess;
	}

	public void setSizess(ProductSizeEntity sizess) {
		this.sizess = sizess;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Product_Size_Entity() {
		
	}
	
	
}
