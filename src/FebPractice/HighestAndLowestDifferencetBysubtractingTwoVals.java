package FebPractice;

public class HighestAndLowestDifferencetBysubtractingTwoVals {

	public static void main(String[] args) {

		int[] arr = {1,3,5,8};



		int highestDifference = Integer.MIN_VALUE;
		int lowestDifference = Integer.MAX_VALUE;

		for(int i=0 ; i<arr.length; i++) {
			for(int j =i+1 ; j<arr.length ; j++) {
     ////below variables store the Max and min values after subtraction
				int diference = arr[j]-arr[i];
				highestDifference = Math.max(highestDifference, diference);
				lowestDifference = Math.min(lowestDifference, diference);

			}

		}
		System.out.println("highestDifference :"+ highestDifference);
		System.out.println("lowestDifference :"+ lowestDifference);
	}

}