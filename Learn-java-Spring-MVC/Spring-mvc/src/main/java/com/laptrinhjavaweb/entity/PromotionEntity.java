package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "promotion")
public class PromotionEntity extends BaseEntity {
	
	@ManyToMany(mappedBy = "promotions")
	private List<ProductEntity> products = new ArrayList<>();
	
	//bang promotion va product quan he n-n
	@Column(name = "promotionName")
	private String promotionName;
	
	@Column(name = "startTime")
	private Date startTime;
	
	@Column(name = "endTime")
	private Date endTime;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "PromotionImage")
	private String promotionImage;
	
	@Column(name = "promotionPrice")
	private Double promotionPrice;

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPromotionImage() {
		return promotionImage;
	}

	public void setPromotionImage(String promotionImage) {
		this.promotionImage = promotionImage;
	}

	public Double getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	
}
