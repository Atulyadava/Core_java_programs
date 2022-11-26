package mypackage;
class DefAccessSpecifier{
	void display() {
		System.out.println("You are using default access specifier");
	}
}
public class AcessSpecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default access specifier");
		DefAccessSpecifier obj=new DefAccessSpecifier();
		obj.display();
	}

}
