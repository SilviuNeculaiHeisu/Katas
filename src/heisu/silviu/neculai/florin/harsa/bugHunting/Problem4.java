package heisu.silviu.neculai.florin.harsa.bugHunting;

public class Problem4 {
	
public String getStrippedSubString() {
	int sstart= start, ssend=end;
	String c="";
	while(sstart<ssend) {
	c+= input.charAt(sstart);
	
		if(c.charAt(sstart)==' ' || c.charAt(sstart)=='\n' || c.charAt(sstart)=='\r' || c.charAt(sstart)=='\t') {
			break;
		}
		++sstart;
	}
	return c;
	
}
}
