package mypackage;

public class ArrayDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks= {{50,60,56,67,75},{56,54,78,90,80},{67,66,88,99,89}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(marks[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
