package com.xworkz.wrapperclass;

public class IntegerStarter {

	public static void main(String[] args) {
		
		int number = 1234567;
		int d = 234;
		int price = 900;
		int e = 20000;
		
		Integer res = Integer.valueOf(number);
		System.out.println(res);
		Integer res1 = Integer.valueOf(d);
		System.out.println(res1);
		
		Integer in = price;
		System.out.println(in);
		Integer in1 = e;
		System.out.println(in1);
		
		int ans = res1.intValue();
		System.out.println(ans);
		
		int ans1 = in1;
		System.out.println(ans1);

	}

}
