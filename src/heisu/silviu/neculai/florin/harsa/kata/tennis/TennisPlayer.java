package heisu.silviu.neculai.florin.harsa.kata.tennis;

import java.util.Random;

public class TennisPlayer {

	public String winPoint(TennisPlayer player1, TennisPlayer player2) {
		String[] a = new String[]{"player1", "player2"};
	    Random rand = new Random();
	    String winner = a[rand.nextInt(a.length)];
		return winner;
	}
}
