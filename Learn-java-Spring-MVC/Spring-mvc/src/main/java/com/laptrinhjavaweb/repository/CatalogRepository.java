package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.laptrinhjavaweb.entity.CatalogEntity;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
//	@Query(value = "select id from catalog C where C.catalogName = ?1", nativeQuery = true)
	List<CatalogEntity> findByCatalogCode(String catalogName);
}
