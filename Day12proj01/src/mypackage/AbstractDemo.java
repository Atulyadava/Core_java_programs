package mypackage;

abstract class Vehicle{
	abstract void drive();
	void appyBeake() {
		System.out.println("Appy brake");
	}
}
class car extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driveing a car");
	}
	 void changeGear() {
		System.out.println("Change the gear");
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new car();
		v.appyBeake();
		v.drive();
		//v.changeGear();
		car c= new car();
		c.changeGear();

	}

}
