package com.xworkz.shop;

import com.xworkz.shop.shopdata.ShopDto;

public class ShopStarter {

	public static void main(String[] args) {
		
		ShopDto dto = new ShopDto("Navami SuperMarket", "Mijar", 1000000l, "navam den", "SuperMarket", "General Store", "Sell them to customers", "Disorientating", 89.99f, 
				20.43d, 90000, 'S', false, "cost of goods sold", 5, "goodday", 10, "Onion", 30, "MTR Garam Masala");
		
		//System.out.println(dto);
		
		dto.setShopName("navami WalkMarket");
		System.out.println(dto.getShopName());
		
		dto.setShopAddress("Moodbidre");
		System.out.println(dto.getShopAddress());
		
		dto.setShopPrice(1500000l);
		System.out.println(dto.getShopPrice());
		
		dto.setOwnerName("Sheela");
		System.out.println(dto.getOwnerName());
		
		dto.setShopType("walkMarket");
		System.out.println(dto.getShopType());
		
		dto.setShopConsist("Grocery Store");
		System.out.println(dto.getShopConsist());
		
		dto.setShopPurpose("to trade");
		System.out.println(dto.getShopPurpose());
		
		dto.setShopDesign("interior");
		System.out.println(dto.getShopDesign());
		
		dto.setShopProfitPercent(90.99f);
		System.out.println(dto.getShopProfitPercent());
		
		dto.setShopLossPercent(10.00d);
		System.out.println(dto.getShopLossPercent());
		
		dto.setShopIncome(100000);
		System.out.println(dto.getShopIncome());
		
		dto.setFirstLetterOfShop('S');
		System.out.println(dto.getFirstLetterOfShop());
		
		dto.setCanWeGetAllItemsInOneShop(false);
		System.out.println(dto.isCanWeGetAllItemsInOneShop());
		
		dto.setShopExpenses("Utilities");
		System.out.println(dto.getShopExpenses());
		
		dto.setNoOfShopExpenses(5);
		System.out.println(dto.getNoOfShopExpenses());
		
		dto.setBiscuitName("Marie");
		System.out.println(dto.getBiscuitName());
		
        dto.setBiscuitPrice(20);
        System.out.println(dto.getBiscuitPrice());
        
        dto.setVegetableName("Tomato");
        System.out.println(dto.getVegetableName());
        
        dto.setVegPrice(40);
        System.out.println(dto.getVegPrice());
        
        dto.setMasalaName("MTR ChickenMasala");
        System.out.println(dto.getMasalaName());
        
        dto.setMasalaPrice(20);
        System.out.println(dto.getMasalaPrice());
        
        dto.setCurdname("Amul Premium");
        System.out.println(dto.getCurdname());
        
        dto.setCurdPrice((byte)12);
        System.out.println(dto.getCurdPrice());
        
        dto.setIceCreamName("Amul Icr Cream");
        System.out.println(dto.getIceCreamName());
        
        dto.setIceCreamPrice((byte) 50);
        System.out.println(dto.getIceCreamPrice());
        
        dto.setMilkName("Nandini");
        System.out.println(dto.getMilkName());
        
        dto.setMilkPrice(23);
        System.out.println(dto.getMilkPrice());
        
        dto.setWheatFloreName("Aashirvaad");
        System.out.println(dto.getWheatFloreName());
        
        dto.setWheatFlourPrice(150);
        System.out.println(dto.getWheatFlourPrice());
        
        dto.setChacolateName("KitKat");
        System.out.println(dto.getChacolateName());
        
        dto.setChacolatePrice(100);
        System.out.println(dto.getChacolatePrice());
        
        dto.setShampooName("ClinicPlus");
        System.out.println(dto.getShampooName());
        
        dto.setShampooPrice(57);
        System.out.println(dto.getShampooPrice());
        
        dto.setCooldrinksName("Sprite");
        System.out.println(dto.getCooldrinksName());
        
        dto.setCooldrinksPrice(60);
        System.out.println(dto.getCooldrinksPrice());
        
        dto.setOilName("Fortune");
        System.out.println(dto.getOilName());
        
        dto.setOilPrice(165);
        System.out.println(dto.getOilPrice());
        
        dto.setBreadName("WheatBread");
        System.out.println(dto.getBreadName());
        
        dto.setBreadprice(30);
        System.out.println(dto.getBreadprice());
        
        dto.setCakeName("Apple cake");
        System.out.println(dto.getCakeName());
        
        dto.setCakePrice(25);
        System.out.println(dto.getCakePrice());
        
        dto.setChipsName("Banana Chips");
        System.out.println(dto.getChipsName());
        
        dto.setChipsPrice(45);
        System.out.println(dto.getChipsPrice());
        
        dto.setRiceName("Royal Bullet Rice");
        System.out.println(dto.getRiceName());
        
        dto.setRicePrice(1600);
        System.out.println(dto.getRicePrice());
        
        dto.setSugarPrice(52);
        System.out.println(dto.getSugarPrice());
        
        dto.setMaggiMasalaPrice(5);
        System.out.println(dto.getMaggiMasalaPrice());
        
        dto.setConeIceCreamName("Chocolate");
        System.out.println(dto.getConeIceCreamName());
        
        dto.setConeIceCreamPrice(65);
        System.out.println(dto.getConeIceCreamPrice());
        
        dto.setMeatName("Chicken meat");
        System.out.println(dto.getMeatName());
        
        dto.setMeatPrice(200);
        System.out.println(dto.getMeatPrice());
        
        dto.setPastaName("Fusilli");
        System.out.println(dto.getPastaName());
        
        dto.setPastaPrice(145);
        System.out.println(dto.getPastaPrice());
        
        dto.setCheeseName("Mozzarella");
        System.out.println(dto.getCheeseName());
        
        dto.setCheesePrice(400);
        System.out.println(dto.getCheesePrice());
        
        dto.setSnacksname("Khatta Meetha");
        System.out.println(dto.getSnacksname());
        
        dto.setSnacksPrice(140);
        System.out.println(dto.getSnacksPrice());
        
        dto.setCrackersName("Shot Cracker");
        System.out.println(dto.getCakeName());
        
        dto.setCarckersPrice(150);
        System.out.println(dto.getCarckersPrice());
        
        dto.setEggPrice(6);
        System.out.println(dto.getEggPrice());
        
        dto.setCerealsName("Millet Flakes");
        System.out.println(dto.getCerealsName());
        
        dto.setCerealsPrice(650);
        System.out.println(dto.getCerealsPrice());
        
        dto.setSeaFoodName("Fish");
        System.out.println(dto.getSeaFoodName());
        
        dto.setSeaFoodPrice(250);
        System.out.println(dto.getSeaFoodPrice());
        
        dto.setSoapName("Santoor");
        System.out.println(dto.getSoapName());
        
        dto.setSoapPrice(38);
        System.out.println(dto.getSoapPrice());
        
        dto.setDryFruits("Walnut");
        System.out.println(dto.getDryFruits());
        
        dto.setDryFruitsPrice(1850);
        System.out.println(dto.getDryFruitsPrice());
         
	}
	
}
