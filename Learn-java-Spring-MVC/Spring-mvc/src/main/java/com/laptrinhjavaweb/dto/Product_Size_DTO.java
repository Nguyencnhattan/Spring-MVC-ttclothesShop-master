package com.laptrinhjavaweb.dto;

public class Product_Size_DTO  {
	
	private ProductDTO productss;
	private ProductSizeDTO sizess;
	private Long quantity;
	
	public ProductDTO getProductss() {
		return productss;
	}
	
	public void setProductss(ProductDTO productss) {
		this.productss = productss;
	}
	
	public ProductSizeDTO getSizess() {
		return sizess;
	}
	
	public void setSizess(ProductSizeDTO sizess) {
		this.sizess = sizess;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
		
}
