package com.xworkz.country;

import com.xworkz.country.constants.GetNames;
import com.xworkz.country.constants.StatesName;
import com.xworkz.country.countryinfo.CountryData;

public class CountryRunner {

	public static void main(String[] args) {
		
		CountryData country = new CountryData();
		
		country.setCountryName("INDIA");
		System.out.println(country.getCountryName());
		
		country.setNoOfStates(28);
		System.out.println(country.getNoOfStates());
		
		country.setCountryType("Democratic Republic");
		System.out.println(country.getCountryType());
		
		country.setCountryCode("+91");
		System.out.println(country.getCountryCode());
		
		country.setCapitalCity("Delhi");
		System.out.println(country.getCapitalCity());
		
		country.setPresident("Droupadi Murmu");
		System.out.println(country.getPresident());
		
		country.setPrimeMinister("Narendra Modi");
		System.out.println(country.getPrimeMinister());
		
		country.setCountryPopulation(140760000000l);
		System.out.println(country.getCountryPopulation());
		
		country.setAreaRankOfCountry((byte) 7);
		System.out.println(country.getAreaRankOfCountry());
		
		country.setSpokenLanguagesInCountry((short) 398);
		System.out.println(country.getSpokenLanguagesInCountry());
		
		country.setPrideOfIndia("Goldenrain Tree");
		System.out.println(country.getPrideOfIndia());
		
		country.setFatherOfIndianConstitution("Dr.B.R.Ambedkar");
		System.out.println(country.getFatherOfIndianConstitution());
		
		country.setNoOneCelebrityInIndia("Ranveer Singh");
		System.out.println(country.getNoOneCelebrityInIndia());
		
		country.setIndiaReferredAs("Subcontinent of Southern Asia");
		System.out.println(country.getIndiaReferredAs());
		
		country.setIndiaADemocraticCountry(true);
		System.out.println(country.isIndiaADemocraticCountry());
		
		country.setMotherOfIndia("Bharat Mata");
		System.out.println(country.getMotherOfIndia());
		
		country.setFatherOfModernIndia("Ram Mohan Ray");
		System.out.println(country.getFatherOfModernIndia());
		
		country.setNoOneHero("NTR Jr.");
		System.out.println(country.getNoOneHero());
		
		country.setHomeminister("Amit Shah");
		System.out.println(country.getHomeminister());
		
		country.setFosestminister("Shri Bhupendra Yadav");
		System.out.println(country.getFosestminister());
		
		country.setIndexRankOfCountry("40th");
		System.out.println(country.getIndexRankOfCountry());
		
		country.setFirstEmpireOfCountry("Mauryan Empire");
		System.out.println(country.getFirstEmpireOfCountry());
		
		country.setNationalFruit("Mango");
		System.out.println(country.getNationalFruit());
		
		country.setNationalFlower("Lotus");
		System.out.println(country.getNationalFlower());
		
		country.setNationalAnimal("Tiger");
		System.out.println(country.getNationalAnimal());
		
		country.setNationalAnthem("Jan Gana Mana");
		System.out.println(country.getNationalAnthem());
		
		country.setNationalTree("Banyan Tree");
		System.out.println(country.getNationalTree());
		
		country.setLiteracyRateOfCountryForMen(84.40f);
		System.out.println(country.getLiteracyRateOfCountryForMen());
		
		country.setLiteracyRateOfCountryForFemale(77.00d);
		System.out.println(country.getLiteracyRateOfCountryForFemale());
		
		country.setGdPRanking(5);
		System.out.println(country.getGdPRanking());
		
		country.setHighestLiteracyrateOfStateInCountry("Kerala");
		System.out.println(country.getHighestLiteracyrateOfStateInCountry());
		
		country.setLowestLiteracyrateOfStateInCountry("Bihar");
		System.out.println(country.getLowestLiteracyrateOfStateInCountry());
		
		country.setNationalSong("Vande Matharam");
		System.out.println(country.getNationalSong());
		
		country.setNationalHeritageAnimal("Elephant");
		System.out.println(country.getNationalHeritageAnimal());
		
		country.setNationalAquaticAnimal("Susu");
		System.out.println(country.getNationalAquaticAnimal());
		
		country.setNationalFestival("Indepedence Day");
		System.out.println(country.getNationalFestival());
		
		country.setNationalEmblem("Lion Capital of Ashoka");
		System.out.println(country.getNationalEmblem());
		
		country.setNationalOfficialLanguage("Hindi");
		System.out.println(country.getNationalOfficialLanguage());
		
		country.setNationalCalendar("Saka Calendar");
		System.out.println(country.getNationalCalendar());
		
		country.setNationalBird("Peacock");
		System.out.println(country.getNationalBird());
		
		country.setNationalPledge("Oath Of Allegiance");
		System.out.println(country.getNationalPledge());
		
		country.setNationalRiver("Ganga");
		System.out.println(country.getNationalRiver());
		
		country.setColorsOfNationalFlag("DeepSaffron, White and DeepGreen");
		System.out.println(country.getColorsOfNationalFlag());
		
		country.setNationalFlag("Tricolour");
		System.out.println(country.getNationalFlag());
		
		country.setNationalReptile("King Cobra");
		System.out.println(country.getNationalReptile());
		
		country.setNationalVegetable("Pumpkin");
		System.out.println(country.getNationalVegetable());
		
		country.setNationalMotto("Satyameva Jayate");
		System.out.println(country.getNationalMotto());
		
		country.setNoOfUnionTerritories((byte) 8);
		System.out.println(country.getNoOfUnionTerritories());
		
		country.setDefenceMinister("Rajnath Singh");
		System.out.println(country.getDefenceMinister());
		
		country.setFinanceMinister("Nirmala Sitharaman");
		System.out.println(country.getFinanceMinister());
		
		country.setNameOfTheStates(StatesName.Karnataka);
		System.out.println(country.getNameOfTheStates());

		country.setNameOfUnionTerritories(GetNames.DELHI);
		System.out.println(GetNames.DELHI.name);
		System.out.println(country.getNameOfUnionTerritories());
	}

}
