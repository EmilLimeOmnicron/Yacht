package GameOfYacht;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		 int choice = 0;
		 int[] currentBoard;
		
		 boolean gameContinue = true;
		 boolean gameInProgress = true;
		 boolean rerolling = true;
		 boolean diceRerolled = false;
		
		 
		 dice diceObj = new dice(); 
		// gamestate gsOb = new gamestate();
		 while(gameContinue == true) {
			 Scanner myObj = new Scanner(System.in);
			 System.out.println("Game of Yacht");
			 System.out.println("Press 1 for New Game");
			 System.out.println("Press 2 for Rules");
			 System.out.println("Press 3 to quit.");
		 
		 
			 choice = myObj.nextInt();
		 
			 if (choice == 1) {
			 //start game
			 //roll 5 dice
			while(gameInProgress) {
			  currentBoard = diceObj.storeDice();
			 diceObj.PrintBoard(currentBoard);
			 //which dice to keep if else 1 2 3 4 5?
			//if not keeping, go to scoring ->
			 
			//reroll all at once
			 //make array to get all choices
			 // then reroll the dice that aren't chosen.
			 //do this another time if there isnt 5 dice kept
			 //3rd round is the final so everything is kept.
			 while(rerolling) {
				 System.out.println("To reroll: Enter 1 to keep, 0 to reroll");
			int dicePick = myObj.nextInt();
			int dicePick2 = myObj.nextInt();
			int dicePick3 = myObj.nextInt();
			int dicePick4 = myObj.nextInt();
			int dicePick5 = myObj.nextInt();
			//set boolean to true if it is kept so it cant be rerolled in the last reroll
			
			
			int[]  chooseReroll = new int[] {dicePick, dicePick2, dicePick3, dicePick4, dicePick5};
			Boolean[] rerolledArray = new Boolean[5];
			
			for(int i = 0; i < chooseReroll.length;i++ ) {
			
				if(chooseReroll[i] == 0) {
					rerolledArray[i] = true;
					currentBoard[i] = diceObj.rerollDice(i);
				}
				else if (chooseReroll[i] == 1) {
					
					System.out.println("Keeping Dice " + (i+1)  + "\n");
				}
				else {
					System.out.println("Invalid choices");
				}
			}
			
			diceObj.PrintBoard(currentBoard);

			System.out.println("Do you want to reroll one last time? Press 1 for yes 0 for no.");
			
			int finalReroll = myObj.nextInt();
			if (finalReroll == 1) {
				for(int i = 0; i < rerolledArray.length;i++) {
					if(rerolledArray[i] == true) {
						continue;
					}
					else {
						currentBoard[i] = diceObj.rerollDice(i);
					}
				}
			
			}
			
			 if(finalReroll == 0){
				 
				}
				
		
			 //if kept, roll dice up to 1 more times.
			 //place in bucket to score (also to not have thigns overwrite use boolean to see if bucket is already filled)
			 diceObj.PrintBoard(currentBoard);
			 
			 }

				
			}
			}
			 else if (choice == 2) {
				 System.out.println("Yacht is a game where you roll five dice up to 3 times per turn.");
				 System.out.println("You can keep dice every round of your turn until 5 is kept. On the 3rd round you must keep the dice.");
				 System.out.println("The score categories is as follows: ");
				 System.out.println("Ones: Sum of all dice with the 1 face(Max Score 5)");
				 System.out.println("Twos: Sum of all dice with the 2 face(Max Score 10)");
				 System.out.println("Threes: Sum of all dice with the 3 face(Max Score 15)");
				 System.out.println("Fours: Sum of all dice with the 4 face(Max Score 20)");
				 System.out.println("Fives: Sum of all dice with the 5 face(Max Score 25)");
				 System.out.println("Sixes: Sum of all dice with the 6 face(Max Score 30)");
				 System.out.println("Full House: Three of a Kind and a Pair (Max Score 25)");
				 System.out.println("Four of a  Kind: Sum of 4 dices of the same face (Max Score 24)");
			   	System.out.println("Little Straight: 1-2-3-4-5(Max Score 30)");
			  	System.out.println("Big Straight: faces of 2-3-4-5-6 (Max Score 30)");
			    System.out.println("Choice: Sum of all dice (Max Score 30)");
			 	System.out.println("Yacht:  all dice showing the same face(Max Score 50)");
			 	
		 }
		 
		 
			 else if (choice == 3) {
				 System.out.println("Exiting game... ");
				 System.exit(0);			 
			 }
		 
			 else if (!(choice == 3) && gameContinue == true) {
				 System.out.println("Please enter a valid option.");
			
			 }
		 
		 }
		 
		 }
}






