package array;

import java.util.ArrayList;
import java.util.List;

//https://workat.tech/problem-solving/practice/even-number-of-digits
public class EvenNumberOfDigits {
	List<Integer> getEvenDigitNumbers (int[] arr) {
		// add your logic here
		List<Integer> nums = new ArrayList<Integer> ();
		
		for(int i = 0;i<arr.length;i++) {
			if((Integer.toString(arr[i]).length()%2)==0) {
				nums.add(arr[i]);
			}
		}
		
		return nums;
		
	}
}
