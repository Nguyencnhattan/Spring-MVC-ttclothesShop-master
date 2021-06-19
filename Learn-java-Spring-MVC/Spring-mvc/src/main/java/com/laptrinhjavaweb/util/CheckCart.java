package com.laptrinhjavaweb.util;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GioHangDTO;

@Component
public class CheckCart {

	public void addCart(List<GioHangDTO> giohangs, HttpSession session, GioHangDTO gioHang) {
		if (session.getAttribute("giohang") == null) {
			giohangs.add(gioHang);
			session.setAttribute("giohang", giohangs);
		} else {
			int index = checkProductIsExist(session, gioHang.getId(), gioHang.getProductSize());
			if (index == -1) {
				giohangs.add(gioHang);
				session.setAttribute("giohang", giohangs);
			} else {
				//List<GioHangDTO> giohangss = (List<GioHangDTO>) session.getAttribute("giohang");
				Long newQuantity = gioHang.getProductQuantity() + giohangs.get(index).getProductQuantity();
				giohangs.get(index).setProductQuantity(newQuantity);
//				for(GioHangDTO giohang : giohangss) {
//					System.out.println(giohang.getShortDescription() + " - " + giohang.getProductSize() + " - " + giohang.getProductQuantity());
//				}
			}
		}
	}

	public void updateCart(GioHangDTO giohang, HttpSession httpSession) {
		List<GioHangDTO> giohangc = (List<GioHangDTO>) httpSession.getAttribute("giohang");
		for (GioHangDTO gio : giohangc) {
			if (gio.getId() == giohang.getId() && gio.getProductColor().equals(giohang.getProductColor()) == true
					&& gio.getProductSize().equals(giohang.getProductSize()) == true) {
				gio.setProductQuantity(giohang.getProductQuantity());
				break;
			}
		}
	}

	public void deleteItem(GioHangDTO giohang, HttpSession httpSession) {
		List<GioHangDTO> giohangc = (List<GioHangDTO>) httpSession.getAttribute("giohang");
		for (GioHangDTO gio : giohangc) {
			if (gio.getId() == giohang.getId() && gio.getProductColor().equals(giohang.getProductColor()) == true
					&& gio.getProductSize().equals(giohang.getProductSize()) == true) {
				giohangc.remove(gio);
				break;
			}
		}
	}

	public int checkProductIsExist(HttpSession httpSession, Long id, String size) {
		List<GioHangDTO> giohangs = (List<GioHangDTO>) httpSession.getAttribute("giohang");
		for (int i = 0; i < giohangs.size(); i++) {
			if (giohangs.get(i).getId() == id && giohangs.get(i).getProductSize().equals(size) == true) {
				return i;
			}
		}
		return -1;
	}

}
