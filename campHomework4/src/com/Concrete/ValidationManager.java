package com.Concrete;

import com.Abstract.ValidationService;
import com.Entities.Player;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validate(Player player) {
		if (player.getFirstName().length() == 5 && player.getId() > 0) {
			System.out.println(player.firstName + " isiml� kullan�c� ba�ar�l� giri� yapm��t�r.");
			return true;
		} else {
			System.out.println("Giri� ba�ar�s�z!!!");
			return false;
		}

	}

}
