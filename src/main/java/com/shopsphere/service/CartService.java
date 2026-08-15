package com.shopsphere.service;

import com.shopsphere.entity.Cart;
import com.shopsphere.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
}