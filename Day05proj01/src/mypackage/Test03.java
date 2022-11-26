package mypackage;
//WAP for a static method that accept two numbers and return sum as result
class Sample{
	//instance variable
	//int a=20;//we cannot access non-static variables in the static block
	//declaring a static method
	
	static double sum(double num1,double num2) {
		double res=num1+num2;
		//System.out.println(a);
		return res;
	}
}
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the static method using classname.methodname()
				double x=Sample.sum(10.5, 12.9);
				System.out.println("Sum:"+x);
			}
	}


