package com.xworkz.shop.shopdata;

public class ShopDto {
	
	private String shopName;
	private String shopAddress;
	private long shopPrice;
	private String ownerName;
	private String shopType;
	private String shopConsist;
	private String shopPurpose;
	private String shopDesign;
	private float shopProfitPercent;
	private double shopLossPercent;
	private int shopIncome;
	private char firstLetterOfShop;
	private boolean canWeGetAllItemsInOneShop;
	private String shopExpenses;
	private int noOfShopExpenses;
	private String biscuitName;
	private int biscuitPrice;
	private String VegetableName;
	private int vegPrice;
	private String masalaName;
	private int masalaPrice;
	private String curdname;
	private byte curdPrice;
	private String iceCreamName;
	private byte iceCreamPrice;
	private String milkName;
	private int milkPrice;
	private String wheatFloreName;
	private int wheatFlourPrice;
	private String chacolateName;
	private int chacolatePrice;
	private String shampooName;
	private int ShampooPrice;
	private String cooldrinksName;
	private int cooldrinksPrice;
	private String oilName;
	private int oilPrice;
	private String breadName;
	private int breadprice;
	private String cakeName;
	private int cakePrice;
	private String chipsName;
	private int chipsPrice;
	private String riceName;
	private int ricePrice;
	private int sugarPrice;
	private int maggiMasalaPrice;
	private int coneIceCreamPrice;
	private String coneIceCreamName;
	private String meatName;
	private int meatPrice;
	private String pastaName;
	private int pastaPrice;
	private String cheeseName;
	private int cheesePrice;
	private String snacksname;
	private int snacksPrice;
	private String crackersName;
	private int CarckersPrice;
	private int eggPrice;
	private String cerealsName;
	private int cerealsPrice;
	private String seaFoodName;
	private int seaFoodPrice;
	private String soapName;
	private int soapPrice;
	private String dryFruits;
	private int dryFruitsPrice;
	
	public ShopDto(String shopName,String shopAddress, long shopPrice, String ownerName, String shopType, String shopConsist, String shopPurpose, String shopDesign, float shopProfitPercent,
			double shopLossPercent, int shopIncome, char firstLetterOfShop, boolean canWeGetAllItemsInOneShop, String shopExpenses, int noOfShopExpenses, String biscuitName,
			int biscuitPrice, String VegetableName, int vegPrice, String masalaName) {
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopPrice = shopPrice;
		this.ownerName = ownerName;
		this.shopType = shopType;
		this.shopConsist = shopConsist;
		this.shopPurpose = shopPurpose;
		this.shopDesign = shopDesign;
		this.shopProfitPercent = shopProfitPercent;
		this.shopLossPercent = shopLossPercent;
		this.shopIncome = shopIncome;
		this.firstLetterOfShop = firstLetterOfShop;
		this.canWeGetAllItemsInOneShop = canWeGetAllItemsInOneShop;
		this.shopExpenses = shopExpenses;
		this.noOfShopExpenses = noOfShopExpenses;
		this.biscuitName = biscuitName;
		this.biscuitPrice = biscuitPrice;
		this.VegetableName = VegetableName;
		this.vegPrice = vegPrice;
		this.masalaName = masalaName;
		}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopAddress() {
		return shopAddress;
	}
	
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	
	public long getShopPrice() {
		return shopPrice;
	}
	
	public void setShopPrice(long shopPrice) {
		this.shopPrice = shopPrice;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getShopType() {
		return shopType;
	}
	
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopConsist() {
		return shopConsist;
	}
	
	public void setShopConsist(String shopConsist) {
		this.shopConsist = shopConsist;
	}
	
	public String getShopPurpose() {
		return shopPurpose;
	}
	
	public void setShopPurpose(String shopPurpose) {
		this.shopPurpose = shopPurpose;
	}
	
	public String getShopDesign() {
		return shopDesign;
	}
	
	public void setShopDesign(String shopDesign) {
		this.shopDesign = shopDesign;
	}

	public float getShopProfitPercent() {
		return shopProfitPercent;
	}

	public void setShopProfitPercent(float shopProfitPercent) {
		this.shopProfitPercent = shopProfitPercent;
	}

	public double getShopLossPercent() {
		return shopLossPercent;
	}

	public void setShopLossPercent(double shopLossPercent) {
		this.shopLossPercent = shopLossPercent;
	}

	public int getShopIncome() {
		return shopIncome;
	}

	public void setShopIncome(int shopIncome) {
		this.shopIncome = shopIncome;
	}

	public char getFirstLetterOfShop() {
		return firstLetterOfShop;
	}

	public void setFirstLetterOfShop(char firstLetterOfShop) {
		this.firstLetterOfShop = firstLetterOfShop;
	}

	public boolean isCanWeGetAllItemsInOneShop() {
		return canWeGetAllItemsInOneShop;
	}

	public void setCanWeGetAllItemsInOneShop(boolean canWeGetAllItemsInOneShop) {
		this.canWeGetAllItemsInOneShop = canWeGetAllItemsInOneShop;
	}

	public String getShopExpenses() {
		return shopExpenses;
	}

	public void setShopExpenses(String shopExpenses) {
		this.shopExpenses = shopExpenses;
	}

	public int getNoOfShopExpenses() {
		return noOfShopExpenses;
	}

	public void setNoOfShopExpenses(int noOfShopExpenses) {
		this.noOfShopExpenses = noOfShopExpenses;
	}

	public String getBiscuitName() {
		return biscuitName;
	}

	public void setBiscuitName(String biscuitName) {
		this.biscuitName = biscuitName;
	}

	public int getBiscuitPrice() {
		return biscuitPrice;
	}

	public void setBiscuitPrice(int biscuitPrice) {
		this.biscuitPrice = biscuitPrice;
	}

	public String getVegetableName() {
		return VegetableName;
	}

	public void setVegetableName(String vegetableName) {
		VegetableName = vegetableName;
	}

	public int getVegPrice() {
		return vegPrice;
	}

	public void setVegPrice(int vegPrice) {
		this.vegPrice = vegPrice;
	}

	public String getMasalaName() {
		return masalaName;
	}

	public void setMasalaName(String masalaName) {
		this.masalaName = masalaName;
	}

	public int getMasalaPrice() {
		return masalaPrice;
	}

	public void setMasalaPrice(int masalaPrice) {
		this.masalaPrice = masalaPrice;
	}

	public String getCurdname() {
		return curdname;
	}

	public void setCurdname(String curdname) {
		this.curdname = curdname;
	}

	public byte getCurdPrice() {
		return curdPrice;
	}

	public void setCurdPrice(byte curdPrice) {
		this.curdPrice = curdPrice;
	}

	public String getIceCreamName() {
		return iceCreamName;
	}

	public void setIceCreamName(String iceCreamName) {
		this.iceCreamName = iceCreamName;
	}

	public byte getIceCreamPrice() {
		return iceCreamPrice;
	}

	public void setIceCreamPrice(byte iceCreamPrice) {
		this.iceCreamPrice = iceCreamPrice;
	}

	public String getMilkName() {
		return milkName;
	}

	public void setMilkName(String milkName) {
		this.milkName = milkName;
	}

	public int getMilkPrice() {
		return milkPrice;
	}

	public void setMilkPrice(int milkPrice) {
		this.milkPrice = milkPrice;
	}

	public String getWheatFloreName() {
		return wheatFloreName;
	}

	public void setWheatFloreName(String wheatFloreName) {
		this.wheatFloreName = wheatFloreName;
	}

	public int getWheatFlourPrice() {
		return wheatFlourPrice;
	}

	public void setWheatFlourPrice(int wheatFlourPrice) {
		this.wheatFlourPrice = wheatFlourPrice;
	}

	public String getChacolateName() {
		return chacolateName;
	}

	public void setChacolateName(String chacolateName) {
		this.chacolateName = chacolateName;
	}

	public int getChacolatePrice() {
		return chacolatePrice;
	}

	public void setChacolatePrice(int chacolatePrice) {
		this.chacolatePrice = chacolatePrice;
	}

	public String getShampooName() {
		return shampooName;
	}

	public void setShampooName(String shampooName) {
		this.shampooName = shampooName;
	}

	public int getShampooPrice() {
		return ShampooPrice;
	}

	public void setShampooPrice(int shampooPrice) {
		ShampooPrice = shampooPrice;
	}

	public String getCooldrinksName() {
		return cooldrinksName;
	}

	public void setCooldrinksName(String cooldrinksName) {
		this.cooldrinksName = cooldrinksName;
	}

	public int getCooldrinksPrice() {
		return cooldrinksPrice;
	}

	public void setCooldrinksPrice(int cooldrinksPrice) {
		this.cooldrinksPrice = cooldrinksPrice;
	}

	public String getOilName() {
		return oilName;
	}

	public void setOilName(String oilName) {
		this.oilName = oilName;
	}

	public int getOilPrice() {
		return oilPrice;
	}

	public void setOilPrice(int oilPrice) {
		this.oilPrice = oilPrice;
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public int getBreadprice() {
		return breadprice;
	}

	public void setBreadprice(int breadprice) {
		this.breadprice = breadprice;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public int getCakePrice() {
		return cakePrice;
	}

	public void setCakePrice(int cakePrice) {
		this.cakePrice = cakePrice;
	}

	public String getChipsName() {
		return chipsName;
	}

	public void setChipsName(String chipsName) {
		this.chipsName = chipsName;
	}

	public int getChipsPrice() {
		return chipsPrice;
	}

	public void setChipsPrice(int chipsPrice) {
		this.chipsPrice = chipsPrice;
	}

	public String getRiceName() {
		return riceName;
	}

	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}

	public int getRicePrice() {
		return ricePrice;
	}

	public void setRicePrice(int ricePrice) {
		this.ricePrice = ricePrice;
	}

	public int getSugarPrice() {
		return sugarPrice;
	}

	public void setSugarPrice(int sugarPrice) {
		this.sugarPrice = sugarPrice;
	}

	public int getMaggiMasalaPrice() {
		return maggiMasalaPrice;
	}

	public void setMaggiMasalaPrice(int maggiMasalaPrice) {
		this.maggiMasalaPrice = maggiMasalaPrice;
	}

	public int getConeIceCreamPrice() {
		return coneIceCreamPrice;
	}

	public void setConeIceCreamPrice(int coneIceCreamPrice) {
		this.coneIceCreamPrice = coneIceCreamPrice;
	}

	public String getConeIceCreamName() {
		return coneIceCreamName;
	}

	public void setConeIceCreamName(String coneIceCreamName) {
		this.coneIceCreamName = coneIceCreamName;
	}

	public String getMeatName() {
		return meatName;
	}

	public void setMeatName(String meatName) {
		this.meatName = meatName;
	}

	public int getMeatPrice() {
		return meatPrice;
	}

	public void setMeatPrice(int meatPrice) {
		this.meatPrice = meatPrice;
	}

	public String getPastaName() {
		return pastaName;
	}

	public void setPastaName(String pastaName) {
		this.pastaName = pastaName;
	}

	public int getPastaPrice() {
		return pastaPrice;
	}

	public void setPastaPrice(int pastaPrice) {
		this.pastaPrice = pastaPrice;
	}

	public String getCheeseName() {
		return cheeseName;
	}

	public void setCheeseName(String cheeseName) {
		this.cheeseName = cheeseName;
	}

	public int getCheesePrice() {
		return cheesePrice;
	}

	public void setCheesePrice(int cheesePrice) {
		this.cheesePrice = cheesePrice;
	}

	public String getSnacksname() {
		return snacksname;
	}

	public void setSnacksname(String snacksname) {
		this.snacksname = snacksname;
	}

	public int getSnacksPrice() {
		return snacksPrice;
	}

	public void setSnacksPrice(int snacksPrice) {
		this.snacksPrice = snacksPrice;
	}

	public String getCrackersName() {
		return crackersName;
	}

	public void setCrackersName(String crackersName) {
		this.crackersName = crackersName;
	}

	public int getCarckersPrice() {
		return CarckersPrice;
	}

	public void setCarckersPrice(int carckersPrice) {
		CarckersPrice = carckersPrice;
	}

	public int getEggPrice() {
		return eggPrice;
	}

	public void setEggPrice(int eggPrice) {
		this.eggPrice = eggPrice;
	}

	public String getCerealsName() {
		return cerealsName;
	}

	public void setCerealsName(String cerealsName) {
		this.cerealsName = cerealsName;
	}

	public int getCerealsPrice() {
		return cerealsPrice;
	}

	public void setCerealsPrice(int cerealsPrice) {
		this.cerealsPrice = cerealsPrice;
	}

	public String getSeaFoodName() {
		return seaFoodName;
	}

	public void setSeaFoodName(String seaFoodName) {
		this.seaFoodName = seaFoodName;
	}

	public int getSeaFoodPrice() {
		return seaFoodPrice;
	}

	public void setSeaFoodPrice(int seaFoodPrice) {
		this.seaFoodPrice = seaFoodPrice;
	}

	public String getSoapName() {
		return soapName;
	}

	public void setSoapName(String soapName) {
		this.soapName = soapName;
	}

	public int getSoapPrice() {
		return soapPrice;
	}

	public void setSoapPrice(int soapPrice) {
		this.soapPrice = soapPrice;
	}

	public String getDryFruits() {
		return dryFruits;
	}

	public void setDryFruits(String dryFruits) {
		this.dryFruits = dryFruits;
	}

	public int getDryFruitsPrice() {
		return dryFruitsPrice;
	}

	public void setDryFruitsPrice(int dryFruitsPrice) {
		this.dryFruitsPrice = dryFruitsPrice;
	}
		
}
