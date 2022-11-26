package mypackage;

public class ConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");		
		String str="1234";

		//Conversion from String object to StringBuffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer:");
		System.out.println(sbr);

		//Conversion of String object to StringBuilder
		StringBuilder sbl=new StringBuilder(str);
		sbl.append("world");
		System.out.println("String to StringBuilder:");
		System.out.println(sbl);

	}

}
