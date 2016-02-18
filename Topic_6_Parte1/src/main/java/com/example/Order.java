package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long account;
	private Long product;
	private int purchasenumber;
	private int creditcard;

	public Order(Long account, Long product, int purchasenumber, int creditcard) {
	
	this.account = account;
	this.product = product;
	this.purchasenumber = purchasenumber;
	this.creditcard = creditcard;
	}
	
	public Order(Long account, Long product, int purchasenumber ) {
		
		this.account = account;
		this.product = product;
		this.purchasenumber = purchasenumber;
		
		}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public Long getAccount() {
	return account;
	}

	public void setAccount(Long account) {
	this.account = account;
	}

	public Long getProduct() {
	return product;
	}

	public void setProduct(Long product) {
	this.product = product;
	}
	
	public int getCreditCard() {
		return creditcard;
	}

	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}
	
	public int getPurchasenumber() {
		return purchasenumber;
	}

	public void setPurchasenumber(int purchasenumber) {
		this.purchasenumber = purchasenumber;
	}
	
	Order(){
		
	}
}
