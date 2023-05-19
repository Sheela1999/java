package com.xworkz.wrapperclass;

public class LongTester {

	public static void main(String[] args) {
		
		long phoneNo = 7890654321l;
		long budget = 23456789l;
		long f = 200l;
		long pincode = 600089l;
		
        Long res = Long.valueOf(phoneNo);
        System.out.println(res);
        Long res1 = Long.valueOf(budget);
        System.out.println(res1);
        
        Long lon = f;
        System.out.println(lon);
        Long lon1 = pincode;
        System.out.println(lon1);
        
        long ans = res.longValue();
        System.out.println(ans);
        
        long ans1 = lon;
        System.out.println(ans1);
	}

}
