package mypackage;
import java.util.*;
public class DowhileDemo02 {

	public static void main(String[] args) {
		 String name="";
		 do {
		 System.out.println("Enter Name:");
		 Scanner sc=new Scanner(System.in);
		 name=sc.next();
		 System.out.println(name);
		 }while(!name.equals("Jay"));
		 System.out.println("Thanks for confirmation!!!");
	}

}
