package myPackage;
class Student{
	//instance variable
	private String Name;
	private String Cource;
	private int RollNo;
	//default constructor 
	Student(){
		Name ="atul";
		Cource ="Full Stack java developer";
		RollNo =05;
	}
	//parameterized constructor
	Student(String N,String c,int rn ){
		Name = N;
		Cource = c;
		RollNo =rn;
	}
	// method
	void YourDetail() {
		System.out.println("name: "+Name);
		System.out.println("Cource: "+ Cource);
		System.out.println("RollNo: "+ RollNo);
	}
}

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.YourDetail();
		Student s2 =new Student("Ajit","ag",06);
		s2.YourDetail();

	}

}
