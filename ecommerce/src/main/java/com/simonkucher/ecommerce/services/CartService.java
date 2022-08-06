package com.simonkucher.ecommerce.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonkucher.ecommerce.domain.models.Cart;
import com.simonkucher.ecommerce.domain.models.CartItemDTO;
import com.simonkucher.ecommerce.entity.models.CartItem;
import com.simonkucher.ecommerce.entity.models.Product;
import com.simonkucher.ecommerce.exception.DuplicateCartItemException;
import com.simonkucher.ecommerce.exception.NotFoundProductException;
import com.simonkucher.ecommerce.repositories.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.var;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class CartService {

	@Autowired
	private Cart cart;

	@Autowired
	ProductRepository productRepository;

	public void addCartItem(@Valid CartItemDTO item) {

		Optional<Product> productOptional = productRepository.findById(item.getProductId());

		if (!productOptional.isPresent())
			throw new NotFoundProductException();

		cart.getCartItems().forEach(cartItem -> {
			if (cartItem.getProductId().getId() == item.getProductId())
				throw new DuplicateCartItemException();
		});

		var cartItem = new CartItem();

		cartItem.setProductId(productOptional.get());
		cartItem.setQuantity(item.getQuantity());

		cart.addCartItem(cartItem);
	}

	public void updateCartItem(@Valid CartItemDTO req) {
		cart.updateCartItem(req.getProductId(), req.getQuantity());
	}

	public void removeCartItem(int productId) {
		cart.removeCartItem(productId);
	}

	public void removeAllCartItems() {
		cart.clearCartItems();
	}

}
