package com.laptrinhjavaweb.controller.web;

import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService iProductService;

	@RequestMapping(value = "/collection/{name}", method = RequestMethod.GET)
	public ModelAndView showProductPage(@PathVariable(value = "name", required = false) String name, @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
		ProductDTO productDTO = new ProductDTO();
		ModelAndView mav = new ModelAndView("web/product");
		Pageable pageable = new PageRequest(page-1, 6);
		productDTO.setPage(page);
		productDTO.setTotalPage((int) Math.ceil((double) iProductService.countTotalItem() / 6));
		productDTO.setListResult(iProductService.findByCatalogId(name, pageable));
		mav.addObject("products", productDTO);
		mav.addObject("catalogcode", name);
		return mav;
	}

	@RequestMapping(value = "/product/{code}", method = RequestMethod.GET)
	public ModelAndView ShowProductDetailPage(@PathVariable(value = "code", required = false) String code) {
		ModelAndView mav = new ModelAndView("web/detail-product");
		mav.addObject("productDetail", iProductService.findByProductCode(code));
		return mav;
	}
}
