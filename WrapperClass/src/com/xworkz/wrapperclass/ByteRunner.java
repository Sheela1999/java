package com.xworkz.wrapperclass;

public class ByteRunner {

	public static void main(String[] args) {
		
		byte num = 120;
		byte a = 10;
		byte noOfStudents = 100;
		byte b = 30;
		
		//manual
		Byte res = Byte.valueOf(num);
		System.out.println(res);
		Byte res1 = Byte.valueOf(a);
		System.out.println(res1);
		//by compiler
		Byte by = noOfStudents;
		System.out.println(by);
		Byte by1 = b;
		System.out.println(by1);
		
		//manual data
		byte ans = res.byteValue();
		System.out.println(ans);
		
		//automatically
		byte ans1 = by;
		System.out.println(ans1);
		
		
		

	}

}
