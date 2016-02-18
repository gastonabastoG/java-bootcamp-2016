package org.Topic3;

import java.util.List;

public interface OrderRepository {

public Long placeOrder(List order);
public Order getOrder(Long orderId);
public Long getOrderId();

}