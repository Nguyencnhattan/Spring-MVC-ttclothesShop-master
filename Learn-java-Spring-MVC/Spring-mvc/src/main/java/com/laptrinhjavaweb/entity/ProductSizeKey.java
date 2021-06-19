package com.laptrinhjavaweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductSizeKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ProductSizeKey productSizeKey;
	
	@Column(name = "product_id")
	private Long product_id;
	
	@Column(name = "size_id")
	private Long size_id;
	
	public static ProductSizeKey getInstance() {
		if(productSizeKey == null) {
			productSizeKey = new ProductSizeKey();
		}
		return productSizeKey;
	}
	
	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getSize_id() {
		return size_id;
	}

	public void setSize_id(Long size_id) {
		this.size_id = size_id;
	}

	
	public ProductSizeKey() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product_id == null) ? 0 : product_id.hashCode());
		result = prime * result + ((size_id == null) ? 0 : size_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductSizeKey other = (ProductSizeKey) obj;
		if (product_id == null) {
			if (other.product_id != null)
				return false;
		} else if (!product_id.equals(other.product_id))
			return false;
		if (size_id == null) {
			if (other.size_id != null)
				return false;
		} else if (!size_id.equals(other.size_id))
			return false;
		return true;
	}

	
	
}
