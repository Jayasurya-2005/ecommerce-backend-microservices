package com.ecommerce.cartmodule.controller;
import com.ecommerce.cartmodule.entity.*;
import com.ecommerce.cartmodule.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    // ✅ Manual constructor (fix)
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public Cart addToCart(@RequestParam Long userId,
                          @RequestParam Long productId,
                          @RequestParam int quantity) {
        return cartService.addToCart(userId, productId, quantity);
    }

    @GetMapping("/{userId}")
    public Cart getCart(@PathVariable Long userId) {
        return cartService.getCart(userId);
    }

    @PutMapping("/update")
    public Cart updateItem(@RequestParam Long itemId,
                           @RequestParam int quantity) {
        return cartService.updateItem(itemId, quantity);
    }

    @DeleteMapping("/remove/{itemId}")
    public String removeItem(@PathVariable Long itemId) {
        cartService.removeItem(itemId);
        return "Item removed";
    }
}