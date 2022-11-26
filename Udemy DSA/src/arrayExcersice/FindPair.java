package arrayExcersice;

public class FindPair {
	public static void main(String[] args) {
		int [] arr= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		System.out.println(pairSum(arr,7));
	}
	public static String pairSum(int[] myArray, int sum) {
		String str="";
        for(int i =0; i<myArray.length; i++) {
        	for( int j = i; j<myArray.length; j++) {
        		if(myArray[i]+myArray[j]==sum) {
        			str=str+myArray[i]+":"+myArray[j]+" ";
        		}
        	}
        }
        return str;
  }
}
