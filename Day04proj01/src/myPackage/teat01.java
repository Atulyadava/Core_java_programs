package myPackage;
//initializing the instance variable using a default constructor
class persion{
	//instance variables 
	private String name;
	private int age;
	//default constructor
	persion(){
		name ="Raj";
		age = 22;
	}
	//method 
void talk() {
	System.out.println("Hello I am "+name);
	System.out.println("My age is "+age);
	}
}

public class teat01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persion p = new persion();
		p.talk();

	}

}
