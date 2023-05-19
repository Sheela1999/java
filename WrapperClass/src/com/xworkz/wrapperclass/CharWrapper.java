package com.xworkz.wrapperclass;

public class CharWrapper {

	public static void main(String[] args) {
		
		char l = 'S';
		char m = 'H';
		char n = 'R';
		char o = 'I';
		
		Character res = Character.valueOf(l);
		System.out.println(res);
		Character res1 = Character.valueOf(m);
		System.out.println(res1);
		
		Character cha = n;
		System.out.println(cha);
		Character cha1 = o;
		System.out.println(cha1);
		
		char ans = res.charValue();
		System.out.println(ans);
		
		char ans1 = cha1;
		System.out.println(ans1);

	}

}
