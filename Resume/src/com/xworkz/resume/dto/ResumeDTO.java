package com.xworkz.resume.dto;

public class ResumeDTO {
	
	private String name;
	private String fatherName;
	private String dateOfBirth;
	private long phoneNumber;
	private String email;
	private String degree;
	private AddressDto address;

	public ResumeDTO(String name, String fatherName, String dateOfBirth, long phoneNumber, String email, String degree, AddressDto address) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.degree = degree;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ResumeDTO [name=" + name + ", fatherName=" + fatherName + ", dateOfBirth=" + dateOfBirth
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", degree=" + degree + ", address=" + address
				+ "]";
	}
	
}
