package gameDemo;

public class Game {
	private int game›d;
	private String gameName;
	private double unitPrice;

	public Game() {

	}

	public Game(int game›d, String gameName, double unitPrice) {
		super();
		this.game›d = game›d;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getGame›d() {
		return game›d;
	}

	public void setGame›d(int game›d) {
		this.game›d = game›d;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
