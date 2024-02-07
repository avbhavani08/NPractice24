package FebPractice;

public class HighestMultiplication {

	public static void main(String[] args) {
	// Write a program to find the highest multiplication value among each combination of two values in an array of 5 numbers.
		
	        int[] array = {5, 3, 9, 2, 7};
	        
	        int highestMultiplication = Integer.MIN_VALUE;
	        
	        // Finding the highest multiplication value
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                int multiplication = array[i] * array[j];
	                highestMultiplication = Math.max(highestMultiplication, multiplication);
	            }
	        }
	        
	        System.out.println("Highest multiplication value: " + highestMultiplication);
	    }

	}


