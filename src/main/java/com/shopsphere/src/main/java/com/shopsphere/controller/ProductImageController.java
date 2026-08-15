package com.shopsphere.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.shopsphere.entity.ProductImage;
import com.shopsphere.service.ProductImageService;

@RestController
@RequestMapping("/api/product-images")
public class ProductImageController {

    private final ProductImageService productImageService;

    public ProductImageController(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @GetMapping
    public List<ProductImage> getAllProductImages() {
        return productImageService.getAllProductImages();
    }

    @GetMapping("/{id}")
    public ProductImage getProductImageById(@PathVariable Long id) {
        return productImageService.getProductImageById(id);
    }

    @PostMapping
    public ProductImage createProductImage(@RequestBody ProductImage productImage) {
        return productImageService.saveProductImage(productImage);
    }

    @PutMapping("/{id}")
    public ProductImage updateProductImage(@PathVariable Long id,
                                           @RequestBody ProductImage productImage) {
        return productImageService.updateProductImage(id, productImage);
    }

    @DeleteMapping("/{id}")
    public String deleteProductImage(@PathVariable Long id) {
        productImageService.deleteProductImage(id);
        return "Product image deleted successfully";
    }
}