package org.Topic3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

private Map orders;
private Long orderId = 0L;

public Long getOrderId(){
return orderId;
}

public Long placeOrder(List order) {
orders.put(++orderId, new Order(orderId, order, "CREATED"));
return orderId;
}

public Order getOrder(Long orderId) {
	return (Order) orders.get(orderId);
}


void initialize(){
orders = new HashMap();
}

}