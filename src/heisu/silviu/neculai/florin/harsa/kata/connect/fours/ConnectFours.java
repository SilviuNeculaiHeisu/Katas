package heisu.silviu.neculai.florin.harsa.kata.connect.fours;

import java.util.Arrays;
import java.util.List;

public class ConnectFours {
	private int[][] boardGame = new int[6][7];

	public ConnectFours() {
		super();

		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				this.boardGame[i][j] = 0;
	}

	public void checkIfAnybodyWon(int row, int column, int token, int counter, int player) {
		
		if (checkBounds(row + 1, column)) {
			if(this.boardGame[row+1][column]==token) {
				checkIfAnybodyWon(row+1, column, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
			
				
			}

		}
		if (checkBounds(row - 1, column)) {
			if(this.boardGame[row-1][column]==token) {
				checkIfAnybodyWon(row-1, column, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
			
			}

		}
		if (checkBounds(row, column-1)) {
			if(this.boardGame[row][column-1]==token) {
				checkIfAnybodyWon(row, column-1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
			
			}

		}
		if (checkBounds(row, column + 1)) {
			if(this.boardGame[row][column+1]==token) {
				checkIfAnybodyWon(row, column+1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
				System.exit(1);
			}

		}

		if (checkBounds(row + 1, column + 1)) {
			if(this.boardGame[row+1][column+1]==token) {
				checkIfAnybodyWon(row+1, column+1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
				System.exit(1);
			}

		}

		if (checkBounds(row - 1, column - 1)) {
			if(this.boardGame[row-1][column-1]==token) {
				checkIfAnybodyWon(row+1, column+1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
		
			}

		}
		if (checkBounds(row + 1, column - 1)) {
			if(this.boardGame[row+1][column-1]==token) {
				checkIfAnybodyWon(row+1, column+1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
		
			}
			

		}

		if (checkBounds(row - 1, column + 1)) {
			if(this.boardGame[row-1][column+1]==token) {
				checkIfAnybodyWon(row-1, column+1, token,counter+1, player);
			}
			if(counter==3) {
				System.out.println("Player "+ player +" Won");
	
			}

		}
		System.out.println(token);

	}

	private boolean checkBounds(int row, int col) {
		if (row < 0) {
			return false;
		} else if (col < 0) {
			return false;
		} else if (row >= boardGame.length) {
			return false;
		} else if (col >= boardGame[row].length) {
			return false;
		}

		return true;
	}

	public String getMatrix() {
		String result = "";
		for (int i = 0; i < boardGame.length; i++) {
			for (int j = 0; j < boardGame[i].length; j++)
				result += boardGame[i][j] + " ";
			result += "\n";
		}
		return result;

	}

	public void placeToken(int column, int token) {
		for (int i = 5; i >= 0; i--) {
			if (this.boardGame[i][column] == 0) {
				int counter = 1;
				this.boardGame[i][column] = token;
				int player=token;
				checkIfAnybodyWon(i, column, token,counter, player);
				break;
			}
		}
	}

}
