package com.ie.controller;


import com.ie.bean.Flower;
import com.ie.bean.Order;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ie.service.IFlowerService;
import com.ie.service.IOrderService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private IFlowerService flowerService;
    
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/flowers")
    public List<Flower> findFlowers() {
        return flowerService.findAll();
    }

    @RequestMapping("/flowers/{flowerName}")
    public Flower findFlower(@PathVariable String flowerName) {    
        return flowerService.findByName(flowerName);
    }
    
    @RequestMapping("/orders/{shopName}")
    public List<Order> findOrder(@PathVariable String shopName) {    
        return orderService.findOrderByName(shopName);
    }
}