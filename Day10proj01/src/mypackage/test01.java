package mypackage;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [5];
		try {
			a[8]=100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("the array is of size " +a.length);
		}

	}

}
