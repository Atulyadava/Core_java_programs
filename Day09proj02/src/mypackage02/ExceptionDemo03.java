package mypackage02;
import java.util.*;
public class ExceptionDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			int b=sc.nextInt();
			int result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.err.println("Devide By zero is not Allowed");
		}
		catch(Exception e) {
			System.out.println("please Enter a Integer Value");
		}
		finally {
			System.out.println("Hay ,I am finally block");
		}

	}

}
