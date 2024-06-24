package TipoCuringa;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> MyInts = Arrays.asList(5, 2, 10);
		printList(MyInts);
		
		List<String> MyStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(MyStrs);
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
