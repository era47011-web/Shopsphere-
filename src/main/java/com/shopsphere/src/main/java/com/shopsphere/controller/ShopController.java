package com.shopsphere.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.shopsphere.entity.Shop;
import com.shopsphere.service.ShopService;

@RestController
@RequestMapping("/api/shops")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable Long id) {
        return shopService.getShopById(id);
    }

    @PostMapping
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.saveShop(shop);
    }

    @PutMapping("/{id}")
    public Shop updateShop(@PathVariable Long id,
                           @RequestBody Shop shop) {
        return shopService.updateShop(id, shop);
    }

    @DeleteMapping("/{id}")
    public String deleteShop(@PathVariable Long id) {
        shopService.deleteShop(id);
        return "Shop deleted successfully";
    }
}