import java.util.Random;
// this code is not exactly pretty, but it works.
public class Dice {
	
public static int RollFinalResult(int dn, int dt) {//	dn is Dice number, dt is Dice Type
	Random diceroll = new Random();
	int TempRoll = 0;
	int RollFinalResult = 0;
	int loopcount = 0;
	for(loopcount = 0; loopcount < dn; loopcount++) {
	TempRoll = TempRoll + diceroll.nextInt(dt) + 1;//	Temproll stores the accumulated rolls during the looping adn each lop adds the random number for the dice +1 because if i want 1d6, it will generate a number between 0 and 6, so i add one to become between 1 and 6.
	}
	RollFinalResult = TempRoll;
	loopcount = 0;
	TempRoll = 0; 
	return(RollFinalResult);
}


}