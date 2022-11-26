package mypackage;

import mypackage.Outer.Inner;

public class Outer {
	private String msg="welcome to java. ";
	class Inner{
		void hello() {
			System.out.println(msg+"let`s start learning inner classes");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj= new Outer();
		Outer.Inner in=obj.new Inner();
		in.hello();

	}

}
