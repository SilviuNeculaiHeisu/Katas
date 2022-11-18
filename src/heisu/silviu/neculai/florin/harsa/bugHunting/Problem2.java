package heisu.silviu.neculai.florin.harsa.bugHunting;

import java.util.Arrays;
import java.util.List;

public class Problem2 {
	
@Override
public double computeMean(){
	return points.size()==1?points.get(1): points
            .stream()
            .mapToDouble(a -> a)
            .average().isPresent()?points
                    .stream()
                    .mapToDouble(a -> a).average().getAsDouble():0;
}
}
