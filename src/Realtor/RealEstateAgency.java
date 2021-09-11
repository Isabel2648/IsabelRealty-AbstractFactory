package Realtor;

import Houses.Houses;

public abstract class RealEstateAgency {
	public Houses houseDeposit(String type) {
		Houses Houses = rentalHomes(type);
		
		Houses.garage();
		Houses.kitchen();
		Houses.office();
		Houses.yard();
				
		return Houses;
				
	}
	
	protected abstract Houses rentalHomes(String type);
	
}
