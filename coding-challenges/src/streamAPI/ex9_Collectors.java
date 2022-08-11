package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ex9_Collectors {
	public static void main(String[] args) throws IOException {
	
		List<String> list = Files.lines(Paths.get("bands.txt"))
				.map(x->x.toLowerCase())
				.filter(x->x.contains("jit"))
				.collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);

	}
}