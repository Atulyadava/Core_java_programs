package mypackage;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods of Strings
				System.out.println("Methods of Strings:");
				
				String s1=new String("Hello World");
				System.out.println(s1.length());
				
				//substring
				String sub=new String("Welcome");
				System.out.println(sub.substring(2));
				
				//String Comparision
				String s2="Hello";
				String s3="Hallo";
				System.out.println(s2.compareTo(s3));
				
				//IsEmpty
				String s4="";
				System.out.println(s4.isEmpty());
				
				//toLowerCase
				String s5="HeLLo";
				System.out.println(s5.toLowerCase());
				System.out.println(s5.toUpperCase());
				
				//equals
				String x="hello";
				String y="hello";
				System.out.println(x.equals(y));
				System.out.println(x==y);
				
				String x1=new String("hello");
				String y1=new String("HELLO");
				System.out.println(x1.equals(y1));
				System.out.println(x1.equalsIgnoreCase(y1));
				System.out.println(x1==y1);
				
				//replace
				String s6="Heldo";
				String replace=s6.replace('d', 'l');
				System.out.println(s6);
				System.out.println(replace);
				String replace2=s6.replace("Heldo", "Hi");
				System.out.println(replace2);

	}

}
