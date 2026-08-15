package com.shopsphere.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.shopsphere.entity.Shipping;
import com.shopsphere.service.ShippingService;

@RestController
@RequestMapping("/api/shippings")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping
    public List<Shipping> getAllShippings() {
        return shippingService.getAllShippings();
    }

    @GetMapping("/{id}")
    public Shipping getShippingById(@PathVariable Long id) {
        return shippingService.getShippingById(id);
    }

    @PostMapping
    public Shipping createShipping(@RequestBody Shipping shipping) {
        return shippingService.saveShipping(shipping);
    }

    @PutMapping("/{id}")
    public Shipping updateShipping(@PathVariable Long id,
                                   @RequestBody Shipping shipping) {
        return shippingService.updateShipping(id, shipping);
    }

    @DeleteMapping("/{id}")
    public String deleteShipping(@PathVariable Long id) {
        shippingService.deleteShipping(id);
        return "Shipping deleted successfully";
    }
}