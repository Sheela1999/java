package com.xworkz.wrapperclass;

public class DoubleRunner {

	public static void main(String[] args) {
		
		double percentage = 87.90d;
		double population = 3.5d;
		double j = 4567.9087645d;
		double k = 90.9999999999d;
		
		Double res = Double.valueOf(percentage);
		System.out.println(res);
		Double res1 = Double.valueOf(population);
		System.out.println(res1);
		
		Double dou = j;
		System.out.println(dou);
		Double dou1 = k;
		System.out.println(dou1);
		
		double ans = res1.doubleValue();
		System.out.println(ans);
		
		double ans1 = dou;
		System.out.println(ans1);
		

	}

}
