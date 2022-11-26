package mypackage;
import java.util.*;
public class LinkedListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 =new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("mendu");
		l1.add("Simplilearn");
		System.out.println(l1);
		System.out.println("printingusing for loop");
		for(Object obj:l1) {
		    System.out.println(obj);
	}
		System.out.println("printing using iterator");
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}