package Project1;
import java.util.*;

public class MoreOptions {
	public int display() {
		try {
			MoreOptions mo = new MoreOptions();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select one of the four options by entering the number of your choice");
			System.out.println("1.  Add a file");
			System.out.println("2.  Delete a file");
			System.out.println("3.  Search for a file");
			System.out.println("4.  Return to main screen");

			int input;
			try {
				input = sc.nextInt();
			}catch(Exception e) {
				System.out.println("Not a valid entry. Enter the number of your selection");
				System.out.println("-------------------------------");
				mo.display();
				input = 4;
			}
			while(4 < input || input < 1) {
				System.out.println("Not a valid option please select one of the listed options");
				System.out.println("-------------------------------");
				input = mo.display();
			}
			return input;
		}catch(Exception e) {
			System.out.println("Not a Valid Entry");
			System.out.println("-------------------------------");
			return -1;
		}
	}
}
