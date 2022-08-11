package streamAPI;

import java.util.Arrays;
import java.util.List;

public class ex5_Filter {

	public static void main(String[] args) {
		
		
		String[] names = {"Ajay", "Ravi", "Sushant","Sakshi","Jayesh","Karniti","Vivanta"};
		
		Arrays.stream(names).filter(x->x.startsWith("S")).sorted().findFirst().ifPresent(System.out::println);
		

	}
	
	public void filteredEmploye(List<String> list) {

		List<String> filteredByAge  = list.stream().filter(e->{e.age>20})

	}

}
