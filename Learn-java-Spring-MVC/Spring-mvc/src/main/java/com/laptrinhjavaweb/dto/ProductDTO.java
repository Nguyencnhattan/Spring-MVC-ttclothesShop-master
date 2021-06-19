package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;


public class ProductDTO extends AbstractDTO<ProductDTO>{
	private String title = "product";
	private String productName;
	private String content;
	private String shortDescription;
	private Long view;
	private Double price;
	private String productCode;
	private String vnd;
	private String productColor;
	private List<ProductImageDTO> image = new ArrayList<>();
	private List<Product_Size_DTO> product_size = new ArrayList<>();
	
	
	public List<Product_Size_DTO> getProduct_size() {
		return product_size;
	}

	public void setProduct_size(List<Product_Size_DTO> product_size) {
		this.product_size = product_size;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVnd() {
		return vnd;
	}

	public void setVnd(String vnd) {
		this.vnd = vnd;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<ProductImageDTO> getImage() {
		return image;
	}

	public void setImage(List<ProductImageDTO> image) {
		this.image = image;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public Long getView() {
		return view;
	}
	
	public void setView(Long view) {
		this.view = view;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
