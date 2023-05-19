package com.xworkz.wrapperclass;

public class FloatWrap {

	public static void main(String[] args) {
		
		float percent = 99.90f;
		float g = 2.5f;
		float h = 456.789f;
		float i = 9087.00f;
		
		Float res = Float.valueOf(percent);
		System.out.println(res);
		Float res1 = Float.valueOf(g);
		System.out.println(res1);
		
		Float flo = h;
		System.out.println(flo);
		Float flo1 = i;
		System.out.println(flo1);
		
		float ans = res.floatValue();
		System.out.println(ans);
		
		float ans1 = flo1;
		System.out.println(ans1);

	}

}
