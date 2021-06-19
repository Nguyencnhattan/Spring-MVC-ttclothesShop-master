package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catalog")
public class CatalogEntity extends BaseEntity {
	
	@OneToMany(mappedBy = "catalog")
	private List<ProductEntity> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "catalogs")
	private List<CatalogTypeEntity> catalogTypes = new ArrayList<>();
	
	@Column(name = "catalogCode")
	private String catalogCode;
	
	@Column(name = "catalogName")
	private String catalogName;

	@Column(name = "catalogImage")
	private String catalogImage;
	
	public List<CatalogTypeEntity> getCatalogTypes() {
		return catalogTypes;
	}

	public void setCatalogTypes(List<CatalogTypeEntity> catalogTypes) {
		this.catalogTypes = catalogTypes;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public String getCatalogImage() {
		return catalogImage;
	}

	public void setCatalogImage(String catalogImage) {
		this.catalogImage = catalogImage;
	}

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

}
