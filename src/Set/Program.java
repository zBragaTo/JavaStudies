package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.length() >= 3);
		
		for(String p : set) {
			System.out.println(p);
		}
	}
}
