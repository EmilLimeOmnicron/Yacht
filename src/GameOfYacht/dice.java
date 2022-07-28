package GameOfYacht;

import java.util.Random;

public class dice {
	int dice1, dice2, dice3, dice4, dice5;
	int value;
	

    private static final Random generator = new Random();
    
    
    public static int CreateDice() {
        return generator.nextInt(6) + 1;
    }
	public int roll() {

		return value;
	}
}
