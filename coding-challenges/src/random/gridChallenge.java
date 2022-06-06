package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gridChallenge {

	public static void main(String[] args) {
		
		
		System.out.println(gridChallenge(new ArrayList<String> (Arrays.asList("ppp","ypp","wyw"))));

	}

	//ppp
	//ppy
	//wwy
	//rtv
    public static String gridChallenge(List<String> grid) {
    // Write your code here
        
    
        for(int i = 0;i<grid.size();i++) {
            char temp[] = grid.get(i).toCharArray();
            Arrays.sort(temp);
            grid.set(i, new String(temp));
        }
        int size = grid.get(0).length();
        int arr[] = new int[size];
        for(int j =0;j<size;j++) { //j= size of each string
            for(int i = 0;i<grid.size();i++) { //i= number of string
            	System.out.println(i);
                if(i == 0) {
                	System.out.println("i is 0");
                    arr[j]=(byte)grid.get(i).charAt(j);
                } else {
                    if(arr[j]<=(byte)grid.get(i).charAt(j)) {
                        arr[j]=(byte)grid.get(i).charAt(j);
                    }
                    else {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}
