package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ProductSizeKey;
import com.laptrinhjavaweb.entity.Product_Size_Entity;

public interface Product_SizeRepository extends JpaRepository<Product_Size_Entity, ProductSizeKey> {

}
