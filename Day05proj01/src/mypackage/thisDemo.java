package mypackage;
//this - refers to all the members of present class
class Sample2{
	//x is instance variable
	private int x;
	
	//default constructor
	Sample2(){
		this(55);//calls present class parameterized constructor
		this.access();
	}
	//parameterized constructor
	Sample2(int x){
		this.x=x; //refers present class instance variable
	}
	//method
	public void access() {
		System.out.println("x:"+x);
	}
}
public class thisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s=new Sample2();
	}

}
