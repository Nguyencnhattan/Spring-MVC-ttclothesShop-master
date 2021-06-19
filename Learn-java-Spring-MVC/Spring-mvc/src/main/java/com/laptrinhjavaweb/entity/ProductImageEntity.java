package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productimage")
public class ProductImageEntity extends BaseEntity{
	
	@Column(name = "file")
	private String file;
	
	@Column(name = "imagename")
	private String imageName;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product; //mappedBy o bang product (ProductEntity)

	
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

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
}
