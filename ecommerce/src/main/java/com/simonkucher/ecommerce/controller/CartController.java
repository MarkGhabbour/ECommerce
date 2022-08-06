package com.simonkucher.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonkucher.ecommerce.domain.models.CartItemDTO;
import com.simonkucher.ecommerce.services.CartService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(path = "cart")
@RestController()
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping()
	public void addCartItem(@RequestBody @Valid CartItemDTO req) {
		cartService.addCartItem(req);
	}
	
	@PutMapping()
	public void updateCartItem(@RequestBody @Valid CartItemDTO req) {
		cartService.updateCartItem(req);
	}
	
	@DeleteMapping(value="/{productId}")
	public void removeCartItem(@PathVariable int productId) {
		cartService.removeCartItem(productId);
	}
	
	@DeleteMapping()
	public void removeAllCartItems() {
		cartService.removeAllCartItems();
	}

}
