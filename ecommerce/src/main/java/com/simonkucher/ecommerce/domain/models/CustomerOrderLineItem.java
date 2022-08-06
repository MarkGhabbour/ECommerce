package com.simonkucher.ecommerce.domain.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "customer_order_order_line_item")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = { "CustomerOrder_id", "lineItems_id" }) })
public class CustomerOrderLineItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(optional = false)
	@JoinColumns(value = { @JoinColumn(name = "CustomerOrder_id", referencedColumnName = "id")})
	private CustomerOrder customerOrder;
	
	@Id
	@OneToOne(optional = false)
	@JoinColumns(value = { @JoinColumn(name = "lineItems_id", referencedColumnName = "id")})
	private CartItem cartItem;
	
	

}
