package heisu.silviu.neculai.florin.harsa.kata.berlin.clock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BerlinClockMain {

	public static void main(String[] args) {
		BerlinClockKata berlinClockKata= new BerlinClockKata(23,59,57);
		System.out.println(berlinClockKata.getBerlinClock());
		System.out.println(berlinClockKata.convertBackToDigitalTime("ORRRRRRROYYRYYRYYRYYYYYY"));
	}

}
