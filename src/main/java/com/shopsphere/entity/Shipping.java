package com.shopsphere.entity;

public class Shipping {

    private Long id;
    private Long orderId;
    private String trackingNumber;
    private String shippingAddress;
    private String shippingStatus;
    private String deliveryDate;

    public Shipping() {
    }

    public Shipping(Long id, Long orderId, String trackingNumber,
                    String shippingAddress, String shippingStatus,
                    String deliveryDate) {
        this.id = id;
        this.orderId = orderId;
        this.trackingNumber = trackingNumber;
        this.shippingAddress = shippingAddress;
        this.shippingStatus = shippingStatus;
        this.deliveryDate = deliveryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}