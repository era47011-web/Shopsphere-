package com.shopsphere.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.shopsphere.entity.CategoryProduct;
import com.shopsphere.service.CategoryProductService;

@RestController
@RequestMapping("/api/category-products")
public class CategoryProductController {

    private final CategoryProductService categoryProductService;

    public CategoryProductController(CategoryProductService categoryProductService) {
        this.categoryProductService = categoryProductService;
    }

    @GetMapping
    public List<CategoryProduct> getAllCategoryProducts() {
        return categoryProductService.getAllCategoryProducts();
    }

    @GetMapping("/{id}")
    public CategoryProduct getCategoryProductById(@PathVariable Long id) {
        return categoryProductService.getCategoryProductById(id);
    }

    @PostMapping
    public CategoryProduct createCategoryProduct(
            @RequestBody CategoryProduct categoryProduct) {
        return categoryProductService.saveCategoryProduct(categoryProduct);
    }

    @PutMapping("/{id}")
    public CategoryProduct updateCategoryProduct(
            @PathVariable Long id,
            @RequestBody CategoryProduct categoryProduct) {
        return categoryProductService.updateCategoryProduct(id, categoryProduct);
    }

    @DeleteMapping("/{id}")
    public String deleteCategoryProduct(@PathVariable Long id) {
        categoryProductService.deleteCategoryProduct(id);
        return "Category product deleted successfully";
    }
}