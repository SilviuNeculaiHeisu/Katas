package heisu.silviu.neculai.florin.harsa.kata.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {
	private HashMap<Integer,String> map = new HashMap<>();
	
public FizzBuzz() {
		super();
		this.map.put(3, "fizz ");
		this.map.put(5, "buzz ");
		this.map.put(7, "pop ");
	}

public String getResult(int number) {
	String result ="";
	for(Integer i:map.keySet()) {
		if(number%i==0) {
			result+=map.get(i);
		}
	}
	if(result!="") {
		return result;
	}
	return String.valueOf(number);
	
	
}
public void addFilter(Integer key,String text) {
	this.map.put(key, text);
}

}
