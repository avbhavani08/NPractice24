package FebPractice;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceCount {
//Write a program to find the count of occurrence of each word in a string.
	public static void main(String[] args) {
		String input = "Hello java hello coding";
		Map<String, Integer> wordCountMap = new HashMap<>();

		String[] words = input.split("\\s+");

		// Counting occurrences of each word
		for (String word : words) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		// Printing the count of occurrences of each word
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println("Word '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
		}
	}


}


