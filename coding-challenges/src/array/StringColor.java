package array;

public class StringColor {

	public static void main(String[] args) {
		String color = "010101";//010101
		
        int sec =0;
        while(color.contains("01")) {
            sec++;
            for(int i = 0;i<color.length()-1;i++) {
            	System.out.println("Sub "+color.substring(i, i+2));
                if(color.substring(i, i+2).equals("01")){
                    color = color.substring(0, i)+"10"+color.substring(i+2, color.length());
                    System.out.println("Found so changing "+color);
                    i++;
                }
            }
            System.out.println("After 1 sec "+color);
        }

        System.out.println(sec);
        System.out.println(color);
	}

}
