package com.laptrinhjavaweb.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.CatalogDTO;
import com.laptrinhjavaweb.service.ICatalogService;

@Controller(value = "homeControllerOfWeb")
public class HomeController {   
	@Autowired
	private ICatalogService iCatalog;
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage() { 	
//    	CatalogDTO catalogDTO = new CatalogDTO();
//    	catalogDTO.setListResult(iCatalog.findAll());
        ModelAndView mav = new ModelAndView("web/home"); 
//        List<CatalogDTO> cate = new ArrayList<>();
//        cate = iCatalog.findAll();
//        cate.get(0).getCatalogName();
        
        mav.addObject("catalog", iCatalog.findAll());
        return mav;
    }
   
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if( auth != null) {
        	new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return new ModelAndView("redirect:/home");
    }
    
    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public ModelAndView deniedPage() {
        return new ModelAndView("redirect:/login?accessDenied");
    }
}
