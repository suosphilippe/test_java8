package test_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testfForEach {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("A", "B", "C", "D", "E");

		for(String item : items){
			System.out.println(item);
		}

	}

}
