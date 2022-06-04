
public class CaeserCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(caesarCipher("www.abc.cy", 87));
		System.out.println((byte)'z');
		
	}
	
    public static String caesarCipher(String s, int k) {
    // Write your code here
    
    String output = "";
	    for(int i = 0; i<s.length();i++) {
	        char c = s.charAt(i);
	        if((byte)c >=65 && (byte)c <=90) {
	        	int t1 = k%26;
	            if((byte)c+t1 >90) {
	                output += String.valueOf((char) ((byte)c+t1 -90 + 64));
	            } else {
	                output += String.valueOf((char) ((byte)c+t1));
	            }
	        } else if((byte)c >=97 && (byte)c <=122) {
	        	int t2 = k%26;
		            if((byte)c+t2 >122) {
		                output += String.valueOf((char) ((byte)c+t2 -122 + 96));
		            } else {
		                output += String.valueOf((char) ((byte)c+t2));
		            }
		        } else {
		        	output +=String.valueOf(c);
		        }

	    }
	    return output;
    }

}
