package mypackage;
import java.nio.file.Files;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Files.delete(Paths.get("E:\\notes\\today\\TestFile2.txt"));
			System.out.println("deletion is successful");
		}
		catch(NoSuchFileException e) {
			System.out.println("No Such File/Directory exists");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not Empty");
		}
		catch(IOException e) {
			System.out.println("Invelid permission");
			
		}

	}

}
