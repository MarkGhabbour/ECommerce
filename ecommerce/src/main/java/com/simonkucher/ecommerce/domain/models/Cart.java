package com.simonkucher.ecommerce.domain.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.simonkucher.ecommerce.entity.models.CartItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

	private List<CartItem> cartItems = new ArrayList<>();

	private double cartTotal;

	public void addCartItem(CartItem item) {
		cartItems.add(item);
	}

	public void updateCartItem(int productId, int quantity) {
		cartItems.forEach(i -> {
			if (i.getProductId().getId() == productId)
				i.setQuantity(quantity);
		});
	}

	public void removeCartItem(int productId) {
		cartItems.forEach(i -> {
			if (i.getProductId().getId() == productId)
				cartItems.remove(i);
		});
	}

	public void clearCartItems() {
		cartItems.clear();
	}

	public void calCartTotal() {
		this.cartTotal = 0.0;
		cartItems.forEach(item -> this.cartTotal += item.getPrice());
	}

}
