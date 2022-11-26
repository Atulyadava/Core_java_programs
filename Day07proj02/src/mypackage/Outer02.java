package mypackage;

public class Outer02 {
	private String msg="Today's last example";
	void display() {
		class Inner2{
			void msg() {
				System.out.println(msg+" let's end the session");
			}		
		}
		Inner2 in =new Inner2();
		in.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer02 obj= new Outer02();
		obj.display();

	}

}
