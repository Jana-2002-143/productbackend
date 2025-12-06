package com.example.shop.Controller;

import com.example.shop.Entity.Order;
import com.example.shop.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OrderControl {

    @Autowired
    private OrderRepository orderRepository;

    // SAVE ORDER
    @PostMapping("/order")
    public ResponseEntity<?> order(@RequestBody Order order){
        Order savedOrder = orderRepository.save(order);
        return ResponseEntity.ok(savedOrder);
    }

    @GetMapping("/history")
    public ResponseEntity<List<Order>> getAllHistory() {
        List<Order> history = orderRepository.findAll();
        return ResponseEntity.ok(history);
    }

    @GetMapping("/history/{email}")
    public ResponseEntity<List<Order>> getUserHistory(@PathVariable String email) {
        List<Order> userOrders = orderRepository.findByBuyerEmail(email);
        return ResponseEntity.ok(userOrders);
    }
}
