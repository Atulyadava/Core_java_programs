package mypackage;

interface first{
	default void Show(){
		System.out.println("default first");
	}
}
interface Second{
	default void Show(){
		System.out.println("default second");
	}
}

public class InterfaceDemo2 implements first,Second {
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		first.super.Show();
		Second.super.Show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo2 i=new InterfaceDemo2();
		i.Show();

	}

}
