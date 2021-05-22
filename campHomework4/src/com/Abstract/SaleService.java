package com.Abstract;

import com.Entities.Campaign;
import com.Entities.Games;
import com.Entities.Player;

public interface SaleService {
	void sale (Games games , Player player);
	
	void discountSale (Games games , Player player , Campaign campaign);
}
