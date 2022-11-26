package day02proj02;
import java.util.*;
public class IfElseDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // accept age and weight from the user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age");
		int age= sc.nextInt();
		System.out.println("Enter the weight");
		int weight =sc.nextInt();		
		
		// apply condition for age and weight
		if(age >18) {
			if(weight > 50) {
				System.out.println("you are eligibal to donate blod");
			}
		}
	}

}
