package com.Concrete;

import com.Abstract.CampaignService;
import com.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println( " %"+ campaign.campaignRate+" " + campaign.campaignName + ": Siteme eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(" %"+ campaign.campaignRate+" " + campaign.campaignName + ": Sitemden silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(" %"+ campaign.campaignRate+" " + campaign.campaignName + ": Sitemde güncellendi");
		
	}
	
}
