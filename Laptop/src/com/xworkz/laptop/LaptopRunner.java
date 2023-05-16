package com.xworkz.laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		HpDragonflyFolioG3 hp = new HpDragonflyFolioG3();
		hp.storage();
		hp.playMusic();
		hp.runsSmoothly();
		hp.hasTouchpad();
		hp.hastouchScreen();
		hp.toWriteProgrms();
		hp.toStorePhotos();
		hp.toStorefiles();
		
		System.out.println("----------------------------------------------");
		
		Apple app = new Apple();
		app.storage();
		app.runsSmoothly();
		app.hasTouchpad();
		app.playMusic();
		app.toStorefiles();
		app.hasWideScreen();
		
		System.out.println("--------------------------------------------");
		
		Lenovo len = new Lenovo();
		len.foldable();
		len.givesFingerPrint();
		len.hasTouchpad();
		len.storage();
		len.runsSmoothly();
		len.playMusic();
		len.toStorefiles();
	
        System.out.println("-------------------------------------");
        
        LaptopData.playMovies();
        
	}

}
