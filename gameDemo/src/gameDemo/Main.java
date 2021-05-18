package gameDemo;

import java.util.Date;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Elifnur");
		gamer1.setLastName("Aydin");
		gamer1.setNationalityId("12345678910");
		gamer1.setDateOfBirth(new Date(12, 10, 2000));

		Game game1 = new Game(1, "Sims 4", 4000);
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("Black Friyday (%30)");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		// campaignManager.delete(campaign1);
		// campaignManager.update(campaign1);

		GamerManager gamerManager = new GamerManager(new FirstNameLogger());
		gamerManager.gamerAdd(gamer1);
		// gamerManager.gamerDelete(gamer1);

	}
}