package arrayExcersice;

public class TwoDArrayDiagonalSum {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sumDiagonal(arr));
	}
	static int sumDiagonal(int[][] a) {
		int N = a.length;
		int sum=0;
		for(int i=0; i<N; i++) {
			sum=sum+a[i][i];
		}
		return sum;
	}
}
