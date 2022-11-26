package arrayExcersice;
import java.util.Arrays;

public class BestScores {
	public static void main(String[] args) {
		int [] arr = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		System.out.println(firstSecond(arr));
	}
	static String firstSecond(int[] arr) {
	    Arrays.sort(arr);
		return arr[arr.length-1]+" "+arr[arr.length-2];
	  }
	
	               // OR
	
//	static String 
}
