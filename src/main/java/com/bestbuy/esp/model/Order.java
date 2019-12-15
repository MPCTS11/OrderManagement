package com.bestbuy.esp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_INFO")
public class Order implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="NAME")
	private String name;

	@Column(name="QUANTITY")
	private String quantity;

	@Column(name="STATUS")
	private String status;

	@Column(name="ADDRESS")
	private String address;

	public Order() {

	}

	public Order(int id, String name, String quantity, String status, String address) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.status = status;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", quantity=" + quantity + ", status=" + status + ", address="
				+ address + "]";
	}

}
