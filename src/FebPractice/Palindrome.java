package FebPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Objects of String class  
		String original, reverse = ""; 
		Scanner in = new Scanner(System.in);   
		System.out.println("Enter a string/num to check if it is a palindrome");  
		original = in.nextLine();   
		int length = original.length();   
		for ( int i = length - 1; i >= 0; i-- )  
			reverse = reverse + original.charAt(i);  
		if (original.equals(reverse))  
			System.out.println("Entered number is a palindrome number.");  
		else  
			System.out.println("Entered number isn't a palindrome number.");   
	}  


}


