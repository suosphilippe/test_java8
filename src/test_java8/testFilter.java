package test_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testFilter {

	 public static void main(String[] args) {
		 
		 List<String> lines = Arrays.asList("a", "b", "c");

		 List<String> result = lines.stream()         // conversion de list en stream        
	                .filter(line -> !"c".equals(line))     // exclusion de c
	                .collect(Collectors.toList()); // recuperer le resultat et le convertir en list
		 
		 result.forEach(System.out::println); // afficher le resultat
		 
		 
		 
		 
	    }

}
