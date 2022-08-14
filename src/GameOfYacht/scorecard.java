package GameOfYacht;

import java.util.Arrays;
import java.util.HashMap;

public class scorecard {
	int choice;
	 int counter = 0;
	int[] scoreArray;
	int score;
	/*Functionality: Scored using the 12 options in scoring method. see https://en.wikipedia.org/wiki/Yacht_(dice_game) for how to score. 
	 * 
	 * 
	 */
	public  int ScoreChoice(int choice, int[] arr) {
		System.out.println("Entered score method");
		if(choice == 1) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {
					System.out.println("Counter is" + counter);
					counter++;
				}
			}
			System.out.println("Concluding score");
			System.out.println("Counter is" + counter);
			score = counter;
		    
		}
		
		else if(choice == 2) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 2) {
					counter++;
				}
			}
			System.out.println(Arrays.toString(arr));
	
		}
		else if(choice == 3) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 3) {
					counter++;
				}
			}
			
		}
		else if(choice == 4) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 4) {
					counter++;
				}
			}
			
		}
		else if(choice == 5) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 5) {
					counter++;
				}
			}
	
		}
		else if(choice == 6) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 6) {
					counter++;
				}
			}
	
		}
		else if(choice == 7) {
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(i == j) {
						counter++;
					}
				}
			}
			
		}
		else if(choice == 8) {
	
		}
		else if(choice == 9) {
			Arrays.sort(arr);
			if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) {
				System.out.println("Little Straight!");
				
			}
			else {
			
			}
		}
		else if(choice == 10) {
			Arrays.sort(arr);
			if(arr[0] == 2 && arr[1] == 3 && arr[2] == 4 && arr[3] == 5 && arr[4] == 6) {
				System.out.println("Big Straight!");
				
			}
			else {
			
			}
		}
		else if(choice == 11) {
			
		}
		else if(choice == 12) {
			
		}
		else {
			System.out.println("Invalid Choice. Reinput score");
		}
		return score;
		}


	/*TODO Print out score card when called by Main
	 * 
	 * 
	 */
	public void PrintScoreCard() {
		
	}
	
}
