package mypackage;
//Thread Synchronization - Two threads acting on same object
class reserve implements Runnable{
	//available berths are 1
	int available=1;
	int wanted;
	
	//accept wanted berths at run time
	reserve(int i){
		wanted=i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this) {//Synchronizing the current object
		//display available berths
		System.out.println("Available berths:="+available);
		if(available>=wanted) {
			//get the passenger name
			String name=Thread.currentThread().getName();
			System.out.println(wanted+" Berths reserve for "+name);
			try {
				Thread.sleep(2000);
				available = available-wanted;//update the no. of available berths
			}
			catch(InterruptedException ie) {
				
			}
			//if available berths are less, display sorry
			System.out.println("sorry, no berths");
			
		}
	}
	
	}
}

public class Safe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tell that 1 berth is needed
		reserve obj=new reserve(1);

		//attach first thread to the object
		Thread t1=new Thread(obj);
		//attach second thread to the object
		Thread t2 = new Thread(obj);
		t1.setName("FIRST PERSION");
		t2.setName("SECOND PERSION");

		//send the requests for berth
		t1.start();
		t2.start();

	}

}
