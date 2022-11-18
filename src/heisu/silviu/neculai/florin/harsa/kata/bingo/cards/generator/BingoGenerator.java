package heisu.silviu.neculai.florin.harsa.kata.bingo.cards.generator;

import java.util.Arrays;
import java.util.Random;

import heisu.silviu.neculai.florin.harsa.kata.bingo.BingoCaller;

public class BingoGenerator {
	private int[][] bingoCard = new int[5][5];
private int[]vectorOfAppearances= new int[75];
private int[]numbersSelected=new int[25];

public  int[] getNumberForBingo(int a,int b,int counter) {
	  int[] numbers=new int[75];
int internalCounter=0;
	while(true && counter!=internalCounter) {
		
		int number = new Random().nextInt(a, b);
		if(vectorOfAppearances[number]==0) {
			vectorOfAppearances[number]=1;
			
		}
		
			internalCounter++;
		
	}
	int position=0;
	for(int i=0;i<counter;i++) {
		if(vectorOfAppearances[i]==1 ) {
			numbers[position]=i;
			position++;
		}
	}
	return numbers;

	
}
	public int[][] generateBingoCard() {
		this.numbersSelected=getNumberForBingo(1,75,25);
		int index=0;
		for (int j = 0; j < 5; j++)
			
		{
			for (int i = 0; i < 5; i++) {
				index++;
				if (j == 0) {
					bingoCard[i][j] = numbersSelected[index];
				} else if (j == 1) {
					bingoCard[i][j] = numbersSelected[index];
				}
				else if (j == 2) {
					bingoCard[i][j] = numbersSelected[index];
				}
				else if (j == 3) {
					bingoCard[i][j] =  numbersSelected[index];
				}
				else if (j == 4) {
				bingoCard[i][j] =  numbersSelected[index];
				}
			}
		}
		return this.bingoCard;
	}

	
	public String getBingoCardMatrix() {
		String result="";
		 for (int i = 0; i < bingoCard.length; i++)
		 {
			 for (int j = 0; j < bingoCard[i].length; j++)
	              result+=bingoCard[i][j] + " ";
			 result+="\n";
		 }
		 return result;
	            // Loop through all elements of current row
	           
		 
		 
	}
	
	public boolean bingo(int[][]bingoCard) {
		
		 for (int i = 0; i < bingoCard.length; i++)
		 {
			 for (int j = 0; j < bingoCard[i].length; j++)
			 {
				 if(BingoCaller.getVectorOfAppearances()[bingoCard[i][j]]==0)
					 return false;
			 }
		 }
		 
		 return true;
		
	}


	public void setBingoCard(int[][] bingoCard) {
		this.bingoCard = bingoCard;
	}


	public int[][] getBingoCard() {
		return bingoCard;
	}
	
}
