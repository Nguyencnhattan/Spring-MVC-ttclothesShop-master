package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhjavaweb.dto.ProductDTO;

public interface IProductService {
	List<ProductDTO> findByCatalogId(String name, Pageable page);
	int countTotalItem();
	ProductDTO findByProductCode(String productCode);
}
