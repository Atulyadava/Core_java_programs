package mypackage;
import java.util.regex.*;
public class RegularExpressions_RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a pattern to be searched
				Pattern p=Pattern.compile("[0-9]+");
				
				//search the above pattern in Hi folks, Hi everyone
				Matcher m=p.matcher("Hi fo123lks, 567Hi ever123HiyonHie");
				
				//Finding string using find() method
				while(m.find()) {
					//print starting and ending indexes 
					//of the pattern in the text
					System.out.println("Pattern found from:"+m.start()+" to "+(m.end()-1));
				}
				
				System.out.println(m);
				RegularExpressions_RegexDemo t=new RegularExpressions_RegexDemo();
				System.out.println(t);

	}

}
