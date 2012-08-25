
public class PlayerStatsGen {
public static void generateabilitystats(creature x, boolean displaystats) {
	try{
	x.setstr(Dice.RollFinalResult(3,6));
	x.setdex(Dice.RollFinalResult(3,6));
	x.setcon(Dice.RollFinalResult(3,6));
	x.setwis(Dice.RollFinalResult(3,6));
	x.setint(Dice.RollFinalResult(3,6));
	x.setcha(Dice.RollFinalResult(3,6));
	x.calculateabilitymods();
	x.sethitdicesize();
	x.setmaxhp(Dice.RollFinalResult(1,x.hitdicesize + x.Conmod));//
	String Reason;
	Reason = "PlayerGen_" + x.name;
	x.Fullheal(Reason);
	}
	finally{
		if( displaystats == true){
		System.out.print("Ability stats set for ");
		System.out.print(x.name);
		System.out.println(" as follows:");
		x.printabilitystats();
		}
		else {
			//Do nothing
		}
	}
	}

public void Levelup(creature x, int numoflevels) {
	x.level =+ numoflevels;
	int tempaddedhealth = Dice.RollFinalResult(1,x.hitdicesize + x.Conmod);
	x.addmaxhp(tempaddedhealth);
	String Reason;
	Reason = "Levelup_" + x.name;
	x.Fullheal(Reason);
	
	
}



}

