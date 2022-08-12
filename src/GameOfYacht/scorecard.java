package GameOfYacht;

import java.util.Arrays;
import java.util.HashMap;

public class scorecard {
	int choice;
	int counter = 0;
	int[] scoreArray;
	/*Functionality: Scored using the 12 options in scoring method. see https://en.wikipedia.org/wiki/Yacht_(dice_game) for how to score. 
	 * 
	 * 
	 */
	public void ScoreChoice(int choice, int[] arr) {
		counter = 0;
		if(choice == 1) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		
		else if(choice == 2) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 2) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		else if(choice == 3) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 3) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		else if(choice == 4) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 4) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		else if(choice == 5) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 5) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		else if(choice == 6) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 6) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
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
				UpdateScoreCard(choice,arr, 30);
			}
			else {
				UpdateScoreCard(choice,arr,0);
			}
		}
		else if(choice == 10) {
			Arrays.sort(arr);
			if(arr[0] == 2 && arr[1] == 3 && arr[2] == 4 && arr[3] == 5 && arr[4] == 6) {
				System.out.println("Big Straight!");
				UpdateScoreCard(choice,arr, 30);
			}
			else {
				UpdateScoreCard(choice,arr,0);
			}
		}
		else if(choice == 11) {
			
		}
		else if(choice == 12) {
			
		}
		else {
			System.out.println("Invalid Choice. Reinput score");
		}
		}

	/*Functionality: Helper method for ScoreChoice to update the score array to easily store and print out everything at once.
	 * choice value is the same as ScoreChoice
	 * scoreArray is the score array we are modifying and that will be printed out
	 * the score array will be updated by the value counted for each scoring method.
	 */
	public void UpdateScoreCard(int choice, int[] scoreArray, int value) {
		scoreArray[choice-1] = value;
		
	}
	
	/*TODO Print out score card when called by Main
	 * 
	 * 
	 */
	public void PrintScoreCard() {
		
	}
	
}
