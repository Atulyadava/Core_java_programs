package mypackage;

class AgeException extends Exception{
	AgeException (String msg){
		super(msg);
	}
}
	class Customer{
		void setAge(int age) throws AgeException {
			if(age<18 ||age>60)
				throw new AgeException("Age should be between 18 and 60 ");
			else
				System.out.println("your age is "+age );
		}
}
public class CustomerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj= new Customer();
		try {
			obj.setAge(34);
		}
		catch(AgeException e) {
		System.out.println(e.getMessage());
		}
	}

}
