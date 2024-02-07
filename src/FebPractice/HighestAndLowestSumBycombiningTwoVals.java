package FebPractice;

public class HighestAndLowestSumBycombiningTwoVals {
	
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        
	        int highestSum = Integer.MIN_VALUE;
	        int lowestSum = Integer.MAX_VALUE;
	        
	        // Finding the highest and lowest sums
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                int sum = array[i] + array[j];
	                highestSum = Math.max(highestSum, sum);
	                lowestSum = Math.min(lowestSum, sum);
	            }
	        }
	        
	        System.out.println("Highest Sum: " + highestSum);
	        System.out.println("Lowest Sum: " + lowestSum);
	    }

}
