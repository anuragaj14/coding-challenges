
public class RomantoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XXXVIII"));

	}
	static int romanToInt(String s) {
	    // add your logic here
		int num = 0;
		for(int i = 0;i<s.length();i++) {
			switch(s.charAt(i)) {
				case 'I' :{
					num+=1;
					break;					
				} 
				case 'V' : {
					num+=5;
					break;
				}
				case 'X' : {
					num+=10;
					break;
				}
				case 'L' : {
					num+=50;
					break;
				}
				case 'C' : {
					num+=100;
					break;
				}
				case 'D' : {
					num+=500;
					break;
				}
				case 'M' : {
					num+=1000;
					break;
				}
			}
		}
		
		return num;
	}
}
