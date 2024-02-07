package FebPractice;

public class StringCompressWithcountOfRepeatedChar {
	
	public static String compressString(String input) {
		StringBuilder compressedString = new StringBuilder();
		int countConsecutive = 0;

		for (int i = 0; i < input.length(); i++) {
			countConsecutive++;

			// If the next character is different or we reach the end of the input string
			if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
				compressedString.append(input.charAt(i));
				compressedString.append(countConsecutive);
				countConsecutive = 0;
			}
		}

		return compressedString.length() < input.length() ? compressedString.toString() : input;
	}

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		String compressedString = compressString(input);
		System.out.println("Compressed String: " + compressedString);
	}

}

