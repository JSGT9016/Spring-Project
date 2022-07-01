package com.jos.sellAuto.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(value=OrderDetails.CompositeId.class)
public class OrderDetails implements Serializable{
	
	@Id
	private Long orderNumber;
	@Id
	private String productCode;
	private int quantityOrdered;
	private float priceEach;
	private int orderLineNumber;
	
	public static class CompositeId implements Serializable{
		
		private Long orderNumber;
		private String productCode;
		
		public Long getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(Long orderNumber) {
			this.orderNumber = orderNumber;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
			result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CompositeId other = (CompositeId) obj;
			if (orderNumber == null) {
				if (other.orderNumber != null)
					return false;
			} else if (!orderNumber.equals(other.orderNumber))
				return false;
			if (productCode == null) {
				if (other.productCode != null)
					return false;
			} else if (!productCode.equals(other.productCode))
				return false;
			return true;
		}
		
		
		
	}
	
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public float getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(float priceEach) {
		this.priceEach = priceEach;
	}
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
	@Override
	public String toString() {
		return "OrderDetails [orderNumber=" + orderNumber + ", productCode=" + productCode + ", quantityOrdered="
				+ quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + "]";
	}
	
	
	
	

}
