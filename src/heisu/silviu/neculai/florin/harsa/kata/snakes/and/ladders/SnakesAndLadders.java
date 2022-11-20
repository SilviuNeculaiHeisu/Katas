package heisu.silviu.neculai.florin.harsa.kata.snakes.and.ladders;

import java.util.ArrayList;
import java.util.HashMap;

public class SnakesAndLadders {
	private static ArrayList<BoardSquare> board = new ArrayList<>();
	private static HashMap<String, Integer> playerPositions = new HashMap<>();

	public static void SnakesAndLadders() {
		for (int i = 0; i < 100; i++)
			board.add(new BoardSquare(i));

	}

	public static void placeSnake(int position) {
		board.get(position).setPowerUp("Snake");
	}

	public static void placeLadder(int position) {
		board.get(position).setPowerUp("Ladder");
	}

	public static String getBoard() {
		return board.toString();
	}

	private static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	private static boolean checkIfSnake(int currentPosition, int diceValue, int playerNumber) {
		if (board.get(currentPosition + diceValue).getPowerUp() == "Snake") {
			for (int i = currentPosition + diceValue-1; i >= 0; i--) {
				if (board.get(i).getPowerUp() == "Snake") {
					playerPositions.put("Player " + playerNumber, i);
					board.get(i).setPlayerStanding("Player " + playerNumber);
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkIfLadder(int currentPosition, int diceValue, int playerNumber) {
		if (board.get(currentPosition + diceValue).getPowerUp() == "Ladder") {
			for (int i = currentPosition + diceValue+1; i < 100; i++) {
				if (board.get(i).getPowerUp() == "Ladder") {
					playerPositions.put("Player " + playerNumber, i);
					board.get(i).setPlayerStanding("Player " + playerNumber);
					return true;
				}
			}
		}
		return false;
	}

	private static void initiateMovement(int diceValue, int playerNumber, int currentPosition) {
		if(checkIfSnake(currentPosition, diceValue, playerNumber)==false && checkIfLadder(currentPosition, diceValue, playerNumber)==false)
		
		{
			if (currentPosition + diceValue >= 100) {
				System.out.println("Player " + playerNumber + " won!");
				System.exit(1);
				SnakesAndLadders();
			} else {
				playerPositions.put("Player " + playerNumber, currentPosition + diceValue);
				board.get(currentPosition + diceValue).setPlayerStanding("Player " + playerNumber);
			}
		}
	}

	public static void rollDice(int playerNumber) {
		int diceValue = getRandomNumber(1, 6);
		int currentPosition = playerPositions.get("Player " + playerNumber);
		board.get(currentPosition).setPlayerStanding("");
		initiateMovement(diceValue, playerNumber, currentPosition);

	}

	public static void addPlayer(int playerNumber) {
		board.get(0).setPlayerStanding("Player " + playerNumber);
		playerPositions.put("Player " + playerNumber, 0);
	}

	public static String getPlayerPositions() {
		return playerPositions.toString();
	}

	public static void setPlayerPositions(HashMap<String, Integer> playerPositions) {
		SnakesAndLadders.playerPositions = playerPositions;
	}
}
