package FebPractice;

import java.util.Scanner;

public class stringPalindrome {

	public static void main(String[] args) {
		//3.Write a program to find if a string is Palindrome or not.


		// Objects of String class  
		String original, reverse = ""; 
		Scanner in = new Scanner(System.in);   
		System.out.println("Enter a string/num to check if it is a palindrome");  
		original = in.next();   
		int length = original.length();   
		for ( int i = length - 1; i >= 0; i-- )  
			reverse = reverse + original.charAt(i);  
		if (original.equals(reverse))  
			System.out.println("Entered String is a palindrome ");  
		else  
			System.out.println("Entered String isn't a palindrome");   
	}  




}


