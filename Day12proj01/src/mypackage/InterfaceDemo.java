package mypackage;

interface shape{
	void Drow ();
	default void fill(){
		System.out.println("filling");
	}
}
class Circle implements shape{

	@Override
	public void Drow() {
		// TODO Auto-generated method stub
		System.out.println("drow a circle");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Circle(); 
		s.Drow();
		s.fill();

	}

}

