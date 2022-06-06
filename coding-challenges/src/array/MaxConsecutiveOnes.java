package array;
//https://workat.tech/problem-solving/practice/max-consecutive-ones
public class MaxConsecutiveOnes {
	int getMaxConsecutiveOnes(int[] A) {
		int maxCon = 0;
		int currentStreak =0;
		for(Integer i : A) {
			if(i==1){
				currentStreak+=1;
				if(currentStreak>maxCon)
					maxCon=currentStreak;
				
			} else {
				currentStreak=0;
			}

		}
		return maxCon;
	}
}
