package heisu.silviu.neculai.florin.harsa.bugHunting;

public class Problem1 {
private boolean checkDimensions(CLIQUEUnit other, int e) {
	for(int i=0,j=0;i<e;i++,j+=2) {
		if(dims[i]!=other.dims[i] || bounds[j]!=other.bounds[j] || bounds[j+1]!=other.bounds[j+1]) {
			return false;
			
		}
	}
	return true;
}
}
