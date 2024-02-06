package FebPractice;

public class FindDuplicatesInArray {

	public static void main(String[] args) {


		//1Find duplicate elements from an array and print.
		char[] arr = {'a','b','c','a','d','f','c','b'};

		for(int i =0 ; i<arr.length; i++) {
			for(int j=i+1 ;j<arr.length ;j++ ) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);

				}
			}
		}
	}

}
