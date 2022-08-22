package Project1;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		System.out.println("LockedMe.com Protype");
		System.out.println("-------------------------------");
		while(run == true) {
			HomeScreen hs = new HomeScreen();

			//Display Home screen
			int input = hs.display();
			System.out.println("-------------------------------");
			
			//Display files alphabetically
			if(input == 1){
				DisplayFiles df = new DisplayFiles();
				df.display();
			} 

			//Close the program
			else if(input == 3){
				System.out.println("Closing the program");
				run = false;
			} 

			//Display options to add, delete, and search files
			else {
				MoreOptions mo = new MoreOptions();
				int input2 = mo.display();
				System.out.println("-------------------------------");
				
				//loop if input 2 was invalid
				if(input2 == -1) {
					input2 = mo.display();
					System.out.println("-------------------------------");
				}

				//User adds file
				else if(input2 == 1) {
					UserCreateFile cf = new UserCreateFile();
					cf.addFile();
				}

				//User deletes files
				else if(input2 == 2) {
					UserDeleteFile df = new UserDeleteFile();
					df.deleteFile();
				}

				//User searches for file
				else if(input2 == 3) {
					UserSearchFile sf = new UserSearchFile();
					boolean result = sf.searchFile();
					if(result) {
						System.out.println("File exists");
						System.out.println("-------------------------------");
					}else {
						System.out.println("File does not exist");
						System.out.println("-------------------------------");
					}
				}

				//return to main screen
				else {
					//return to start of loop
				}
			}
		}
	}
}





















