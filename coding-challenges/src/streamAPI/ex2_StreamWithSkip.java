package streamAPI;

import java.util.Arrays;

public class ex2_StreamWithSkip {

	public static void main(String[] args) {
		 
		int arr[] = {61,12,43,24,65,26,17,8,19,1};
		
		/*
		 * Arrays.stream(arr) .skip(5) .forEach(System.out::println);
		 */
		
		Arrays.stream(arr).sorted().forEach(System.out::println);
	}

}
