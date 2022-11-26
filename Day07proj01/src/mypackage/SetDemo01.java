package mypackage;
import java.util.*;
public class SetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(20);
		hs.add(50);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		hs.add(20);
		System.out.println(hs.add(40));
		System.out.println(hs.add(60));
		System.out.println("HashSet:");
		System.out.println(hs);
		
		//LinkedHeshSet
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(20);
		lhs.add(50);
		lhs.add(30);
		lhs.add(40);
		lhs.add(10);
		lhs.add(20);
		System.out.println("LinkedHashSet");
		System.out.println(lhs);
		
		//treeSet
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(20);
		ts.add(50);
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(20);
		System.out.println("TreeSet");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println("after imposing a codition");
		for(int x:ts) {
			if(x>20) {
			System.out.println(x);
		}
		}
		TreeSet<Integer> rev=(TreeSet<Integer>)ts.descendingSet();
		System.out.println("Reversed TreeSet:");
		System.out.println(rev);
	}

}
