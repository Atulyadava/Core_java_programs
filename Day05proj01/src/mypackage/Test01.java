package mypackage;
import java.util.*;
class Person{
	//instance variables
	private String name;
	private int age;
	
	//accept the name and age
	public void accept() {
		//to accept data from the keyboard
		Scanner sc=new Scanner(System.in);
		
		//accept name and age
		System.out.println("Enter Name:");
		name=sc.nextLine();
		
		/*We are accepting
		 * the age in the
		 * below code*/
		System.out.println("Enter age:");
		age=sc.nextInt();
	}
	//to check the age and display he is young, middle aged or old
	public void check() {
		if(age<=30) {
			System.out.println(name+" is young");
		}
		else if(age<=50) {
			System.out.println(name+" is middle aged");
		}
		else {
			System.out.println(name+" is old");
		}
	}
	
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a person class object
				Person p=new Person();
				
				//accept person data
				p.accept();
				
				//check the age
				p.check();
	}

}
