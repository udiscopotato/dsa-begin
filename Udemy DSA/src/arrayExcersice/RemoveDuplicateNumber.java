package arrayExcersice;
import java.util.Arrays;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		int [] arr = { 1,2,2,3,5,3,7,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(removed(arr)));
	}
	static int[] removed(int [] arr) {
		int n = arr.length;
		if(n ==0 || n==1) {
			return new int [] {n};
		}
		int count =0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1])
				count++;
		}
		int j =0;
		int [ ] temp = new int [arr.length-count];
		
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1])
				temp[j++]=arr[i];
		}
		if(arr[arr.length-2] != arr[arr.length-1])
			temp[temp.length-1]=arr[arr.length-1];
		return temp;
	}
}
