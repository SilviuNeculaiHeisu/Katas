package heisu.silviu.neculai.florin.harsa.kata.arabic.to.roman;

import java.util.HashMap;

public class RomanToArabicNumberConverter {
	public HashMap<Character, Integer> hash = new HashMap<>();

	public RomanToArabicNumberConverter() {
	hash.put('I', 1);
	hash.put('V', 5);
	hash.put('X', 10);
	hash.put('L', 50);
	hash.put('C', 100);
	hash.put('D', 500);
	hash.put('M', 1000);
	

	}

	public int convertToArabic(String romanNumber) {
		int number=0;
		for(int i=0;i<romanNumber.length();i++) {
			if(i+1<romanNumber.length()) {
				if(hash.get(romanNumber.charAt(i))>=hash.get(romanNumber.charAt(i+1))){
					number+=hash.get(romanNumber.charAt(i));
				}
				else
					number-=hash.get(romanNumber.charAt(i));
			}
			else
				number+=hash.get(romanNumber.charAt(i));
		}
			return number;
		}
}
