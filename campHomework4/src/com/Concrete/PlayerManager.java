package com.Concrete;

import com.Abstract.PlayerService;
import com.Entities.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.firstName + ": Ýsimli oyuncu eklendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.firstName + ": Ýsimli oyuncu silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.firstName + ": Ýsimli oyuncu güncellendi.");
		
	}
	
}
