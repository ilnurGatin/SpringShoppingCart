package com.skypro.shopcart.service;

import com.skypro.shopcart.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ShoppingService {
    private final Cart cart;

    public ShoppingService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idList) {
        cart.addIds(idList);
    }

    public List<Integer> getAllId() {
        return cart.getSessionCart();
    }
}
