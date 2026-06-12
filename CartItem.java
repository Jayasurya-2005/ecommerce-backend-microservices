package com.ecommerce.cartmodule.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    // ✅ ADD THESE
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }
    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}