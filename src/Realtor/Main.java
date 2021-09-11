package Realtor;

import Houses.Houses;
import Realtor.RealEstateAgency;
import Realtor.IsabelRealty;

public class Main {
	public static void main(String[] args) {
		RealEstateAgency isabelRealty = new IsabelRealty();
		Houses duplexHouse = isabelRealty.houseDeposit("Duplex");
		
	}

}
