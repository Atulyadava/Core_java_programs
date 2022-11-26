package mypackage;
class Customer{
	public void Method01() {
		System.out.println("no parameters no returntype");
	}
	public void Method02(int a,int b) {
		System.out.println("with parameters and no return type");
	}
	public int Method03() {
		System.out.println("without parameters and with return type");
		return 10;
	}
	public int Method04(int a,int b) {
		System.out.println("with parameters and with return type");
		return a+b;
	}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.Method01();
		c.Method02(15, 25);
		int res1=c.Method03();
		System.out.println(res1);
		int res2=c.Method04(15, 25);
		System.out.println(res2);
		System.out.println(c.Method03());
	}

}
