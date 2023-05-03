package com.xworkz.resume.dto;

public class AddressDto {
	
	private byte doorNo;
	private String streetName;
	private String city;
	private int pincode;
	private String state;
	
	public AddressDto(byte doorNo, String streetName, String city, int pincode, String state) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public byte getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(byte doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDto [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}
	
}
