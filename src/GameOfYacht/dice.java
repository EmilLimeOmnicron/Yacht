package GameOfYacht;

import java.util.Arrays;
import java.util.Random;

public class dice {
	public int dice1, dice2, dice3, dice4, dice5;
	int value;
	
	

    private static final Random generator = new Random();
    
    
    public int CreateDice() {
        return generator.nextInt(6) + 1;
    }
    
    public void PrintBoard(int[] board) {  	
    	System.out.println(Arrays.toString(board));
	}
    
    public int[] storeDice() {
    	dice1 = CreateDice();
    	dice2 = CreateDice();
    	dice3 = CreateDice();
    	dice4 = CreateDice();
    	dice5 = CreateDice();
    	
    	
    	int[] arr = new int[]{dice1, dice2, dice3, dice4, dice5};
    	
    	return arr;
    	}
    
    public int rerollDice(int dicePosition) {
    	int rerolledDice = CreateDice();
    	return rerolledDice;
    }
    
    public int[] holdDice() {
    	int[] board = storeDice();   	
    	
    	int[] arr = new int[]{};
    	
    	return arr;
    }
}
