package com.Concrete;

import com.Abstract.ValidationService;
import com.Entities.Player;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validate(Player player) {
		if (player.getFirstName().length() == 5 && player.getId() > 0) {
			System.out.println(player.firstName + " isimlý kullanýcý baþarýlý giriþ yapmýþtýr.");
			return true;
		} else {
			System.out.println("Giriþ baþarýsýz!!!");
			return false;
		}

	}

}
