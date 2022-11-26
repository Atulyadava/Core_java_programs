package day02proj02;
import java.util.*;

public class IfElseDemo {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a=sc.nextInt();
	System.out.println("Enter the value of b :");
	int b=sc.nextInt();
	if(a>b) {
		System.out.println(a +"is greater then " + b);
	}
	else {
		System.out.println(a+" is less then "+ b);
	}
	}

}
