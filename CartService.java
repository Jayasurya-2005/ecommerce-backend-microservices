package com.ecommerce.cartmodule.service;

import com.ecommerce.cartmodule.entity.*;

public interface CartService {

    Cart addToCart(Long userId, Long productId, int quantity);

    Cart getCart(Long userId);

    Cart updateItem(Long itemId, int quantity);

    void removeItem(Long itemId);
}