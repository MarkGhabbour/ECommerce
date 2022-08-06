package com.simonkucher.ecommerce.domain.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Cart {

	private List<CartItem> cartItems = new ArrayList<>();

	private double cartTotal;

	public void addCartItem(CartItem item) {
		cartItems.add(item);
	}

	public void updateCartItem(CartItem item) {
		cartItems.forEach(i -> {
			if (i.getProductId().equals(item.getProductId()))
				i.setQuantity(item.getQuantity());
		});
	}

	public void removeCartItem(CartItem item) {
		cartItems.remove(item);
	}

	public void clearCartItem(CartItem item) {
		cartItems.clear();
	}

	public void calCartTotal() {
		cartItems.forEach(item -> this.cartTotal += item.getPrice());
	}

}
