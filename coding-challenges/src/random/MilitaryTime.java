
public class MilitaryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("07:05:45PM"));
		System.out.println(timeConversion("07:05:45AM"));
		System.out.println(timeConversion("12:05:45AM"));
		System.out.println(timeConversion("12:05:45PM"));
	}

    public static String timeConversion(String s) {
    // Write your code here
    boolean amIndicator = s.charAt(8)=='A'?true:false;
    int hours = Integer.valueOf(s.substring(0, 2));
    if(amIndicator){
        if(hours==12) {
            return "00"+s.substring(2,8);
        } else {
            return s.substring(0,8);
        }
        
    } else {
    	if(hours==12) {
    		return hours+s.substring(2,8);
    	}
        hours = hours+12;
        return hours+s.substring(2,8);
    }

    }

}
