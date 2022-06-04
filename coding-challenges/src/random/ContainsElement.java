
public class ContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(containsElement(new int[] {1, 2, 3, 3, 3, 4, 4, 5}, 2));
//		System.out.println(containsElement(new int[] {1, 2, 3, 3, 3, 4,  5}, 6));
//		System.out.println(containsElement(new int[] {1, 2, 3, 3, 3, 4, 4, 5}, 2));
		System.out.println(containsElement(new int[] {1, 2,3}, 7));

	}
	static boolean containsElement (int[] arr, int key) {
		// add your logic here
		
		int mid = (arr.length/2)-1;
		int min = 0;
		int max = arr.length-1;
		
		while(min<max) {
			if(arr[mid] == key) {
				return true;
			}
			else {
				if(key>arr[mid]) {
					min = mid +1 ;
				} else {
					max = mid -1;
				}
				mid = ((min+max)/2)+1;
			}
		} 
		return false;
	}
}
