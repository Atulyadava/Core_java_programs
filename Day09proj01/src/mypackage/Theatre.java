package mypackage;

//Multi-Tasking using Threads
//Two threads performing two tasks at a time
class MyThread2  implements Runnable{
	//declare a string to represent task
	String str;
	MyThread2(String str){
		this.str=str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(str+":"+i);
			try {
				//cease thread execution for 2000 milliseconds
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
}
public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two objects to represent two tasks
		MyThread2 obj1=new MyThread2("cut the ticket");
		MyThread2 obj2= new MyThread2("Show the seat");
		
		//create two threads and attach them to the two objects
		Thread t1=new Thread(obj1);
		Thread t2 =new Thread(obj2);
		
		//execute Threads 
		t1.start();
		t2.start();
		

	}

}
