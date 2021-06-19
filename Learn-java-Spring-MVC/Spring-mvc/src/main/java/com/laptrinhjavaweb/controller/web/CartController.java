package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@RequestMapping("/cart")
	public ModelAndView showCart() {
		ModelAndView mav = new ModelAndView("/web/cart");
		return mav;
	}
}
