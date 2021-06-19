package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.RoleRepository;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IUserService;
@Service
public class UserService implements IUserService{
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional
	@Override
	public void save(UserDTO user) {
		UserEntity userEntity = userConverter.toEntity(user);
		List<RoleEntity> role = roleRepository.findByCode("USER");
		BCryptPasswordEncoder md5 = new BCryptPasswordEncoder();
		userEntity.setPassWord(md5.encode(userEntity.getPassWord()));
		userEntity.setRoles(role);
		userRepository.save(userEntity);
	}

}
