package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {

	@Column(name = "productname")
	private String productName;

	@Column(name = "content" /* length = 100 */)
	private String content;

	@Column(name = "shortdescription", columnDefinition = "TEXT")
	private String shortDescription;

	@Column(name = "view")
	private Long view; // luot xem san pham

	@Column(name = "price")
	private Double price;

	@Column(name = "productCode")
	private String productCode;
	
	@Column(name = "productColor")
	private String productColor;
	
	// quan he voi bang product_order
	@OneToMany(mappedBy = "products")
	private List<ProductOrderEntity> product_order = new ArrayList<>();
	
	// quan he voi bang catalog
	@ManyToOne
	@JoinColumn(name = "catalog_id")
	private CatalogEntity catalog;

	
	// quan he voi bang image
	@OneToMany(mappedBy = "product") // duoc khai bao o bang nhieu (ProductImageEntity)
	private List<ProductImageEntity> image = new ArrayList<>();

	
	
	// quan he voi bang productbrand
	@ManyToOne
	@JoinColumn(name = "pbrand_id")
	private ProductBrandEntity brands;

	// quan he voi bang promotion
	@ManyToMany
	@JoinTable(name = "product_promotion", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "promotion_id"))
	private List<PromotionEntity> promotions = new ArrayList<>();

	// quan he voi bang product_size_entity
	@OneToMany(mappedBy = "productss")
	private List<Product_Size_Entity> product_size = new ArrayList<>();
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public CatalogEntity getCatalog() {
		return catalog;
	}

	public void setCatalog(CatalogEntity catalog) {
		this.catalog = catalog;
	}

	public ProductBrandEntity getBrands() {
		return brands;
	}

	public void setBrands(ProductBrandEntity brands) {
		this.brands = brands;
	}

	public List<PromotionEntity> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<PromotionEntity> promotions) {
		this.promotions = promotions;
	}

	public List<ProductOrderEntity> getProduct_order() {
		return product_order;
	}

	public void setProduct_order(List<ProductOrderEntity> product_order) {
		this.product_order = product_order;
	}

	public List<Product_Size_Entity> getProduct_size() {
		return product_size;
	}

	public void setProduct_size(List<Product_Size_Entity> product_size) {
		this.product_size = product_size;
	}

	public List<ProductImageEntity> getImage() {
		return image;
	}

	public void setImage(List<ProductImageEntity> image) {
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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	
}
