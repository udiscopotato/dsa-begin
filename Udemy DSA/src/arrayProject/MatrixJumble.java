package arrayProject;

// Leetcode Java Problem #48 (Medium)

public class MatrixJumble {
	public static void main(String[] args) {
		int [][]arr = { {1,2,3} , {4,5,6} , {7,8,9} };
		for(int i =0;i<arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		rotating(arr, isMatrix(arr));
		for(int i =0;i<arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static boolean isMatrix(int [][] matrix) {
		if(matrix.length==0 || matrix.length != matrix[0].length) {
			return false;
		}
		return true;
	}
	static void rotating(int [][] matrix, boolean a) {
		if(a==false) {
			System.out.println("Sorry we can't rotate the matrix");
		}
		int N = matrix.length;
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<(N/2); j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][N-1-j];
				matrix[i][N-1-j]=temp;
			}
		}
	}
}
