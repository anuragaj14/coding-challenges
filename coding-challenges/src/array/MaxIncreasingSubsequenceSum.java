package array;
//https://workat.tech/problem-solving/practice/maximum-sum-increasing-subsequence
public class MaxIncreasingSubsequenceSum {
	int maxSumSubsequence(int[] arr) {
	    // add you logic here
		int arrSum[] = new int[arr.length];
		int maxSum=0;
		for(int i =0;i<arr.length;i++){
			arrSum[i] = arr[i];
		}
		for(int i =0;i<arr.length;i++){
			int maxTemp = 0;
			for(int j = 0;j<i;j++) {
				if(arr[i]>arr[j]){
					  if(arrSum[j]>maxTemp){
						  maxTemp=arrSum[j];
					  }
				}
			}
			arrSum[i]+=maxTemp;
			if(arrSum[i]>maxSum){
				maxSum=arrSum[i];
			}
		}
		return maxSum;
		
	}
}
