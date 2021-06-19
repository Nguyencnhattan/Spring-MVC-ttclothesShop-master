package com.laptrinhjavaweb.api.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.laptrinhjavaweb.dto.OrderDTO;
import com.laptrinhjavaweb.service.IOrderService;

@RestController
@RequestMapping("/api")
public class CheckoutAPI {
	@Autowired
	private IOrderService iOrderServer;
	
	@PostMapping("/checkout")
	public OrderDTO checkout(@RequestBody OrderDTO orderDTO, HttpSession session ) {
 		orderDTO = iOrderServer.save(orderDTO, session);
		return orderDTO;
	}
}
