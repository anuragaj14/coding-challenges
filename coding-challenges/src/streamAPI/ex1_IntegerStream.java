package streamAPI;

import java.util.stream.IntStream;

public class ex1_IntegerStream {

	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		System.out.println();

	}

}
