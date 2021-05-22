package com.Concrete;

import com.Abstract.PlayerService;
import com.Entities.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.firstName + ": �simli oyuncu eklendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.firstName + ": �simli oyuncu silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.firstName + ": �simli oyuncu g�ncellendi.");
		
	}
	
}
