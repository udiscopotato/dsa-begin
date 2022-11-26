package arrayExcersice;
import java.util.Arrays;

public class Middle_Function {
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,6};
		System.out.println(Arrays.toString(middle(arr)));
		System.out.println(Arrays.toString(NewMiddle(arr)));
//		Arrays.toString(middle(arr));
	}
	static int[] middle(int[] arr) {
        int a =arr.length;
        int [] yolo = new int [a-2];
        for(int i =0; i<yolo.length;i++) {
        	yolo[i]=arr[i+1];
        }
        return yolo;
    }
	
	         // OR
	static int[] NewMiddle(int [] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length-1);
	}
}
