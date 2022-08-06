package com.simonkucher.ecommerce.domain.models;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class CartItemDTO {
	
	private int productId;

	private int quantity;
}
