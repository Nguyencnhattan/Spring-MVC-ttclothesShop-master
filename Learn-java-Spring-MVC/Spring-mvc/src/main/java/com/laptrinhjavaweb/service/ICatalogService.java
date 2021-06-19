package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.CatalogDTO;

public interface ICatalogService {
	
	
	List<CatalogDTO> findAll();
}
