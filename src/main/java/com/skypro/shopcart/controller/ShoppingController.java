package com.skypro.shopcart.controller;

import com.skypro.shopcart.service.ShoppingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/store/order/add")
    public void addGoods(@RequestParam("id") List<Integer> idList) {
        this.shoppingService.addToCart(idList);
    }

    @GetMapping("/store/order/get")
        public List<Integer> getAllId() {

            return this.shoppingService.getAllId();
        }



}
