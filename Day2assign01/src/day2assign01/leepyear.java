package day2assign01;
import java.util.*;
public class leepyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter tha year");
    Scanner sc =new Scanner(System.in);
    int year = sc.nextInt();
    if(((year%100 !=0) && (year%4 ==0)) || (year%400 ==0)) {
    System.out.println(year +" is leep year ");
	}
    else {
    	System.out.println( year +" is not a leep year");
    }

}
}