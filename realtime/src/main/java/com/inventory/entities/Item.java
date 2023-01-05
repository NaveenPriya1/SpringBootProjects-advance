package com.inventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long itemId;
	  private String itemName;
	  private double itemPrice;
	  private String itemDescrition;
	  private String itemCategory;
	  private int itemQuantity;
	  private long vendorId;
	
	  
	  public Item() {
		super();
	}


	public Item( String itemName, double itemPrice, String itemDescrition, String itemCategory,
			int itemQuantity, long vendorId) {
		super();
		
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDescrition = itemDescrition;
		this.itemCategory = itemCategory;
		this.itemQuantity = itemQuantity;
		this.vendorId = vendorId;
	}


	public long getItemId() {
		return itemId;
	}


	public void setItemId(long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemDescrition() {
		return itemDescrition;
	}


	public void setItemDescrition(String itemDescrition) {
		this.itemDescrition = itemDescrition;
	}


	public String getItemCategory() {
		return itemCategory;
	}


	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public long getVendorId() {
		return vendorId;
	}


	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemDescrition="
				+ itemDescrition + ", itemCategory=" + itemCategory + ", itemQuantity=" + itemQuantity + ", vendorId="
				+ vendorId + "]";
	}
	  
	  
	  
	  
}
