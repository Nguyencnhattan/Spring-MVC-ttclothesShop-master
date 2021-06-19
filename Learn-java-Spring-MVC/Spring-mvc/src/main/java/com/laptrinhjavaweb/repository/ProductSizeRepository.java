package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ProductSizeEntity;

public interface ProductSizeRepository extends JpaRepository<ProductSizeEntity, Long> {
	List<ProductSizeEntity> findByIdAndSize(Long id, String size);
}
