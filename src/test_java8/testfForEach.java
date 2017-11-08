package test_java8;

import java.util.ArrayList;
import java.util.List;

public class testfForEach {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			System.out.println(item);
		}

	}

}
