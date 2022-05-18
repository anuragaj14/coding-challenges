package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exa12_csv_Filter_toMap {
	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
			Map<String,Integer> map = new HashMap<> ();
			map = rows
				.map(x->x.split(","))
				.filter(x->x.length ==3)
				.filter(x->Integer.parseInt(x[1])>15)
				.collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[1])));
				
		
		rows.close();
		
		for(String key : map.keySet()) {
			System.out.println(key + " "+ map.get(key));
		}

	}
}
