package heisu.silviu.neculai.florin.harsa.kata.tamagotchi.main;

import heisu.silviu.neculai.florin.harsa.kata.tamagotchi.Tamagotchi;

public class TamagotchiMain implements Runnable{

	public static void main(String[] args) throws InterruptedException {
	TamagotchiMain main = new TamagotchiMain();
	Thread thread=new Thread(main);
	thread.start();
	Thread.sleep(5000);
	Tamagotchi.feed();
	Thread.sleep(15000);
	Tamagotchi.poop();
	Tamagotchi.getInBed();
		

	}

	@Override
	public void run() {
		Tamagotchi.startTamagotchi();
		
	}

}
