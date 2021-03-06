//package com.laptrinhjavaweb.converter;
//
//@Component
//public class Template {
//	
//
//	import java.text.NumberFormat;
//	import java.util.Locale;
//
//	import org.springframework.stereotype.Component;
//
//	import com.laptrinhjavaweb.dto.CategoryDTO;
//	import com.laptrinhjavaweb.dto.NewDTO;
//	import com.laptrinhjavaweb.entity.CategoryEntity;
//	import com.laptrinhjavaweb.entity.NewEntity;
//
//		public NewDTO toDTO(NewEntity entity) {
//			NewDTO result = new NewDTO();
//			result.setCategoryCode(entity.getCategory().getCode());
//			result.setId(entity.getId());
//			result.setTitle(entity.getTitle());
//			result.setShortDescription(entity.getShortDescription());
//			result.setContent(entity.getContent());
//			result.setThumbnail(entity.getThumbnail());
//			result.setModifiedDate(entity.getModifiedDate());
//			result.setModifiedBy(entity.getModifiedBy());
//			result.setCreatedDate(entity.getCreatedDate());
//			result.setCreatedBy(entity.getCreatedBy());
//			result.setPrice(entity.getPrice());
//			Locale localeVN = new Locale("vi", "VN");
//			NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
//			if(entity.getPrice() != 0) {
//				result.setVnd(currencyVN.format(entity.getPrice()));
//			} else {
//				result.setVnd(currencyVN.format(0));
//			}
//			return result;
//		}
//
//		public NewEntity toEntity(NewDTO dto, CategoryEntity cateDTO) {
//			NewEntity result = new NewEntity();
//			result.setCategory(cateDTO);
//			result.setTitle(dto.getTitle());
//			result.setShortDescription(dto.getShortDescription());
//			result.setContent(dto.getContent());
//			result.setThumbnail(dto.getThumbnail());
//			result.setPrice(dto.getPrice());
//			return result;
//		}
//
//		// ap dung tinh da hinh, override
//		public NewEntity toEntity(NewDTO dto, CategoryEntity cateDTO, NewEntity result) {
//			result.setCategory(cateDTO);
//			result.setTitle(dto.getTitle());
//			result.setShortDescription(dto.getShortDescription());
//			result.setContent(dto.getContent());
//			result.setThumbnail(dto.getThumbnail());
//			result.setPrice(dto.getPrice());
//			return result;
//		}
//
//	}
//}
