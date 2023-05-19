package com.xworkz.wrapperclass;

public class ShortWrapper {
	
	public static void main(String[] args) {
		
		short salary = 30000;
		short fees = 28000;
		short number = 50;
		short c = 2000;
		
		Short sho = Short.valueOf((short) salary);
		System.out.println(sho);
		Short sho1 = Short.valueOf(fees);
		System.out.println(sho1);

        Short result = number;
        System.out.println(result);
        Short res2 = c;
        System.out.println(res2);
        
        short answer = sho.shortValue();
        System.out.println(answer);
        
        short ans2 = c;
        System.out.println(ans2);
	}

}
