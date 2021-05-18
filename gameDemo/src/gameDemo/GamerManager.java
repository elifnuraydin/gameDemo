package gameDemo;

public class GamerManager implements IGamerService {

	@Override
	public void gamerAdd(Gamer gamer) {
		System.out.println("New gamer added : " + gamer.getFirstName() + " " + gamer.getLastName());

	}

	@Override
	public void gamerDelete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "deleted gamer");

	}

	public GamerManager(Logger logger) {
		logger.log();
	}
}
