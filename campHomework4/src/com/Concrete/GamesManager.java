package com.Concrete;

import com.Abstract.GamesService;
import com.Entities.Games;

public class GamesManager implements GamesService {

	@Override
	public void add(Games games) {
		System.out.println(games.gameName + ": Ýsimli oyun eklendi");
		
	}

	@Override
	public void delete(Games games) {
		System.out.println(games.gameName + ": Ýsimli oyun silindi");
		
	}

	@Override
	public void update(Games games) {
		System.out.println(games.gameName + ": Ýsimli oyun güncellendi");
		
	}

}
