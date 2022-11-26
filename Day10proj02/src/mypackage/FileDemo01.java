package mypackage;
import java.io.*;

public class FileDemo01 {
	public static void creatFileUsingFileClass() throws IOException {
		File file =new File("E:/notes/today/TestFile.txt");
		
		//create the file
		if (file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is alrady exist");
		}
		//write content on file
		FileWriter writer= new FileWriter(file);
		writer.write("Hey Brother It's me atul ,This is our first file create by using IO");
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		creatFileUsingFileClass();

	}

}
