package arrayExcersice;

public class MissingNumber {
	public static void main(String[] args) {
		int [ ]arr = {1,2,3,4,6};
		System.out.println(missingNumber(arr,6));
		System.out.println(missingNum(arr,6));
	}
	static int missingNumber(int[] arr, int totalCount) {
	    for(int i =0; i<totalCount ; i++) {
	    	if (arr[i]!= i+1){
	    		return i+1;
	    	}
	    }
	    return -1;
	  }
	
	    // OR
	
	static int missingNum(int []arr, int a) {
		int actual ;
		int got=0;
		
		actual = (a*(a+1))/2;
		
		for(int i =0; i<arr.length; i++) {
			got = got + arr[i];
		}
		return actual - got;
	}
}
