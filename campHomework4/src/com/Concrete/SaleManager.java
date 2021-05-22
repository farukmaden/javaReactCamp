package com.Concrete;

import com.Abstract.SaleService;
import com.Entities.Campaign;
import com.Entities.Games;
import com.Entities.Player;

public class SaleManager implements SaleService {
	PlayerManager playerManager ;
	GamesManager gamesManager;
	@Override
	public void sale(Games games, Player player) {
		System.out.println(player.firstName + " kullanýcýsý " +games.gameName + " oyununu " + games.price + " birime satýn aldý");
		
	}
	@Override
	public void discountSale(Games games, Player player, Campaign campaign) {
		System.out.println(player.firstName + " kullanýcýsý " +games.gameName + " oyununu  %" + campaign.campaignRate +" indirim ile " + games.price*(campaign.campaignRate/100) + " birime satýn adlý");
		
	}
}
