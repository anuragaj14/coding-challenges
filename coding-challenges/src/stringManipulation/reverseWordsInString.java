package stringManipulation;

public class reverseWordsInString {

	public static void main(String[] args) {
		
		System.out.println(reverseWords("yoda is a jedi"));

	}
	
	static String reverseWords(String s) {
	    String reversed = "";
	    String splits[] = s.split(" ");
	    for(int i=splits.length-1;i>=0;i--) {
	    	reversed += splits[i];
	    	if(i!=0) {
	    		reversed+= " ";
	    	}
	    	
	    }
	    
	    return reversed;
	}

}
