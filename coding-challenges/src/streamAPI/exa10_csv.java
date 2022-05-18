package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class exa10_csv {

	public static void main(String[] args) throws IOException {
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		
		int rowCount = (int)rows
				.map(x->x.split(","))
				.filter(x->x.length ==3)
				.count();
		
		System.out.println(rowCount);                                                                                                                                                                                                    
		rows.close();
		
	}

}
