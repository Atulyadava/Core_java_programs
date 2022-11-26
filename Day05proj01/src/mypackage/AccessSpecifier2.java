package mypackage;
class PriAcessSpecifier{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}
public class AccessSpecifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriAcessSpecifier obj=new PriAcessSpecifier();
		//obj.display();
	}

}
