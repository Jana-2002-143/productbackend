package com.example.shop.Repository;

import com.example.shop.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    Optional<Order> findByItemBuyerName(String buyername);
    Optional<Order> findByItemBuyerEmail(String buyeremail);
    Optional<Order> findByItemName(String itemName);
    Optional<Order> findByPrice(String price);
    Optional<Order> findByImage(String image);
    Optional<Order> findByDebited(String debited);
}