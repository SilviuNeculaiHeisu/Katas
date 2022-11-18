package heisu.silviu.neculai.florin.harsa.kata.bingo.cards.generator;

public class BingoCardGenerator {

	private int[][] bingoCard = new int[5][5];

	public int[][] generateBingoCard() {
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (j == 0) {
					int min = 1;
					int max = 15;
					int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					while (checkNumber(number)) {
						number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					} 
						bingoCard[i][j] = number;
					
					} else if (j == 1) {
					int min = 16;
					int max = 30;
					int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					while (checkNumber(number)) {
						number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					} 
						bingoCard[i][j] = number;
					}

				else if (j == 2) {
					int min = 31;
					int max = 45;
					int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					while (checkNumber(number)) {
						number = (int) Math.floor(Math.random() * (max - min + 1) + min);
					} 
						bingoCard[i][j] = number;
					
				}else if(j==3) {
		int min = 46;
		int max = 60;
		int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
		while (checkNumber(number)) {
			number = (int) Math.floor(Math.random() * (max - min + 1) + min);
		} 
			bingoCard[i][j] = number;
		
	}else if(j==4){
	int min = 61;
	int max = 75;
	int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
	while (checkNumber(number)) {
		number = (int) Math.floor(Math.random() * (max - min + 1) + min);
	} 
		bingoCard[i][j] = number;
	}
			}
		}
		bingoCard[2][2] = 0;
		return bingoCard;
	}
	
	
	public boolean checkNumber(int number) {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (number == bingoCard[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String getBingoCardMatrix(int[][] bingoCard) {
        String result="";
         for (int i = 0; i < bingoCard.length; i++)
         {
             for (int j = 0; j < bingoCard[i].length; j++)
                  result+=bingoCard[i][j] + " ";
             result+="\n";
         }
         return result;
    }
}
