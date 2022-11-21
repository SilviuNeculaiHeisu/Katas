package heisu.silviu.neculai.florin.harsa.kata.tamagotchi;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Tamagotchi {
	private static HashMap<String, Integer> attributes = new HashMap<>();
	private static Timer timer;
	private static TimerTask tamagotchi;

	public static void startTamagotchi() {
		attributes.put("fullness", 50);
		attributes.put("happiness", 50);
		attributes.put("hungriness", 50);
		attributes.put("tiredness", 50);
		startLifeCycle();

	}

	public static void displayStats() {
		for (String key : attributes.keySet()) {
			System.out.println(key + " " + attributes.get(key));
		}
	}

	private static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	private static void changeValue(String attribute, int value) {
		int initialValue = attributes.get(attribute);
		if (initialValue - value <= 0 && attribute == "happiness" ) {
			timer.cancel();
			tamagotchi.cancel();
			System.out.println("Tamagotchi died! :( ");
		} else if (initialValue + value >100 && (attribute == "fullness" || attribute == "tiredness" || attribute=="hungriness")) {
			System.out.println("Tamagotchi died! :(");
			
			timer.cancel();
			tamagotchi.cancel();
		} else
			attributes.put(attribute, initialValue + value);
		displayStats();
	}

	private static void changeTamagotchiState() {

		changeValue("happiness", -1);
		changeValue("hungriness", 1);
		changeValue("tiredness", 1);

	}

	public static void poop() {
		int valueToBeDecreasedWith = -50;
		changeValue("fullness", valueToBeDecreasedWith);
	}

	public static void play() {
		int valueToBeIncreasedWith = 25;
		changeValue("happiness", valueToBeIncreasedWith);
	}

	public static void getInBed() {
		int valueToBeDecreasedWith = -50;
		changeValue("tiredness", valueToBeDecreasedWith);
	}

	public static void feed() {
		int valueToBeDecreasedWith = -50;
		changeValue("hungriness", valueToBeDecreasedWith);
		changeValue("fullness", -valueToBeDecreasedWith);
	}

	private static void startLifeCycle() {

		timer = new Timer();
		tamagotchi = new TimerTask() {
			@Override
			public void run() {
				changeTamagotchiState();
				displayStats();
			};
		};
		timer.schedule(tamagotchi, 5000, 5000);

	}

}
