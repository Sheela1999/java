package com.xworkz.teacher.Dto;

public class TeacherDto {
	
	private String teacherName;
	private int teacherSalary;
	private String qualification;
	private String teachingSub;
	private String address;
	
	public TeacherDto() {
		System.out.println("Default Constructor");
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getTeacherSalary() {
		return teacherSalary;
	}

	public void setTeacherSalary(int teacherSalary) {
		this.teacherSalary = teacherSalary;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getTeachingSub() {
		return teachingSub;
	}

	public void setTeachingSub(String teachingSub) {
		this.teachingSub = teachingSub;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "TeacherDto [teacherName=" + teacherName + ", teacherSalary=" + teacherSalary + ", qualification="
				+ qualification + ", teachingSub=" + teachingSub + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeacherDto other = (TeacherDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (teacherName == null) {
			if (other.teacherName != null)
				return false;
		} else if (!teacherName.equals(other.teacherName))
			return false;
		if (teacherSalary != other.teacherSalary)
			return false;
		if (teachingSub == null) {
			if (other.teachingSub != null)
				return false;
		} else if (!teachingSub.equals(other.teachingSub))
			return false;
		return true;
	}
}
