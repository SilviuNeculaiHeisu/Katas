package heisu.silviu.neculai.florin.harsa.kata.snakes.and.ladders;

public class SnakesAndLaddersMain {

	public static void main(String[] args) {
	SnakesAndLadders.SnakesAndLadders();
	SnakesAndLadders.addPlayer(1);
	SnakesAndLadders.addPlayer(2);
	SnakesAndLadders.placeSnake(2);
	SnakesAndLadders.placeSnake(12);
	SnakesAndLadders.placeLadder(15);
	SnakesAndLadders.placeLadder(30);
		SnakesAndLadders.rollDice(1);
		SnakesAndLadders.rollDice(2);


	System.out.println(SnakesAndLadders.getPlayerPositions());
	SnakesAndLadders.rollDice(1);
	SnakesAndLadders.rollDice(2);
	System.out.println(SnakesAndLadders.getPlayerPositions());
	SnakesAndLadders.rollDice(1);
	SnakesAndLadders.rollDice(2);
	System.out.println(SnakesAndLadders.getPlayerPositions());
	SnakesAndLadders.rollDice(1);
	SnakesAndLadders.rollDice(2);
	System.out.println(SnakesAndLadders.getPlayerPositions());
	SnakesAndLadders.rollDice(1);
	SnakesAndLadders.rollDice(2);
	System.out.println(SnakesAndLadders.getPlayerPositions());
	
	}

}
