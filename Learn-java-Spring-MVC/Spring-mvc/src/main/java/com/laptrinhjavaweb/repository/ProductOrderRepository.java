package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ProductOrderEntity;
import com.laptrinhjavaweb.entity.ProductOrderKey;

public interface ProductOrderRepository extends JpaRepository<ProductOrderEntity, ProductOrderKey> {

}
