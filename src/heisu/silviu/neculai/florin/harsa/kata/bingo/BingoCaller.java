package heisu.silviu.neculai.florin.harsa.kata.bingo;

import java.util.ArrayList;
import java.util.List;

public class BingoCaller {

	public List<Integer> generateNumbers(int a) {
		List<Integer> numbers = new ArrayList();
		for (int i = 0; i < a; ++i) {
			int min = 1;
			int max = 75;
			int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
			while (numbers.contains(number)) {
				number = (int) Math.floor(Math.random() * (max - min + 1) + min);
			} 
				numbers.add(number);
			}
		return numbers;
	}
}
