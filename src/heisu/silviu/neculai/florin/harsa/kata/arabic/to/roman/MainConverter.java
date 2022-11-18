package heisu.silviu.neculai.florin.harsa.kata.arabic.to.roman;

public class MainConverter {

	public static void main(String[] args) {
ArabicNumberToRomanConverter arabicNumberToRomanConverter= new ArabicNumberToRomanConverter();
System.out.println(arabicNumberToRomanConverter.convertToRoman(1989));
RomanToArabicNumberConverter arabicNumberConverter= new RomanToArabicNumberConverter();
System.out.println(arabicNumberConverter.convertToArabic("MCMLXXXIX"));
	}

}
