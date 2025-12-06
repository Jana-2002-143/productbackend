package com.example.shop.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String buyername;

    @Column(nullable = false, unique = false)
    private String buyeremail;

    @Column(nullable = false, unique = false)
    private String itemName;

    @Column(nullable = false, unique = false)
    private String price;

    @Column(nullable = false, unique = false)
    private String image;

    @Column(nullable = false, unique = false)
    private String debited;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getBuyeremail() {
        return buyeremail;
    }

    public void setBuyeremail(String buyeremail) {
        this.buyeremail = buyeremail;
    }

    public String getDebited() {
        return debited;
    }

    public void setDebited(String debited) {
        this.debited = debited;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
