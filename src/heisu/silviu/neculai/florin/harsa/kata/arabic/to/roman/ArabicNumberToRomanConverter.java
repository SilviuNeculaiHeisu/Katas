package heisu.silviu.neculai.florin.harsa.kata.arabic.to.roman;

import java.util.HashMap;

public class ArabicNumberToRomanConverter {
	int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
	String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	


public String convertToRoman(int number) {
StringBuilder builder = new StringBuilder();
for(int i=0;i<values.length;i++) {
	while(number>=values[i]) {
		number-=values[i];
		builder.append(romanLetters[i]);
		
	}
}
	return builder.toString();
}
}
