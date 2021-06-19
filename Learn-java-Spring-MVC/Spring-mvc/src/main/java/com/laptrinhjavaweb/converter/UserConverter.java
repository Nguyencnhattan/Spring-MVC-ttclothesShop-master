package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

@Component
public class UserConverter {
	@Autowired
	private ModelMapper mapper;
	
	public UserEntity toEntity(UserDTO user) {
		UserEntity entity = mapper.map(user, UserEntity.class);
		return entity;
	}
	
	public UserDTO toDTO(UserEntity user) {
		UserDTO userDTO = mapper.map(user, UserDTO.class);
		return userDTO;
	}
}
