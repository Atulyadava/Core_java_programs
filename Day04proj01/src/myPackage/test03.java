package myPackage;
import java.io.*;
public class test03 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//To accept data from the keyboard
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
			//accept input value a and b
			System.out.println("Enter a:");
			int a=Integer.parseInt(br.readLine());
				
			System.out.println("Enter b:");
			int b=Integer.parseInt(br.readLine());
				
			int c=a+b;
			System.out.println("THe Sum:"+c);

	}

}
