package heisu.silviu.neculai.florin.harsa.kata.connect.fours.main;

import heisu.silviu.neculai.florin.harsa.kata.connect.fours.ConnectFours;

public class ConnectFoursMain {

	public static void main(String[] args) {
		ConnectFours connectFourMain = new ConnectFours();
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 1);
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 1);
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 2);
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 2);
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 2);
		System.out.println(connectFourMain.getMatrix());
		connectFourMain.placeToken(1, 2);
		System.out.println(connectFourMain.getMatrix());


	}

}
