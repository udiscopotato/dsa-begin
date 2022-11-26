package arrayExcersice;
import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int [] arr1 = {3,5,7};
		int [] arr2 = {1,5,9};
		System.out.println(Arrays.toString(merge(arr1,arr2)));
	}
	static int[] merge(int [] arr1, int[ ] arr2) {
		int a = arr1.length;
		int b = arr2.length;
		
		int[] temp = new int[a+b];
//		int index =0;
		for(int i = 0;i<arr1.length; i++) {			
				temp[i]=arr1[i];	
			}
		for(int j =0; j<arr2.length ; j++) {
			temp[j+a]=arr2[j];
		}
		Arrays.sort(temp);
		return temp;
	}
}
