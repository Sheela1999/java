package com.xworkz.wrapperclass;

public class BooleanTester {

	public static void main(String[] args) {
		
		boolean isEveryThingOK = true;
		boolean isClassesGoingOnTime = false;
		boolean areYouOk = true;
		boolean areYouPuttingEfforts = false;
		
		Boolean res = Boolean.valueOf(isEveryThingOK);
		System.out.println(res);
		Boolean res1 = Boolean.valueOf(isClassesGoingOnTime);
		System.out.println(res1);
		
		Boolean boo = areYouOk;
		System.out.println(boo);
		Boolean boo1 = areYouPuttingEfforts;
		System.out.println(boo1);
		
		boolean ans = res.booleanValue();
		System.out.println(ans);
		
		boolean ans1 = boo1;
		System.out.println(ans1);

	}

}
