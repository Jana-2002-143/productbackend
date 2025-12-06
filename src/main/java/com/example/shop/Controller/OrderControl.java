package com.example.shop.Controller;

import com.example.shop.Entity.Order;
import com.example.shop.Entity.User;
import com.example.shop.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OrderControl {

@Autowired
    public OrderRepository orderRepository;
    @PostMapping("/order")
    public ResponseEntity<?> order(@RequestBody Order order){
        Order savedOrder = orderRepository.save(order);
        return ResponseEntity.ok("SuccessFull You Are Purchased");
    }
}
