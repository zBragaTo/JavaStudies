package GetPut;

import java.util.ArrayList;
import java.util.List;

public class program {
	public static void main(String[] args) {
		
		/*List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		list.add(20);
		*/
		
		List<Object> MyObjs = new ArrayList<Object>();
		MyObjs.add("maria");
		MyObjs.add("alex");
		
		List<? super Number> myNums = MyObjs;
		
		myNums.add(10);
		myNums.add(3.14);

		Number x = myNums.get(0);
				
		
	}

}
