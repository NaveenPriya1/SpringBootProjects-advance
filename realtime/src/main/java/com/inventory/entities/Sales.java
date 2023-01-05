package com.inventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long saleId;
	private long customerId;
	private long itemId;
	private long vendorId;
	private String itemName;
	private String customerName;
	private long saleQuantity;
	private String saleDate;
	private double totalPrice;
	private double priceperItem;
	
	
	public Sales() {
		super();
	}


	public Sales(long customerId, long itemId, long vendorId, String itemName, String customerName, long saleQuantity,
			String saleDate, double totalPrice, double priceperItem) {
		super();
		this.customerId = customerId;
		this.itemId = itemId;
		this.vendorId = vendorId;
		this.itemName = itemName;
		this.customerName = customerName;
		this.saleQuantity = saleQuantity;
		this.saleDate = saleDate;
		this.totalPrice = totalPrice;
		this.priceperItem = priceperItem;
	}


	public long getSaleId() {
		return saleId;
	}


	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}


	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public long getItemId() {
		return itemId;
	}


	public void setItemId(long itemId) {
		this.itemId = itemId;
	}


	public long getVendorId() {
		return vendorId;
	}


	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getSaleQuantity() {
		return saleQuantity;
	}


	public void setSaleQuantity(long saleQuantity) {
		this.saleQuantity = saleQuantity;
	}


	public String getSaleDate() {
		return saleDate;
	}


	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public double getPriceperItem() {
		return priceperItem;
	}


	public void setPriceperItem(double priceperItem) {
		this.priceperItem = priceperItem;
	}


	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", customerId=" + customerId + ", itemId=" + itemId + ", vendorId="
				+ vendorId + ", itemName=" + itemName + ", customerName=" + customerName + ", saleQuantity="
				+ saleQuantity + ", saleDate=" + saleDate + ", totalPrice=" + totalPrice + ", priceperItem="
				+ priceperItem + "]";
	}
	
	
	
	
	
	
}
