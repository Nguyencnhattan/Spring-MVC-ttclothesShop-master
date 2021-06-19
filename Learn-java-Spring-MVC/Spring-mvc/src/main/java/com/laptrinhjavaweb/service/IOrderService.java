package com.laptrinhjavaweb.service;

import javax.servlet.http.HttpSession;

import com.laptrinhjavaweb.dto.OrderDTO;

public interface IOrderService {
	OrderDTO save(OrderDTO order, HttpSession session);
}
