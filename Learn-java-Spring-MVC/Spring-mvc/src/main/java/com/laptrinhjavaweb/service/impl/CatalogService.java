package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.CatalogConverter;
import com.laptrinhjavaweb.dto.CatalogDTO;
import com.laptrinhjavaweb.entity.CatalogEntity;
import com.laptrinhjavaweb.repository.CatalogRepository;
import com.laptrinhjavaweb.service.ICatalogService;

@Service
public class CatalogService implements ICatalogService {

	@Autowired
	private CatalogRepository catalogRepository;
	
	@Autowired
	private CatalogConverter converter;
	
	@Override
	public List<CatalogDTO> findAll() {
		List<CatalogEntity> catalogEntity = catalogRepository.findAll();
		List<CatalogDTO> catalogDTO = new ArrayList<>();
			//convert entity sang dto
		for(CatalogEntity item: catalogEntity) {
			catalogDTO.add(converter.toDTO(item));
		}
		return catalogDTO;
	}

}
