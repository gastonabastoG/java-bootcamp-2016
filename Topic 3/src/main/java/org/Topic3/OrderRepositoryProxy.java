package org.Topic3;

import java.util.List;

public class OrderRepositoryProxy implements OrderRepository{

		OrderRepository implementation;  
	  
	    protected OrderRepositoryProxy(OrderRepository ord) {  
	        this.implementation = ord;  
	    }  
	  
	    public Order getOrder(Long orderId) {
			return implementation.getOrder(orderId);
		} 
	    
	    public Long getOrderId() {  
	        return implementation.getOrderId();  
	    }

		public Long placeOrder(List order) {
			return implementation.placeOrder(order);
		}  
	}  


