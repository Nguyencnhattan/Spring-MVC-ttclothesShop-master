package com.laptrinhjavaweb.dto;

public class GioHangDTO {
	private Long id;
	private String productColor;
	private Double price;
	private String productImage;
	private String shortDescription;
	private String productSize;
	private Long productQuantity;
	private String productCode;
	
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductImage() {
		return productImage;
	}
	
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	public Long getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProductColor() {
		return productColor;
	}
	
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getProductSize() {
		return productSize;
	}
	
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	
}
