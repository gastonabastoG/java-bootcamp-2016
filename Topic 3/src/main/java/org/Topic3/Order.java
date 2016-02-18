package org.Topic3;

import java.util.List;

public class Order {

private Long id;
private List products;
private String status;

public Order(Long orderId, List products, String status) {
super();
this.id = orderId;
this.products = products;
this.status = status;
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public List getProducts() {
return products;
}

public void setProducts(List products) {
this.products = products;
}
}
