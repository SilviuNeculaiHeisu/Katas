package heisu.silviu.neculai.florin.harsa.kata.tennis;

public class TennisScoreBoard {

	public String player1Score = "0";
	public String player2Score = "0";
	public boolean gameOver = false;

	public void addPoint(TennisPlayer player1, TennisPlayer player2) {

		if (player1.winPoint(player1, player2) == "player1" && gameOver == false) {
			System.out.println("player1 scored");
			if (player1Score == "0") {
				player1Score = "15";
			} else if (player1Score == "15") {
				player1Score = "30";
			} else if (player1Score == "30") {
				player1Score = "40";
			} else if (player1Score == "40") {
				if (player2Score != "40" && player2Score != "A") {
					System.out.println("Player1 WON");
					gameOver = true;
				} else if (player2Score == "40") {
					player1Score = "A";
				} else if (player2Score == "A") {
					player2Score = "40";
				}
			} else if (player1Score == "A") {
				System.out.println("Player1 WON");
				gameOver = true;
			}
		} else if (gameOver == false) {
			System.out.println("player2 scored");
			if (player2Score == "0") {
				player2Score = "15";
			} else if (player2Score == "15") {
				player2Score = "30";
			} else if (player2Score == "30") {
				player2Score = "40";
			} else if (player2Score == "40") {
				if (player1Score != "40" && player1Score != "A") {
					System.out.println("Player2 WON");
					gameOver = true;
				} else if (player1Score == "40") {
					player2Score = "A";
				} else if (player1Score == "A") {
					player1Score = "40";
				}
			} else if (player2Score == "A") {
				System.out.println("Player2 WON");
				gameOver = true;
			}
		}

		if (gameOver == false) {
			System.out.println(ShwoScore());
		}
	}

	public String ShwoScore() {
		return "Player1 " + player1Score + " : " + player2Score + " Player2";
	}

}
