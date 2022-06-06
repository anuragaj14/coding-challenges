package random;


public class Palindrom {
	
	
	public static void main(String args[]) {
		System.out.println(isPalindrome(123));
	}

    public static boolean isPalindrome(int x) {
        StringBuffer str = new StringBuffer(String.valueOf(x));
        StringBuffer rev = new StringBuffer(String.valueOf(x));
        rev.reverse();
        return str.toString().equals(rev.toString());
    }

}
