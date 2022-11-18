package heisu.silviu.neculai.florin.harsa.kata.bingo.main;

import java.util.List;
import java.util.stream.Collectors;

import heisu.silviu.neculai.florin.harsa.kata.bingo.BingoCaller;
import heisu.silviu.neculai.florin.harsa.kata.bingo.CheckForWinner;
import heisu.silviu.neculai.florin.harsa.kata.bingo.cards.generator.BingoCardGenerator;

public class BingoMain {

	public static void main(String[] args) {
		
		BingoCaller bingoCaller = new BingoCaller();
		List<Integer> result = bingoCaller.generateNumbers(70);
		result = result.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		System.out.println(result.size());
		
		BingoCardGenerator bingoCard = new BingoCardGenerator();
		int[][] bingoCard1 = new int[5][5];
		bingoCard1 = bingoCard.generateBingoCard();
		System.out.println(bingoCard.getBingoCardMatrix(bingoCard1));
		
		CheckForWinner winner = new CheckForWinner();
		System.out.println(winner.checkForWin(result, bingoCard1));
	
	}

}
