package arrayProject;

public class MissingNumber {
	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6,8,9};
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				return;
			}
		}
		
		// or 
		
		System.out.println(missing(arr));
	}
	static int missing(int[]arr) {
		int sum= 0;
		for(int i =0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		int total = (arr[arr.length-1])*((arr[arr.length-1])+1)/2;
		return total-sum;
	}
}
