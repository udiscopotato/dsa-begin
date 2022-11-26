package arrayProject;
import java.util.Scanner;

public class AverageTempererature {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many day's temperature you want:");
		int a = in.nextInt();
		
		int[] arr= new int[a];
		
		int add= 0;
		for(int i =0; i<a;i++) {
			System.out.println("Enter Day"+(i+1)+"temperature:");
			arr[i]=in.nextInt();
			add=add+arr[i];
		}
		System.out.println("Average Temperature is:");
		System.out.println(add/a);
		
		System.out.println("Total number of days above average :");
		int count=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>(add/a)) {
				count=count+1;
			}
		}
		System.out.println(count);
		in.close();
	}

}
