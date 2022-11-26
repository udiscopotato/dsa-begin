package arrayProject;

import java.util.Arrays;

//How to find maximum product of two integers in the array where all elements are positive.
//int[] intArray = {10,20,30,40,50};
//maxProduct(intArray) // (40,50)

public class MaximumProduct {
	public static void main(String[] args) {
		int[] intArray = {10,20,30,40,50};
//		int[] result= max(intArray);
		System.out.println(Arrays.toString(max(intArray)));
	}
	static int[] max(int []arr) {
		int max= 1;
		int [] ar= {-1,-1};
		for(int i=0;i<arr.length; i++) {
			for(int j =i+1; j< arr.length; j++) {
				if(arr[i]*arr[j]>max) {
					max=arr[i]*arr[j];
					ar[0]=i;
					ar[1]=j;
				}
			}
		}
		return new int[] {arr[ar[0]],arr[ar[1]]};
	}
}
