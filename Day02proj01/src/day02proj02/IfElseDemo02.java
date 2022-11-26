package day02proj02;
import java.util.*;

public class IfElseDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks");
    int marks = sc.nextInt();
    
    if(marks<50) {
    	System.out.println("fail");
    }
    else if (marks>=50 && marks<60) {
    	System.out.println("D grade");
    }
    else if(marks >=60 && marks<70) {
    	System.out.println("c grade");
    }
    else if(marks >=70 && marks<80) {
    	System.out.println("b grade");
    }
    else if(marks >=80 && marks<90) {
    	System.out.println("a grade");
    }
    else if(marks >=90 && marks<100) {
    	System.out.println("a+ grade");
    }
    else {
    	System.out.println("Invelid !!!");
    }
    
	}

}
