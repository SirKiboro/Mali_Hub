package com.malihub.service;

import com.malihub.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    ProductDTO create(ProductDTO dto, String username);
    Page<ProductDTO> getAll(Pageable pageable);
}
