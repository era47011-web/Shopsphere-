package com.shopsphere.entity;

public class CategoryProduct {

    private Long id;
    private Long categoryId;
    private Long productId;

    public CategoryProduct() {
    }

    public CategoryProduct(Long id, Long categoryId, Long productId) {
        this.id = id;
        this.categoryId = categoryId;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}