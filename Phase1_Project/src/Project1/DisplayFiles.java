package Project1;

import java.util.*;
import java.io.*;

public class DisplayFiles {
	public void display() {
		File folder = new File("C:\\Users\\staff\\eclipse-workspace\\Phase1Project\\src\\Root\\");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File " + listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}
		System.out.println("-------------------------------");
	}
}
