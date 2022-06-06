package array;
//https://workat.tech/problem-solving/practice/merge-two-sorted-arrays/editorial
public class MergeTwoSortedArray {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		
		// two pointers A and B 
		// loop till we get pointer to length of A and B
		// If any is reached add other elements of remaining
		
		int pointerA = 0;
		int pointerB = 0;
		int sortedArr[] = new int[A.length+B.length];
		int sortedArrPointer =0;
		while(pointerA<A.length || pointerB<B.length) {
			if(pointerB==B.length){
				sortedArr[sortedArrPointer++] = A[pointerA++];
				continue;
			}
			if(pointerA==A.length){
				sortedArr[sortedArrPointer++] = B[pointerB++];
				continue;
			}
	
				sortedArr[sortedArrPointer++] = (A[pointerA]>B[pointerB]) ? B[pointerB++] : A[pointerA++];
		
		}
		return sortedArr;
	}
}
