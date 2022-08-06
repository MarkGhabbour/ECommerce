package com.simonkucher.ecommerce.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderLineItemKey {
	
	private int customerOrderId;
	private int lineItemsId;

}
