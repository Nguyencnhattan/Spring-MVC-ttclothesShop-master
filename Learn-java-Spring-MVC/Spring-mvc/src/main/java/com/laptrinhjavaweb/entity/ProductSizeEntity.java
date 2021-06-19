package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productsize")
public class ProductSizeEntity extends BaseEntity{
	
	@OneToMany(mappedBy = "sizess")
	private List<Product_Size_Entity> product_size = new ArrayList<>();
	
	@Column(name = "size", length = 10)
	private String size;
	
	public List<Product_Size_Entity> getProduct_size() {
		return product_size;
	}

	public void setProduct_size(List<Product_Size_Entity> product_size) {
		this.product_size = product_size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	
}
