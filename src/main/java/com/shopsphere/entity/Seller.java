package com.shopsphere.entity;

public class Seller {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String businessName;

    public Seller() {
    }

    public Seller(Long id, String name, String email,
                  String phone, String businessName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.businessName = businessName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}