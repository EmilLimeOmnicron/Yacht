package GameOfYacht;

import java.util.HashMap;

public class scorecard {
	int choice;
	int counter;
	int[] scoreArray;
	public void ScoreChoice(int choice, int[] arr) {
		
		if(choice == 1) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {
					counter++;
				}
			}
			UpdateScoreCard(choice,arr,counter);
		}
		
		else if(choice == 2) {
			
		}
		else if(choice == 3) {
			
		}
		else if(choice == 4) {
	
		}
		else if(choice == 5) {
	
		}
		else if(choice == 6) {
	
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

	//helper method for ScoreChoice to update the score array to easily store and print out everything at once.
	public void UpdateScoreCard(int choice, int[] scoreArray, int value) {
		scoreArray[choice] = value;
		
	}
	
	
	public void PrintScoreCard() {
		
	}
	
}
