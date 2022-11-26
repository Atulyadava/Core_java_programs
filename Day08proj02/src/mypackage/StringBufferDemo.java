package mypackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating StringBuffer:");
		StringBuffer s = new StringBuffer("Welcome to java! ");
		s.append("Enjoy your learning");
		System.out.println(s);
		
		//insert method
		s.insert(0,"hey,");
		System.out.println(s);
		
		
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hey");
		System.out.println(sb);
		
		//delete Method
		sb.delete(1, 3);
		System.out.println(sb);

	}

}
