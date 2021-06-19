package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.ProductConverter;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.CatalogEntity;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.repository.CatalogRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductConverter productConverter;
	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public List<ProductDTO> findByCatalogId(String name, Pageable page) {
		List<ProductDTO> productDTO = new ArrayList<>();
		List<CatalogEntity> catalog = catalogRepository.findByCatalogCode(name);
		List<ProductEntity> productEntity = productRepository.findByCatalogId(catalog.get(0).getId(), page);
		for(ProductEntity item: productEntity) {		
			productDTO.add(productConverter.toDTO(item));
		}
		return productDTO;
	}

	@Override
	public ProductDTO findByProductCode(String productCode) {
		ProductEntity productEntity = productRepository.findByProductCode(productCode);
		return 	productConverter.toDTO(productEntity);
	}

	@Override
	public int countTotalItem() {
		return (int) productRepository.count();
	}
	
}
