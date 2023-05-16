package com.xworkz.encapsulation;

import com.xworkz.encapsulation.data.LaptopDao;

public class LaptopRunner extends LaptopDao {

	public static void main(String[] args) {
		
		LaptopDao  data = new LaptopDao("Hp", 31000, "intel1", "5th gen");
		
		LaptopDao  data1 = new LaptopDao("Asus", 39000, "intel2", "10th gen");
		
		System.out.println(data);
		System.out.println(data1);
		
		System.out.println("----------------------------------------------------------------------");
		
		data.setName("DELL");
		System.out.println(data.getName());
		
		data.setPrice(51000);
		System.out.println(data.getPrice());
		
		data.setProcessor("intel");
		System.out.println(data.getProcessor());
		
		data.setGenaration("7th Gen");
		System.out.println(data.getGenaration());
		
		data.toString();
		
		boolean res = data.equals(data1);
		System.out.println(res);
		
		System.out.println("----------------------------------------------------------");
		
		LaptopRunner dao = new LaptopRunner();
		
		dao.processor = "intel3";
		System.out.println(dao.processor);

	}

}
