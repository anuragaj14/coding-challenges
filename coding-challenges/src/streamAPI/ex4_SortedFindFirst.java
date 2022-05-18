package streamAPI;

import java.util.stream.Stream;

public class ex4_SortedFindFirst {

	public static void main(String[] args) {
		
		 Stream.of("Ava","Angel", "Heaven") .sorted() .findFirst().ifPresent(System.out::println);
		 

		Stream.of("Ava", "Angel", "Heaven").sorted().forEach(System.out::println);

	}

}
