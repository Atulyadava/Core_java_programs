package mypackage;
import java.util.*;
public class GenericArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		//a1.add(20);---> error becouse of String data type
		al.add("java");
		al.add("Python");
		al.add("Angular");
		System.out.println(al);
		for(String s:al) {
			System.out.println(s);
		}

	}

}
