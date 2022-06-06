package random;


public class SearchInsertPosition {
	
	public static void main(String args[]) {
		
		System.out.println(searchInsert(new int[] {1,3,5,6},7));
		System.out.println(searchInsert(new int[] {1,3,5,6},2));
	}
	
	
    public static  int searchInsert(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length-1;
        int mid = ((max+min)/2);
        System.out.println(mid);
        while(min!=max && min <max) {
            if(nums[mid]== target) {
                return mid;
            } 
            else if(target >nums[mid]) {
                min = mid;
            }
            else if (target<nums[mid]) {
                max = mid;
                    
            }
            mid = (min+max/2);
        }
        
        return mid;
       }

}
