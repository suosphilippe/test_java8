package test_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testFilter {

	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("a", "b", "c");
	        List<String> result = getFilterOutput(lines, "c");
	        for (String temp : result) {
	            System.out.println(temp);
	        }

	    }

	    private static List<String> getFilterOutput(List<String> lines, String filter) {
	        List<String> result = new ArrayList<>();
	        for (String line : lines) {
	            if (!"c".equals(line)) {
	                result.add(line);
	            }
	        }
	        return result;
	    }
}
