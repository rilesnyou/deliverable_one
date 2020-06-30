package deliverable1;

import java.util.Scanner;


public class deliverable1 {
	public static void main(String[] args) {
		
		String type;
		String destination = null;
		String suggestion = null;

		int size = 100;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What type of vacation do you want to take? (Musical, tropical, or adventurous?");

		
		
		
		
		while (true) {
		    type = scan.nextLine();
			if(type.equalsIgnoreCase("musical")) {
				destination = "New Orleans";
				break;
			}
			if(type.equalsIgnoreCase("tropical")) {
				destination = "a beach vacation in Mexico";
				break;
	 		}
			if(type.equalsIgnoreCase("adventurous")) {
				destination = "Whitewater rafting in the Grand Canyon";
				break;
			}
		    if (destination != null) { 
		         break;
		    } else {
		         System.out.println("That is not a valid vacation type! Please enter again (Musical, Tropical, or Adventurous) ");
		    }
		} 
		
		
		System.out.print("How many are in your group?");
		size = scan.nextInt();
			
		if(size <= 2) {
			suggestion = "First Class flight";
		}
		else if (size >= 3 || size <= 5) {
			suggestion = "Helicopter";
		}
		if (size >= 6) {
			suggestion = "Charter flight";
		}
		String result =("Since your group size is " + size + ", and you're going on a " + type + " vacation. You should take a " + suggestion + " to " + destination + ".");
		System.out.print(result);
		scan.close();
		System.exit(0);
		}

	private static boolean isValidType(String type) {
		// TODO Auto-generated method stub
		return false;
	}
	}
