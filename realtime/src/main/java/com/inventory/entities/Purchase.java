package com.inventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

@Entity
public class Purchase {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long purchaseId;
	 private long itemId;
	 private String itemName;
	 private int purchaseQuantity;
	 private String purchaseDate;
	 private double totalPrice;
	 private double priceperItem;
	 private long customerId;
	 private String CustomerName;
	 
	 //customer can purchase many items
	 @ManyToOne()
	 private Customer customer;
		/*
		 * @OneToOne private PurchaseDetails purchasedetails;
		 */

	public Purchase() {
		super();
	}
		public Purchase(long itemId, String itemName, int purchaseQuantity, String purchaseDate, double totalPrice,
				double priceperItem, long customerId, String customerName, Customer customer) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.purchaseQuantity = purchaseQuantity;
			this.purchaseDate = purchaseDate;
			this.totalPrice = totalPrice;
			this.priceperItem = priceperItem;
			this.customerId = customerId;
			CustomerName = customerName;
			this.customer = customer;
		}
		public long getPurchaseId() {
			return purchaseId;
		}
		public void setPurchaseId(long purchaseId) {
			this.purchaseId = purchaseId;
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
		public int getPurchaseQuantity() {
			return purchaseQuantity;
		}
		public void setPurchaseQuantity(int purchaseQuantity) {
			this.purchaseQuantity = purchaseQuantity;
		}
		public String getPurchaseDate() {
			return purchaseDate;
		}
		public void setPurchaseDate(String purchaseDate) {
			this.purchaseDate = purchaseDate;
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
		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		@Override
		public String toString() {
			return "Purchase [purchaseId=" + purchaseId + ", itemId=" + itemId + ", itemName=" + itemName
					+ ", purchaseQuantity=" + purchaseQuantity + ", purchaseDate=" + purchaseDate + ", totalPrice="
					+ totalPrice + ", priceperItem=" + priceperItem + ", customerId=" + customerId + ", CustomerName="
					+ CustomerName + ", customer=" + customer + "]";
		}
	 
	 
	 
}
