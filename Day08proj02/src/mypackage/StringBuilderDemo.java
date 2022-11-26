package mypackage;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("happy ");
		sb1.append("Learning");
		System.out.println(sb1);
		
        System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.insert(1, "Welcome"));
		
		//reverse method
		System.out.println(sb1.reverse());

	}

}
