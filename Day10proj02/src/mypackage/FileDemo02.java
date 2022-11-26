package mypackage;
import java.io.*;

public class FileDemo02 {
	public static void createFileUsingFileOutputStreamClass() throws IOException {
		String data= "Hey, this is friday Night";
		FileOutputStream out=new FileOutputStream("E:/notes/today/TestFile2.txt");
		out.write(data.getBytes());
		out.close();
		System.out.println("Date written successfully!");
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		createFileUsingFileOutputStreamClass();

	}

}
