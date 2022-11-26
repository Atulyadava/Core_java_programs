package mypackage;
import java.util.*;
public class MapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		HashMap<String,Integer> hm= new HashMap<String,Integer>(); 
		hm.put("monitor", 5000);
		hm.put("keyboard", 500);
		hm.put("mouse", 1500);
		hm.put("ups", 300);
		hm.put("speakers", 1000);
		System.out.println("HashMap:");
		System.out.println(hm);
		
		//LinkedHashMap
		LinkedHashMap<String,Integer> lhm= new LinkedHashMap<String,Integer>();
		lhm.put("monitor", 5000);
		lhm.put("keyboard", 500);
		lhm.put("mouse", 1500);
		lhm.put("ups", 300);
		lhm.put("speakers", 1000);
		System.out.println("LinkedHashMap:");
		System.out.println(lhm);

		//TreeHashMap
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("monitor", 5000);
		tm.put("keyboard", 500);
		tm.put("mouse", 1500);
		tm.put("ups", 300);
		tm.put("speakers", 1000);
		System.out.println("TreeMap:");
		System.out.println(tm);
		System.out.println(tm.descendingMap());
	}

}
