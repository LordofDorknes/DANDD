
import java.util.Scanner;//											For jinScanner
import java.lang.System;//												for output									//									for screen making
public class Start{
public static void main(String[] Args){//										Get this going
	Scanner jinScanner = new Scanner(System.in);//				For User Input
	System.out.println("What Race are you?");//						What race are you?
	System.out.println("Options: Human");//							Human; Etc.
	System.out.println(Dice.RollFinalResult(2, 6));// 				testroll
	Player Hero = new Player();//									create hero
	Hero.sethp(1);//												set hero's hp as 1
	System.out.println(Hero.HP);//	printhero's hp to confirm
	SimpleOGLRenderer.main(null);
	

}

	
	public static void scannerclose(Scanner thingtoclose) {
		thingtoclose.close();
	}
	
	
	
}
