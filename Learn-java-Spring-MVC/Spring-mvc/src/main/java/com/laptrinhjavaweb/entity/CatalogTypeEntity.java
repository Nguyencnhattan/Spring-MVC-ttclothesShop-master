package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catalogType")
public class CatalogTypeEntity extends BaseEntity{
	
	@Column(name = "catalogTypeCode")
	private String catalogTypeCode;
	
	@Column(name = "catalogTypeName")
	private String catalogTypeName;
	
	@ManyToOne
	@JoinColumn(name = "catalog_id")
	private CatalogEntity catalogs;

	
	public String getCatalogTypeCode() {
		return catalogTypeCode;
	}

	public void setCatalogTypeCode(String catalogTypeCode) {
		this.catalogTypeCode = catalogTypeCode;
	}

	public String getCatalogTypeName() {
		return catalogTypeName;
	}

	public void setCatalogTypeName(String catalogTypeName) {
		this.catalogTypeName = catalogTypeName;
	}

	public CatalogEntity getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(CatalogEntity catalogs) {
		this.catalogs = catalogs;
	}

	public CatalogEntity getCatalog() {
		return catalogs;
	}

	public void setCatalog(CatalogEntity catalogs) {
		this.catalogs = catalogs;
	}
	
}
