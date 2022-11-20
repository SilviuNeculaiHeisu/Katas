package heisu.silviu.neculai.florin.harsa.kata.fizzbuzz;

public class FizzBuzzMaine {

	public static void main(String[] args) {
		FizzBuzz buzz=new FizzBuzz();
		buzz.addFilter(2, "fuzz ");
		buzz.addFilter(3, "bizz ");
		System.out.println(buzz.getResult(12));

	}

}
