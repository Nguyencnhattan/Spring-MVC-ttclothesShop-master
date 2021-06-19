package com.laptrinhjavaweb.api.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.laptrinhjavaweb.dto.GioHangDTO;
import com.laptrinhjavaweb.dto.OrderDTO;
import com.laptrinhjavaweb.service.IOrderService;
import com.laptrinhjavaweb.util.CheckCart;

@RestController
@CrossOrigin
@RequestMapping("/api")
@SessionAttributes("giohang")
public class GioHangAPI {
	@Autowired
	private IOrderService iOrderServer;
	
	private CheckCart checkCart = new CheckCart();
	private List<GioHangDTO> giohangs = new ArrayList<>();

	@PostMapping("/addCart")
	public void addGioHang(@RequestBody GioHangDTO giohang, HttpSession httpSession) {
		checkCart.addCart(giohangs, httpSession, giohang);
	}

	@PostMapping("/updateCart")
	public void updateGioHang(@RequestBody GioHangDTO giohang, HttpSession httpSession) {
		checkCart.updateCart(giohang, httpSession);
	}
	
	@PostMapping("/deleteItem")
	public void deleteItem(@RequestBody GioHangDTO giohang, HttpSession httpSession) {
		checkCart.deleteItem(giohang, httpSession);
	}
	
	
}
