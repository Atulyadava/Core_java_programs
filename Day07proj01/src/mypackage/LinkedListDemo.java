package mypackage;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("String");
		l1.add("barghese");
		System.out.println(l1);
		
		l1.addFirst('s');
		System.out.println(l1);
		
		l1.add(2,"developer");
		System.out.println(l1);
		
		l1.remove((Object)10);
		//li.remove(10);
		System.out.println(l1);
		

	}

}
