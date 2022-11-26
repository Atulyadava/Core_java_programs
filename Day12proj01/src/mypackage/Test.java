package mypackage;

abstract class simple{
	void method1() {//defined or implemented or concrete method
		//CODE
	}
	abstract void method2();
		//declared method
	
}
class Demo extends simple{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}
	void method3() {
		
	}
	
}
abstract class simple2 extends simple{
	void method() {
		//code
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple s =new simple();//error
		simple s=new Demo();

	}

}
