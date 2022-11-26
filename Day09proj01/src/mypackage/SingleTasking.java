package mypackage;

//Single tasking using a thread
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Execute the tasks one by one by calling methods
		task1();
		task2();
		task3();		
		
	}
	void task1(){
		System.out.println("this is task 1");
	}
	void task2() {
		System.out.println("this is task 2");
	}
	void task3() {
		System.out.println("this is task 3");
	}
	
}
public class SingleTasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object to MyThread Class
		MyThread obj=new MyThread();
		//create a thread t1 and attach it to that object
		Thread t1=new Thread(obj);
		//execute the thread t1 on that object's run() method
		t1.start();

	}

}
