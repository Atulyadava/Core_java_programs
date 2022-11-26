package pack;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add("harry");
		a1.add("monday");
		System.out.println(a1);
		a1.add(2,"hyy");
		System.out.println(a1);
		a1.set(2,"Hello");
		System.out.println(a1);
		a1.remove("Hello");
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		String s = (String)a1.get(2);
		System.out.println(s);
		System.out.println("size: "+a1.size());
		a1.remove(1);
		System.out.println(a1);

	}

}
