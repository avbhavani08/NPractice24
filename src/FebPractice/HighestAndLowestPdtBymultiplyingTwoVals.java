package FebPractice;

public class HighestAndLowestPdtBymultiplyingTwoVals {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int highestProduct = Integer.MIN_VALUE;
		int lowestProduct= Integer.MAX_VALUE;

		for(int i=0 ; i<arr.length; i++) {

			for(int j=i+1 ; j<arr.length; j++) {
				int product = arr[i]*arr[j];

				highestProduct = Math.max(highestProduct, product);
				lowestProduct= Math.min(lowestProduct, product);

			}

		}
		System.out.println("High product of two vals: "+highestProduct);
		System.out.println("Lowest product of two vals: "+lowestProduct);
	}

}
