package Project1;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserDeleteFile {
	public static void main(String[] args) {
		UserDeleteFile df = new UserDeleteFile();
		df.deleteFile();
	}
	public void deleteFile(){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file to delete:");
		String input = sc.next();
		try
		{ 
			Files.delete(Paths.get("C:\\Users\\staff\\eclipse-workspace\\Phase1Project\\src\\Root\\" + input)); 
			System.out.println("Deletion successful.");
			System.out.println("-------------------------------");
		} 
		catch(NoSuchFileException e) 
		{ 
			System.out.println("No such file/directory exists"); 
			System.out.println("-------------------------------");
		} 
		catch(DirectoryNotEmptyException e) 
		{ 
			System.out.println("Directory is not empty."); 
			System.out.println("-------------------------------");
		} 
		catch(IOException e) 
		{ 
			System.out.println("Invalid permissions."); 
			System.out.println("-------------------------------");
		} 
	} 
}
