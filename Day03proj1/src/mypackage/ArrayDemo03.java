package mypackage;
import java.util.*;
public class ArrayDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ask how many subjects
		System.out.println("How many subjects?");
		int n=sc.nextInt();
		
		//create marks array with size n
		int[] marks=new int[n];
		
		//store elements into array
		for(int i=0;i<n;i++) {
			System.out.println("Enter Marks:(max 100)");
			marks[i]=sc.nextInt();
		}
		
		//find total marks
		int total=0;
		for(int i=0;i<n;i++) {
			total+=marks[i];//total=total+marks[i]
		}
		
		//display total marks
		System.out.println("TOtal Marks:"+total);
		
		//find percentage
		float percentage=(float)total/n;
		System.out.println("Percentage:"+percentage);
	}
	}


