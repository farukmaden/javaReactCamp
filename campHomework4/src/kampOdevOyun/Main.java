package kampOdevOyun;

import com.Concrete.CampaignManager;
import com.Concrete.GamesManager;
import com.Concrete.PlayerManager;
import com.Concrete.SaleManager;
import com.Concrete.ValidationManager;
import com.Entities.Campaign;
import com.Entities.Games;
import com.Entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1, "Faruk", "Maden", "faruk@gmail.com", "1234");
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(player);
		playerManager.delete(player);
		playerManager.update(player);

		System.out.println("-----------");
		
		ValidationManager validationManager = new ValidationManager();
		validationManager.validate(player);
		
		System.out.println("------------");
		
		Games games = new Games(1, "Call Of Duty", 100);
		GamesManager gamesManager = new GamesManager();
		gamesManager.add(games);
		gamesManager.delete(games);
		gamesManager.update(games);

		System.out.println("-----------");

		Campaign campaign = new Campaign(1, "yılbaşı indirimi", 50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);

		System.out.println("-----------");

		SaleManager saleManager = new SaleManager();
		saleManager.sale(games, player);
		saleManager.discountSale(games, player, campaign);

	}

}
