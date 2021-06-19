package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	List<ProductEntity> findByCatalogId(Long id, Pageable page);
	
	//@Query(value = "SELECT d FROM product d WHERE productCode = ?1 ", nativeQuery = true)
	ProductEntity findByProductCode(String productCode);
}
