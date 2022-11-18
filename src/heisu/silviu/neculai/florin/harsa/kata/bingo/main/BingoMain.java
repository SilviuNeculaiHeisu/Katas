package heisu.silviu.neculai.florin.harsa.kata.bingo.main;

import heisu.silviu.neculai.florin.harsa.kata.bingo.BingoCaller;
import heisu.silviu.neculai.florin.harsa.kata.bingo.cards.generator.BingoGenerator;

public class BingoMain {

	public static void main(String[] args) {
		
BingoCaller bingoCaller = new BingoCaller();
 int[] numbers=bingoCaller.getNumberForBingo(1, 75, 40);

		
		System.out.println(bingoCaller.getNumbersArray());
		BingoGenerator bingoGenerator = new BingoGenerator();
		bingoGenerator.generateBingoCard();
		System.out.println(bingoGenerator.getBingoCardMatrix());
		System.out.println(bingoGenerator.bingo(bingoGenerator.getBingoCard()));

	
	}

}
