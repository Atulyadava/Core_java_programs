package mypackage;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks=new int[5];
		marks[0]=50;
		marks[1]=80;
		marks[2]=69;
		marks[3]=88;
		marks[4]=90;
		System.out.println("Printing array using for loop:");
		for(int i=0;i<5;i++) {
			System.out.print(marks[i]+"  ");
		}
		System.out.println("\nPrinting array using foreach loop:");
		for(int m:marks) {
			System.out.print(m+"  ");
		}
	}

}
