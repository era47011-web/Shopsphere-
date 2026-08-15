package com.shopsphere.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.shopsphere.entity.ProductImage;
import com.shopsphere.repository.ProductImageRepository;

@Service
public class ProductImageService {

    private final ProductImageRepository productImageRepository;

    public ProductImageService(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }

    public List<ProductImage> getAllProductImages() {
        return productImageRepository.findAll();
    }

    public Optional<ProductImage> getProductImageById(Long id) {
        return productImageRepository.findById(id);
    }

    public ProductImage saveProductImage(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    public ProductImage updateProductImage(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    public void deleteProductImage(Long id) {
        productImageRepository.deleteById(id);
    }
}