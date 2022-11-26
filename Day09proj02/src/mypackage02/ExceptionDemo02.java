package mypackage02;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArithmeticException
		//int n=10/0;
		//ArrayIndexOutofBoundsException
		/*int[] n= {10,20,30,40,50};
		System.out.println(n[10]);*/
		//StringIndexOutOfBoundsException
		/*String s="hello";
		System.out.println(s.charAt(10));*/
		//NegativeArraySizeException
		//int[] n=new int[-5];
		//NumberFormatException
		/*String s="xyz";
		int n=Integer.parseInt(s);*/
		//NullPointerException
		String s=null;
		System.out.println(s.equals("Hello"));

	}

}
