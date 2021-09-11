package Realtor;

import Houses.Houses;
import Houses.ChicagoBungalow;
import Houses.LisleDuplex;

public class IsabelRealty extends RealEstateAgency {

	@Override
	protected Houses rentalHomes(String type) {
		if (type.equals("Bungalow")) {
			return new ChicagoBungalow();
			
		} else if (type.equals("Duplex")) {
			return new LisleDuplex();
			
		} else {
			return null;
		}
	}
}
