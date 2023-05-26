package com.xworkz.mobileproject;

public class InterfaceRunner {

	public static void main(String[] args) {
		
		System.out.println("------------Samsung---------------------");
		
		Smartphone sam = new Samsung();//loose coupling 
		sam.call();
		sam.camera();
		sam.accessingInternet();
		sam.message();
		sam.playMusicAndVideo();
		sam.storage();
		sam.touchScreen();
		
		System.out.println("---------------Nokia---------------------------");
		
		Mobile mob = new Nokia();
		mob.call();
		mob.message();
		
		System.out.println("------------Vivo------------------------------");
		
		Vivo vivo = new Vivo();//tight coupling
		vivo.call();
		vivo.message();
		vivo.camera();
		vivo.accessingInternet();
		vivo.playMusicAndVideo();
		vivo.storage();
		vivo.touchScreen();

	}

}
