package com.skypro.shopcart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> sessionCart = new ArrayList<>();

    public void addIds(List<Integer> idList) {
        sessionCart.addAll(idList);
    }

    public List<Integer> getSessionCart(){
        return sessionCart;
    }
}
