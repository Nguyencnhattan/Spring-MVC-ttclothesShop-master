package com.laptrinhjavaweb.dto;

public class ProductImageDTO extends AbstractDTO<ProductImageDTO>{
	private String file;
	private String imageName;
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
