package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.CatalogDTO;
import com.laptrinhjavaweb.entity.CatalogEntity;

@Component
public class CatalogConverter {
	@Autowired
	private ModelMapper mapper;
	
	public CatalogDTO toDTO(CatalogEntity entity) {
		CatalogDTO catalogDTO = mapper.map(entity, CatalogDTO.class);
		return catalogDTO;
	}
	
	public CatalogEntity toEntity(CatalogDTO catalog) {
		CatalogEntity entity = mapper.map(catalog, CatalogEntity.class);
		return entity;
	}
}
