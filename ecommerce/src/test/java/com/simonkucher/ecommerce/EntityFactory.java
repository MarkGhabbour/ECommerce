package com.simonkucher.ecommerce;

import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;
import com.simonkucher.ecommerce.entity.models.*;

public class EntityFactory {
    final Faker faker = new Faker(Locale.FRANCE);

    public Product createProduct(String code,String description,int quantity,
    		byte[] image,double price, Date lastUpdate,int categoryId) {
        return Product.builder()
        		.code(code)
        		.description(description)
        		.quantity(quantity)
        		.image(image)
        		.price(price)
        		.lastUpdate(lastUpdate)
        		.categoryId(categoryId)
                .build();
    }
    
    public Category createCategory(String name, Date lastUpdate) {
    	
    	return Category.builder()
    			.name(name)
    			.lastUpdate(lastUpdate)
    			.build();

    }
    
    public CartItem createCartItem(Product product, int quantity) {
    	
    	return CartItem.builder()
    		   .productId(product)
    		   .quantity(quantity)
    		   .build();
    	
    	
    }
    
    
    
    
    

}
