
import java.util.Scanner;//											For jinScanner
import java.lang.System;//												for output									//									for screen making
public class Start{
public static void main(String[] Args){//										Get this going
	
		Scanner jinScanner = new Scanner(System.in);//				For User Input
		//System.out.println("What Race are you?");//						What race are you?
		//System.out.println("Options: Human");//							Human; Etc.
		//System.out.println(Dice.RollFinalResult(2, 6));// 				testroll
		Player player1 = new Player();//									create player1
		Player player2 = new Player();
		player1.sethp(1);//												set player1's hp as 1
		player2.sethp(1);
		player1.setmaxhp(1);//												set player1's hp as 1
		player2.setmaxhp(1);
		player1.rename("player1");
		player2.rename("player2");
		player1.DisplayedClass = "Barbarian";
		player2.DisplayedClass = "Barbarian";
		//SimpleOGLRenderer.main(null);
		PlayerStatsGen.generateabilitystats(player1, false);
		PlayerStatsGen.generateabilitystats(player2, false);
		player1.printallstats();
		player2.printallstats();
		player1.combathandler(player1, player2);
		player1.Attack(player2);
	}


	
	public static void scannerclose(Scanner thingtoclose) {
		thingtoclose.close();
	}
	
	
	
}
