package heisu.silviu.neculai.florin.harsa.kata.bingo;

import java.util.ArrayList;
import java.util.List;

public class CheckForWinner {

		
	public boolean checkResult(List<Integer> numbers, int[][] card) {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (!(numbers.contains(card[i][j])) && card[i][j] != 0) {
					return false;
				}
			}
		}
	return true;
}
	
	public String checkForWin(List<Integer> numbers, int[][] card) {
		if (checkResult(numbers, card)) {
			return "You WON";
		}
		return "You LOST";
	}
	
}
		
