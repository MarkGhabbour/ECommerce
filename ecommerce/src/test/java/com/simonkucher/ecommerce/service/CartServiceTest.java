package com.simonkucher.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simonkucher.ecommerce.EntityFactory;
import com.simonkucher.ecommerce.domain.models.CartItemDTO;
import com.simonkucher.ecommerce.entity.models.Category;
import com.simonkucher.ecommerce.entity.models.Product;
import com.simonkucher.ecommerce.repositories.CategoryRepository;
import com.simonkucher.ecommerce.repositories.ProductRepository;
import com.simonkucher.ecommerce.services.CartService;

import lombok.var;

@SpringBootTest
public class CartServiceTest {
	private final EntityFactory entityFactory = new EntityFactory();
	private final static Integer patient_id = 657679;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CartService cartService;

	@Test
	void addCartItem() {

		Category category = categoryRepository.save(entityFactory.createCategory("categ_01", new Date()));
		
		Product product = productRepository.save(
				entityFactory.createProduct("p01", "tomatoes", 100, null, 5,  new Date(), category.getId()));

		
		var cartItem = entityFactory.createCartItem(product, 10);

		cartService.addCartItem(new CartItemDTO(product.getId(), 4));
		
		assertEquals(cartService.getCart().getCartItems().size(), 1);
		
		assertTrue(cartService.getCart().getCartItems().contains(cartItem));
		
	}

}


