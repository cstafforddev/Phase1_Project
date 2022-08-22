package Project1;

import java.io.File;
import java.util.Scanner;

public class UserSearchFile {
	public boolean searchFile() {
		File folder = new File("C:\\Users\\staff\\eclipse-workspace\\Phase1Project\\src\\Root\\");
		File[] listOfFiles = folder.listFiles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file to search for:");
		String input = sc.next();
		UserSearchFile sf = new UserSearchFile();
		
		for(File file : listOfFiles) {
			if(file.getName().equals(input)) {
				return true;
			}
			
		}
		return false;
		//binarySearch(listOfFiles, 0, input, listOfFiles.length);
		
	}
	
	public static void binarySearch(File[] arr, int start, String key, int length) {
		System.out.println("Search");
		int midValue = (start+length)/2;
		while(start <= length) {
			if((int) arr[midValue].getPath().charAt(0) < (int) key.charAt(0)) {
				System.out.println(arr[midValue].getPath().charAt(0));
				start = midValue + 1;
			} else if(arr[midValue].getPath() == key) {
				System.out.println("Element is found at index: " + midValue);
				System.out.println("-------------------------------");
				break;
			} else {
				length = midValue -1;
			}
			midValue = (start + length)/2;
		}
		if(start > length) {
			System.out.println("Element is not found");
			System.out.println("-------------------------------");
		}
	}
}
