package mypackage;

class Bicycle{
	int gear;
	int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBreak(int decrement) {
		speed-=decrement;
	}
	public void speepup(int increment) {
	   speed+=increment;
	}
	@Override
	public String toString() {
		return "No. of gaers are: "+gear+"\nspeed of bicycle is; "+speed;
	}
	
}
class MountainBicycle extends Bicycle{
	int seatHight;

	public MountainBicycle(int gear, int speed,int seatHight) {
		super(gear, speed);
		this.seatHight=seatHight;
	}
	public void seatHight(int newValue){
		seatHight=newValue;
		
	}
	@Override
	public String toString() {
		return super.toString()+"\nSeat Hight is: "+seatHight;
	}
		
}
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBicycle mb =new MountainBicycle(12,23,34);
		System.out.println(mb.toString());

	}

}
