package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.OrderDTO;
import com.laptrinhjavaweb.entity.OrderEntity;

@Component
public class OrderConverter {
	@Autowired
	private ModelMapper mapper;
	
	public OrderDTO toDTO(OrderEntity entity) {
		OrderDTO order = mapper.map(entity, OrderDTO.class);
		return order;
	}
	
	public OrderEntity toEntity(OrderDTO dto) {
		OrderEntity entity = mapper.map(dto, OrderEntity.class);
		return entity;
	}
}
