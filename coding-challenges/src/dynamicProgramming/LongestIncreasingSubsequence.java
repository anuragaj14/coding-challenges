//https://workat.tech/problem-solving/practice/longest-increasing-subsequence/editorial
package dynamicProgramming;

class LongestIncreasingSubsequence {
	int getLengthOfLIS(int[] A) {
    	// add your logic here
		int [] max = new int[A.length];
		for(int i = 0 ; i<max.length; i++) {
			max[i]=1;
		}
		for(int i= 0;i<A.length;i++){
			for(int j=0;j<i;j++){
				if(A[i]>A[j] && max[j]>=max[i]) {
					max[i]=1+max[j];
				}
			}
		}
		int lis =0;
		for(int i = 0 ; i<max.length; i++) {
			if(max[i]>lis){
				lis = max[i];
			}
		}
		return lis;
	}
}
