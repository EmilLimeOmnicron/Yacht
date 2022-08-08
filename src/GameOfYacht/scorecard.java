package GameOfYacht;

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
		
		}
		else if(choice == 8) {
	
		}
		else if(choice == 9) {
		
		}
		else if(choice == 10) {
			
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
