package heisu.silviu.neculai.florin.harsa.kata.bingo;

import java.util.Random;

public class BingoCaller {
private static int[] vectorOfAppearances= new int[75];
private int[] numbers=new int[75];
public  int[] getNumberForBingo(int a,int b,int counter) {
	  
int internalCounter=0;
	while(true && counter!=internalCounter) {
		
		int number = new Random().nextInt(a, b);
		if(vectorOfAppearances[number]==0) {
			vectorOfAppearances[number]=1;
			
		}
		
			internalCounter++;
		
	}
	int position=0;
	for(int i=0;i<counter;i++) {
		if(vectorOfAppearances[i]==1 ) {
			numbers[position]=i;
			position++;
		}
	}
	return numbers;

	
}
public  String getNumbersArray() {
	String result="";
	for(int i=0;i<numbers.length;i++)
	{
		result+=numbers[i];
		result+=" ";
	}

	return result;
}
public static int[] getVectorOfAppearances() {
	return vectorOfAppearances;
}
public static void setVectorOfAppearances(int[] vectorOfAppearances) {
	BingoCaller.vectorOfAppearances = vectorOfAppearances;
}

}
