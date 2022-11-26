package mypackage;

public class Compute {
	public int sum(int X) {
		return X+100;
	}
	public int sum(int X,int Y) {
		return X+Y;
	}
	public int sum(int X ,int Y,int Z) {
		return X+Y+Z;
	}
	public double sum(double X,double Y) {
		return X+Y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute c=new Compute();
		System.out.println(c.sum(23,34,5));
		System.out.println(c.sum(12));
		System.out.println(c.sum(24,46));
		System.out.println(c.sum(23.4,45.233));

	}

}
