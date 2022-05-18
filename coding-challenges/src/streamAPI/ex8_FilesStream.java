package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ex8_FilesStream {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands
		.filter(x->x.length() >13)
		.sorted()
		.forEach(System.out::println);
		bands.close();
	}

}
