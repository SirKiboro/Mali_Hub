package com.malihub.mapper;

import com.malihub.dto.ProductDTO;
import com.malihub.entity.Category;
import com.malihub.entity.Product;
import com.malihub.entity.User;

public class ProductMapper {

    public static Product toEntity(ProductDTO dto, User user, Category category){

        Product p = new Product();
        p.setProductName(dto.getProductName());
        p.setPrice(dto.getPrice());
        p.setUser(user);
        p.setCategory(category);
        return p;
    }

    public static ProductDTO toDTO(Product p) {

        ProductDTO dto = new ProductDTO();
        dto.setId(p.getId());
        dto.setProductName(p.getProductName());
        dto.setPrice(p.getPrice());
        dto.setCategoryTpe(p.getCategory().getCategoryType());
        return dto;
    }
}
