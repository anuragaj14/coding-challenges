package streamAPI;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class exa13_reduce {
	public static void main(String[] args) throws IOException {
		
		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0, (Double a, Double b) ->a*b);
		System.out.println(total);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		double a[] = {7.3,1.5, 4.8};
		System.out.println(Arrays.stream(a).sum());
		
	}

}
