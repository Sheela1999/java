package com.xworkz.accessspecifier;

public class Forest {
	
	public static String forestName;
	private static int noOfForest = 24;
	static String forestType = "Dry Deciduous Forest";
	protected static short bioDiversity = 2300;
	
    public byte speciesOfAnimals;
    private boolean isBannerghattaNationalParkHavingGoodEnvironmentAndVeterinaryCare = true;
    float forestArea = 22.61f;
    protected long FloweringSpeciesPlants = 3500;
    
    //for static variables
    public static void getForestName(String forestName) {
    	System.out.println(forestName);
    	System.out.println("method is getting forest name");
    	
    	//calling private method
    	purposeOfForest();
    }
    
    private static void purposeOfForest() {
    	System.out.println("purpose is to secure the animals and plants");
    }
    
    static void vegetation() {
    	System.out.println("It is having dry deciduous forest area with Scrub and patches of moist");
    }
    
    protected static void getSomeFressAir() {
    	System.out.println("we will get some fress air by forest plants");
    }
    
    public static void forest() {
    	System.out.println(noOfForest);
    }
    
    //for non static variables
    public void animals(byte speciesOfAnimals) {
    	System.out.println(speciesOfAnimals);
    	System.out.println("method is to having 102 species of animals");
    	
    	//calling private method
    	goodEnvironment();
    }
    
    private void goodEnvironment() {
    	System.out.println("purpose is to having good environment to animals");
    }
    
    void veterinaryCare() {
    	System.out.println("care for animals");
    }
    
    protected void getRawMaterials() {
    	System.out.println("Getting many Raw Materials");
    }
    
    public void nationalPark() {
    	System.out.println(isBannerghattaNationalParkHavingGoodEnvironmentAndVeterinaryCare);
    }
}
