package arrayExcersice;

public class FindingDuplicateNumber {
	public static void main(String[] args) {
		int [] arr= {1, 1, 2, 2, 3, 4, 5};
		System.out.println(removeDuplicates(arr));
	}
	public static String removeDuplicates(int[] arr) {
	    String str="";
		for(int i =0; i<arr.length-1; i++) {
	    	if(arr[i]==arr[i+1]) {
	    		str= str+arr[i]+" ";
	    	}
	    }
		return str;
	  }
}
