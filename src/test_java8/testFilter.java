package test_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testFilter {

	 public static void main(String[] args) {
		 
		 List<String> lines = Arrays.asList("a", "b", "c");

		 List<String> result = lines.stream()                
	                .filter(line -> !"c".equals(line))     
	                .collect(Collectors.toList());
		 
		 for(String item : result) {
			 System.out.println(item);
		 }
		 
		 
	    }

}
