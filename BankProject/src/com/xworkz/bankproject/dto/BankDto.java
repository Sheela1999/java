package com.xworkz.bankproject.dto;

public class BankDto {

	private String bankName;
	private int yearOfEstablishment;
	private String branch;
	private String type;

	public BankDto() {
		System.out.println("default constructor");
	}

	public BankDto(String bankName, int yearOfEstablishment, String branch, String type) {
		super();
		this.bankName = bankName;
		this.yearOfEstablishment = yearOfEstablishment;
		this.branch = branch;
		this.type = type;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getYearOfEstablishment() {
		return yearOfEstablishment;
	}

	public void setYearOfEstablishment(int yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BankDto [bankName=" + bankName + ", yearOfEstablishment=" + yearOfEstablishment + ", branch=" + branch
				+ ", type=" + type + "]";
	}

}
