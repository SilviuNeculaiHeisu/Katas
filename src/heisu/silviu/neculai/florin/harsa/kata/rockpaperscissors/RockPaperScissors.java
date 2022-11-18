package heisu.silviu.neculai.florin.harsa.kata.rockpaperscissors;

import java.util.HashMap;

public class RockPaperScissors {
	private HashMap<String[], String>playerMoves= new HashMap<>();
	
public RockPaperScissors() {
		super();
	this.playerMoves.put(new String[] {"Rock","Paper"},"Paper wins!");
	this.playerMoves.put(new String[] {"Rock","Scissors"},"Rock wins!");
	this.playerMoves.put(new String[] {"Rock","Rock"},"Draw!");
	this.playerMoves.put(new String[] {"Paper","Paper"},"Draw!");
	this.playerMoves.put(new String[] {"Scissors","Scissors"},"Draw!");
	this.playerMoves.put(new String[] {"Paper","Scissors"},"Scissors wins!");
	}

public String playGame(String player1,String player2) {
	for(String[] key:this.playerMoves.keySet()) {
		if(key[0]==player1 && key[1]==player2 || key[0]==player2 && key[1]==player1) {
			return this.playerMoves.get(key);
		}
	}
	return "Invalid parameters!";
	
}
}
