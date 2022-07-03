package random;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		Integer arr[] = {3,6,7,11,34,45,47,51,77,99};

		List<Integer> list = Arrays.asList(arr);
		int index = binarySearch(list,77);
		if(index!=-1) {
			System.out.println("Element found at index "+index);
		} else {
			System.out.println("Element Not found ");
		}
	}

	public static int binarySearch(List<Integer> list, int k) {
		int lower = 0;
		int upper = list.size();
		return binarySearchCalculate(list,lower,upper,k);
		
	}
	
	
	public static int binarySearchCalculate(List<Integer> list, int lower, int upper, int k) {
		if(lower == upper) {
			return -1;
		}
		int mid = (int) Math.ceil((lower +upper)/2);
		System.out.println(mid + " "+list.get(mid));
		if(list.get(mid)==k) {
			return mid;
		} else {
			if(list.get(mid)>k) {
				upper = mid;
				return binarySearchCalculate(list,lower,upper,k);
			} else {
				lower = mid;
				return binarySearchCalculate(list,lower,upper,k);
			}
		}

	}
}
