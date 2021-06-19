package com.laptrinhjavaweb.dto;

public class CatalogDTO extends AbstractDTO<CatalogDTO>{

	private String catalogCode;
	private String catalogName;
	private String catalogImage;
	
	public String getCatalogCode() {
		return catalogCode;
	}
	public void setCatalogCode(String catalogCode) {
		this.catalogCode = catalogCode;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public String getCatalogImage() {
		return catalogImage;
	}
	public void setCatalogImage(String catalogImage) {
		this.catalogImage = catalogImage;
	}
	
}
