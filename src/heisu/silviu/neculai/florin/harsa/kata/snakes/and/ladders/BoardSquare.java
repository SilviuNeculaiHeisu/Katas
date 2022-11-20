package heisu.silviu.neculai.florin.harsa.kata.snakes.and.ladders;

public class BoardSquare {
	private int number;
private String powerUp;
private String playerStanding;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getPowerUp() {
	return powerUp;
}

public BoardSquare(int number) {
	super();
	this.number = number;
}
public void setPowerUp(String powerUp) {
	this.powerUp = powerUp;
}
public String getPlayerStanding() {
	return playerStanding;
}
public void setPlayerStanding(String playerStanding) {
	this.playerStanding = playerStanding;
}
@Override
public String toString() {
	return "BoardSquare [number=" + number + ", powerUp=" + powerUp + ", playerStanding=" + playerStanding + "]";
}

}
