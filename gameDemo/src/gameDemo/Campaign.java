package gameDemo;

public class Campaign {
	private String campaignName;
	private String campaignId;
	private double campaignUnitPrice;
	private String campaignDetails;
	private double discount;

	public Campaign() {

	}

	public Campaign(String campaignName, String campaignId, double campaignUnitPrice, String campaignDetails,
			double discount) {
		super();
		this.campaignName = campaignName;
		this.campaignId = campaignId;
		this.campaignUnitPrice = campaignUnitPrice;
		this.campaignDetails = campaignDetails;
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public double getCampaignUnitPrice() {
		return campaignUnitPrice;
	}

	public void setCampaignUnitPrice(double campaignUnitPrice) {
		this.campaignUnitPrice = campaignUnitPrice;
	}

	public String getCampaignDetails() {
		return campaignDetails;
	}

	public void setCampaignDetails(String campaignDetails) {
		this.campaignDetails = campaignDetails;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
