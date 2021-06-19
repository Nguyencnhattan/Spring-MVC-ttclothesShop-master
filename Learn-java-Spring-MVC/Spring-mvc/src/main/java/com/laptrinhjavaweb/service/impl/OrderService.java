package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.util.SecurityUtils;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.OrderConverter;
import com.laptrinhjavaweb.dto.GioHangDTO;
import com.laptrinhjavaweb.dto.OrderDTO;
import com.laptrinhjavaweb.entity.OrderEntity;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.entity.ProductOrderEntity;
import com.laptrinhjavaweb.entity.ProductOrderKey;
import com.laptrinhjavaweb.entity.ProductSizeKey;
import com.laptrinhjavaweb.entity.Product_Size_Entity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.OrderRepository;
import com.laptrinhjavaweb.repository.ProductOrderRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.repository.Product_SizeRepository;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IOrderService;

@Service
public class OrderService implements IOrderService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderConverter orderConverter;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductOrderRepository productOrderRepository;
	
	@Autowired
	private Product_SizeRepository product_SizeRepository;
	
	//String userName = SecurityUtils.getPrincipal().getUsername();
	String userName = null;
	
	@Transactional
	@Override
	public OrderDTO save(OrderDTO order, HttpSession session) {	
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		if(auth != null) {
		try {
			userName = SecurityUtils.getPrincipal().getUsername();
		}catch(Exception e) {
			System.out.println(e);
		}
	
		
		UserEntity user = null;
		OrderEntity orderEntity = orderConverter.toEntity(order);
		
		//kiểm tra nếu tồn tại user thì lưu quan hệ giữa bảng user và order.
		if(userName != null)
			user = userRepository.findOneByUserNameAndStatus(userName, 1);
		
		if(user != null) {
			orderEntity.setUsers(user);
			order = orderConverter.toDTO(orderRepository.save(orderEntity));
		}else {
			order = orderConverter.toDTO(orderRepository.save(orderEntity));
		}
	
		
		List<GioHangDTO> giohang = (List<GioHangDTO>) session.getAttribute("giohang");
		
		//thay đổi lại số lượng của sản phẩm theo size
		for(GioHangDTO gio : giohang) {
			ProductEntity productEntity = productRepository.findOne(gio.getId());
			long idSize = 0;
			//tim id cua bang productSize sau đó cùng với idProduct tìm bảng phụ để giảm số lượng.
			for(Product_Size_Entity id : productEntity.getProduct_size()) {
				if(gio.getProductSize().equals(id.getSizess().getSize())) {
					idSize = id.getSizess().getId();
					break;
				}
			}
			
			//Giảm số lượng của sp ở bảng phụ theo productId  và sizeID
			ProductSizeKey productSizeKey = ProductSizeKey.getInstance();
			productSizeKey.setSize_id(idSize);
			productSizeKey.setProduct_id(productEntity.getId());
			
			Product_Size_Entity PSEntity = product_SizeRepository.findOne(productSizeKey);
			PSEntity.setQuantity(PSEntity.getQuantity() - gio.getProductQuantity());
			product_SizeRepository.save(PSEntity);
			
			//set key cho bảng ProductOrder
			ProductOrderKey productOrderKey = ProductOrderKey.getInstance();
			productOrderKey.setOrderId(order.getId());
			productOrderKey.setProductId(productEntity.getId());
	
			ProductOrderEntity productOrder = ProductOrderEntity.getInstance();
			productOrder.setQuantity(gio.getProductQuantity());
			productOrder.setOrder(orderEntity);
			productOrder.setProduct(productEntity);
			productOrder.setId(productOrderKey);
			
			//set lại quan hệ giữa bảng product và bảng order
			productOrderRepository.save(productOrder);
		}
		session.removeAttribute("giohang");
		return order;
	}
	
}
