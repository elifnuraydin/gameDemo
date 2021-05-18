package gameDemo;

public class GameManager implements IGameService {

	@Override
	public void gameAdd(Game game) {
		System.out.println(game.getGameName() + "new game added.");

	}

	@Override
	public void gameDelete(Game game) {
		System.out.println(game.getGameName() + "deleted");

	}

	@Override
	public void gameUpdate(Game game) {
		System.out.println(game.getGameName() + "game updated");

	}

}
