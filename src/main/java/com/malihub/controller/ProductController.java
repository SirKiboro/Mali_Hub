package com.malihub.controller;

import com.malihub.dto.ProductDTO;
import com.malihub.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(
            @RequestBody @Valid ProductDTO dto,
            @RequestParam String username) {

        return ResponseEntity.ok(productService.create(dto, username));
    }

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> getAll(Pageable pageable) {
        return ResponseEntity.ok(productService.getAll(pageable));
    }

}
