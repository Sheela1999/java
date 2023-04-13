package com.xworkz.arrayclass;

public class Array {
	
	public static void main(String[] args) {
		
		int[] num = {2,4,6,8,20,12,14,16,17,18,10};
		int[] marks = {32,40,57,44,69,89,60,90,80,99,79,55,66,89,100}; 
		String[] cities = {"Belagavi","Goa","Hubli","Gulburga","Dharwad","Gadag","Bangalore","Haveri","Dhavangere","Mangalore"};
        byte[] serialNo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        short[] carNumber = {2345,1235,6789,5643,8987,7783,9317,4981,3824,3425,1053,5637};
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        
        String[] names = new String[15];
        int[] salary = new int[10];
        char[] consonants = new char[21];
        float[] percentage = new float[12];
        long[] phoneNo = new long[5];
        
        System.out.println("forward order jumping 2 elements");
        
        for (int i=0; i<serialNo.length; i++) {
        	
        	if(serialNo[i]%2!=0) {
        		System.out.println(serialNo[i]);
        	}
        }
        
        System.out.println("Reverse order jumping 2 elements");
        
        for (int j=num.length-1; j>=0; j--) {
        	
        	if(num[j]!=0) {
        		System.out.println(num[j]);
        		j--;
        	}
        }
        
        System.out.println("Even Numbers:");
        
        for (int i=0; i<marks.length; i++){
        	
        	if(marks[i]%2==0) {
        		System.out.println(marks[i]);
        	}
        	
        }
}
}
