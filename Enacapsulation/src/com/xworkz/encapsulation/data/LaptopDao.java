package com.xworkz.encapsulation.data;

public class LaptopDao {
	
	private String name;
	int price;
	protected String processor;
	public String genaration ;
	
	public LaptopDao() {
		System.out.println("no args Constructor");
	}
	
	public LaptopDao(String name, int price, String processor, String genaration) {
		super();
		this.name = name;
		this.price = price;
		this.processor = processor;
		this.genaration = genaration;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGenaration() {
		return genaration;
	}
	public void setGenaration(String genaration) {
		this.genaration = genaration;
	}

	@Override
	public String toString() {
		return "LaptopDao [name=" + name + ", price=" + price + ", processor=" + processor + ", genaration="
				+ genaration + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopDao other = (LaptopDao) obj;
		if (genaration == null) {
			if (other.genaration != null)
				return false;
		} else if (!genaration.equals(other.genaration))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		return true;
	}
	
	
}
