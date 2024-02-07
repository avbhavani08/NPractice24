package FebPractice;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceCount {
//Write a program to find the count of occurrence of each character in a string
	public static void main(String[] args) {
	
	        String input = "javaSelenium";
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        // Counting occurrences of each character
	        for (char c : input.toCharArray()) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }
	        
	        // Printing the count of occurrences of each character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
	        }
	}

}
