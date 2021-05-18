package gameDemo;

public class CampaignManager implements ICamapaignSerivce {

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + ": is deleted");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " : is updated");

	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " :added");

	}

}
