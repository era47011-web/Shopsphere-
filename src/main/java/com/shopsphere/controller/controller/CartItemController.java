package com.shopsphere.controller;

import com.shopsphere.entity.CartItem;
import com.shopsphere.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public CartItem getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    @PostMapping
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @PutMapping("/{id}")
    public CartItem updateCartItem(@PathVariable Long id,
                                   @RequestBody CartItem cartItem) {
        cartItem.setId(id);
        return cartItemService.saveCartItem(cartItem);
    }

    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return "Cart item deleted successfully";
    }
}