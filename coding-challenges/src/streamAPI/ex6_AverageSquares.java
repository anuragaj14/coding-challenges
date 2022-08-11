package streamAPI;

import java.util.Arrays;

public class ex6_AverageSquares {

	public static void main(String[] args) {
		Arrays.stream(new int[] {2,4,6,8,10})
		.average()
		.ifPresent(System.out::println);

		
		
	}

}
