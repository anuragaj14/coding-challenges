package stringManipulation;

//https://workat.tech/problem-solving/practice/longest-palindrome
public class longestPallindrome {

	public static void main(String[] args) {
		
		System.out.println(getLongestPalindrome("mississippi"));
		System.out.println(getLongestPalindrome("a"));
		System.out.println(getLongestPalindrome("abcdc"));

	}
	
	static String getLongestPalindrome(String s) {
	    String longest = String.valueOf(s.charAt(0));
	    for(int i = 0;i<s.length();i++) {
	    	for(int j = s.length();j>i;j--) {
		    	String temp = s.substring(i,j);
		    	if(temp.length()>longest.length()) {
			    	if(getPallindrome(temp)) {
			    		longest = temp;
		    	}

		    	
	    	}
	    	}


	    }
	    return longest;
	}
	
	static boolean getPallindrome(String str) {
		StringBuilder sbr = new StringBuilder(str);
		if(sbr.reverse().toString().equals(str)) {
			return true;
		}
		return false;
	}

}
