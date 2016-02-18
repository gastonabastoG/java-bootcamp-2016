package com.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class ShoppingCart implements Serializable {

private static final long serialVersionUID = 1L;
private Map shoppingCartMap;


private OrderRepository order;

public void addProduct(Product product){
shoppingCartMap.put(product.getId(), product);
}

public void removeProduct(Long productId){
shoppingCartMap.remove(productId);
}

public List getShoppingCart(){
return Collections.unmodifiableList(new ArrayList(shoppingCartMap.values()));
}

public void placeOrder(){
	
order.save(getShoppingCart());
shoppingCartMap.clear();

}

public String getOrderStatus(Long orderId){
return order.findOne(orderId).getStatus();
}


void initialize(){
	shoppingCartMap = new HashMap();
	}
}