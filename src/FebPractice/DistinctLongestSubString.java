package FebPractice;

import java.util.HashMap;
import java.util.Map;

public class DistinctLongestSubString {
//Write a program to find the longest substring from a given string that doesn’t contain any duplicate characters.
	public static String longestSubstringWithoutDuplicates(String s) {
        if (s == null || s.length() == 0)
            return "";
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0, end = 0, maxLength = 0;
        int longestStart = 0;
        
        while (end < s.length()) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestStart = start;
            }
            end++;
        }
        
        return s.substring(longestStart, longestStart + maxLength);
    }
    
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring without duplicate characters: " + longestSubstringWithoutDuplicates(input));
    }
}
