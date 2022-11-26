package mypackage02;

public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int rs;
		try {
		rs=a/b;
		System.out.println(rs);
		}
		catch(Exception e) {
			System.err.println("Divide by zero not allowed");
			e.printStackTrace();
		}
		System.out.println("End of program");




	}

}
