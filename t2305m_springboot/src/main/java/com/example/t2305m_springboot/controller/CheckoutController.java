package com.example.t2305m_springboot.controller;

import com.example.t2305m_springboot.dto.req.OrderReq;
import com.example.t2305m_springboot.dto.res.CategoryRes;
import com.example.t2305m_springboot.dto.res.OrderRes;
import com.example.t2305m_springboot.entity.Order;
import com.example.t2305m_springboot.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/checkout")
public class CheckoutController {
    private final OrderService orderService;

    public CheckoutController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping()
    public List<OrderRes> getAllOrders() {
        return orderService.all();
    }


    @PostMapping()
    public ResponseEntity<Order> checkout(@RequestBody OrderReq req){
        return ResponseEntity.ok(orderService.createOrder(req));
    }
}