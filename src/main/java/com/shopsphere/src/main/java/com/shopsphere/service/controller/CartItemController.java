package com.shopsphere.controller;

import com.shopsphere.entity.CartItem;
import com.shopsphere.service.CartItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public CartItem getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    @PostMapping
    public CartItem createCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @PutMapping("/{id}")
    public CartItem updateCartItem(@PathVariable Long id,
                                   @RequestBody CartItem cartItem) {
        return cartItemService.updateCartItem(id, cartItem);
    }

    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return "Cart item deleted successfully";
    }
}