package arrayProject;

import java.util.Arrays;

//Given 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1]


public class PairSum {
	public static void main(String[] args) {
		int []nums= {2,7,11,15};
		int tar= 9;
		try {
		int []result = pair(nums,tar);
		System.out.println(Arrays.toString(result));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	static int[] pair(int []arr, int target) throws Exception {
		for(int i=0; i<arr.length; i++) {
			for(int j =1+i; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i+1,j+1};
				}
			}
		}
		throw new Exception ("Sollution not found");
	}
}
