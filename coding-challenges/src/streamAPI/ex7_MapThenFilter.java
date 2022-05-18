package streamAPI;

import java.util.Arrays;
import java.util.List;

public class ex7_MapThenFilter {

	public static void main(String[] args) {
		 List<String> people = Arrays.asList("Ajay", "Anurag","Ravi", "Sushant","Sakshi","Jayesh","Karniti","Vivanta");
		 
		 people
		 .stream()
		 .map(str->str.toLowerCase())
		 .filter(x-> x.startsWith("a"))
		 .forEach(System.out::println);
		
		

	}

}
