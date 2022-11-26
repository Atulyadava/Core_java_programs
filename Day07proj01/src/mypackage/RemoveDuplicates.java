package mypackage;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mobileNos=new ArrayList<Integer>();
		mobileNos.add(98981200);
		mobileNos.add(98983400);
		mobileNos.add(98980500);
		mobileNos.add(98989800);
		mobileNos.add(98980070);
		mobileNos.add(98980000);
		mobileNos.add(98980070);
		mobileNos.add(98980000);
		mobileNos.add(98989800);
		mobileNos.add(98980000);
		System.out.println(mobileNos);
		
		//RemoveDuplicates
		Set<Integer> uniqueMobileNos=new LinkedHashSet<Integer>();
		uniqueMobileNos.addAll(mobileNos);
		System.out.println(uniqueMobileNos);

	}

}
