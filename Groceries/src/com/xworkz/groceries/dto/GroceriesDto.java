package com.xworkz.groceries.dto;

public class GroceriesDto {
	
	private String shopName;
	private String type;
	private String location;
	private int chacolatePrice;
	private String chacolateName;
	
	public GroceriesDto() {
		System.out.println("Default Constructor");
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getChacolatePrice() {
		return chacolatePrice;
	}

	public void setChacolatePrice(int chacolatePrice) {
		this.chacolatePrice = chacolatePrice;
	}

	public String getChacolateName() {
		return chacolateName;
	}

	public void setChacolateName(String chacolateName) {
		this.chacolateName = chacolateName;
	}

	@Override
	public String toString() {
		return "GroceriesDto [shopName=" + shopName + ", type=" + type + ", location=" + location + ", chacolatePrice="
				+ chacolatePrice + ", chacolateName=" + chacolateName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceriesDto other = (GroceriesDto) obj;
		if (chacolateName == null) {
			if (other.chacolateName != null)
				return false;
		} else if (!chacolateName.equals(other.chacolateName))
			return false;
		if (chacolatePrice != other.chacolatePrice)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
