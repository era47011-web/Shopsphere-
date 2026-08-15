package com.shopsphere.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.shopsphere.entity.Wishlist;
import com.shopsphere.service.WishlistService;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    @GetMapping("/{id}")
    public Wishlist getWishlistById(@PathVariable Long id) {
        return wishlistService.getWishlistById(id);
    }

    @PostMapping
    public Wishlist createWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.saveWishlist(wishlist);
    }

    @PutMapping("/{id}")
    public Wishlist updateWishlist(@PathVariable Long id,
                                   @RequestBody Wishlist wishlist) {
        return wishlistService.updateWishlist(id, wishlist);
    }

    @DeleteMapping("/{id}")
    public String deleteWishlist(@PathVariable Long id) {
        wishlistService.deleteWishlist(id);
        return "Wishlist deleted successfully";
    }
}