package mypackage;
class calc1{
	public void sum(int X,int Y) {
		System.out.println("sum of base: "+(X+Y));
	}
}
class calc2 extends calc1{
	@Override
	public void sum(int X,int Y) {
		System.out.println("sum of drive: "+(X+Y));
	}
}
public class Test01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc1 obj1=new calc1();
		obj1.sum(10, 20);
		calc2 obj2=new calc2();
		obj2.sum(10, 20);
		
		//Calc1 obj3=obj2;
		calc1 obj3=new calc2();
		obj3.sum(10, 20);

	}

}
