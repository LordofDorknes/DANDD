import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class creature implements Combat {
	public String name;
	public int level = 1;
	public int MaxHP;
	public int HP;
	public int Str;
	public int Dex;
	public int Con;
	public int Wis;
	public int Int;
	public int Cha;
	public int Strmod;
	public int Dexmod;
	public int Conmod;
	public int Wismod;
	public int Intmod;
	public int Chamod;
	public int hitdicesize;
	public int classtracker;
	public String DisplayedClass;
	
	public enum attackprogression { FULL, MED, HALF };
	attackprogression AttackProgression = attackprogression.FULL;
	public enum lifestatus { ALIVE, STABLE, UNSTABLE, DEAD };
	
	
	
	public void calculateabilitymods() {
		this.calculatestrmod();
		this.calculatedexmod();
		this.calculateconmod();
		this.calculatewismod();
		this.calculateintmod();
		this.calculatechamod();
	}
	public void calculatestrmod(){
		int tempstrmod = Str;
		tempstrmod = tempstrmod - 10;
		tempstrmod = tempstrmod/2;
		Strmod = tempstrmod;
	}
	public void calculatedexmod(){
		int tempdexmod = Dex;
		tempdexmod = tempdexmod - 10;
		tempdexmod = tempdexmod/2;
		Dexmod = tempdexmod;
	}
	public void calculateconmod(){
		int tempconmod = Con;
		tempconmod = tempconmod - 10;
		tempconmod = tempconmod/2;
		Conmod = tempconmod;
}
	public void calculatewismod(){
		int tempwismod = Wis;
		tempwismod = tempwismod - 10;
		tempwismod = tempwismod/2;
		Wismod = tempwismod;
}
	public void calculateintmod(){
		int tempintmod = Int;
		tempintmod = tempintmod - 10;
		tempintmod = tempintmod/2;
		Intmod = tempintmod;
}
	public void calculatechamod(){
		int tempchamod = Cha;
		tempchamod = tempchamod - 10;
		tempchamod = tempchamod/2;
		Chamod = tempchamod;
}
	public void rename(String newname) {
		name = newname;
	}
	public void addhp(int addedmaxhp) {
		MaxHP += addedmaxhp;
		}
public void setmaxhp(int setmaxhp) {
		MaxHP = setmaxhp;
		}
public void addmaxhp(int addedhp) {
	HP += addedhp;
	}
public void sethp(int sethp) {
	HP = sethp;
	}
public void addstr(int addedstr) {
	Str += addedstr;
	}
public void setstr(int setstr) {
	Str = setstr;
	}
public void adddex(int addeddex) {
	Dex += addeddex;
	}
public void setdex(int setdex) {
	Dex = setdex;
	}
public void addcon(int addedcon) {
	Con += addedcon;
	}
public void setcon(int setcon) {
	Con = setcon;
	}
public void addwis(int addedwis) {
	Wis += addedwis;
	}
public void setwis(int setwis) {
	Wis = setwis;
}
public void addint(int addedint) {
	Int += addedint;
}
public void setint(int setint) {
	Int = setint;
	}
public void addcha(int addedcha) {
	Cha += addedcha;
}
public void setcha(int setcha) {
	Cha = setcha;
}
public void printallstats() {
	this.calculateabilitymods();
	
				System.out.println(name);//print name
				
				System.out.print("Level ");
				System.out.print(level);
				System.out.print(" ");
				System.out.println(DisplayedClass);
		
				System.out.print("HP: ");
				System.out.print(this.HP);
				System.out.print("/");
				System.out.print(this.MaxHP);// print "hp/maxhp"
				System.out.print(" (");
				System.out.print(level);
				System.out.print("d");
				System.out.print(this.hitdicesize);
				if (this.Conmod > -1) {
					System.out.print("+");
				System.out.print(this.Conmod);
				System.out.println(")");
				}
				else {
					System.out.print(this.Conmod);
					System.out.println(")");
				}
	System.out.print("Str: ");
	System.out.print(this.Str);
	System.out.print(" (");
	System.out.print(Strmod);
	System.out.println(")");
	System.out.print("Dex: ");
	System.out.print(this.Dex);
	System.out.print(" (");
	System.out.print(Dexmod);
	System.out.println(")");
	System.out.print("Con: ");
	System.out.print(this.Con);
	System.out.print(" (");
	System.out.print(Conmod);
	System.out.println(")");
	System.out.print("Wis: ");
	System.out.print(this.Wis);
	System.out.print(" (");
	System.out.print(Wismod);
	System.out.println(")");
	System.out.print("Int: ");
	System.out.print(this.Int);
	System.out.print(" (");
	System.out.print(Intmod);
	System.out.println(")");
	System.out.print("Cha: ");
	System.out.print(this.Cha);
	System.out.print(" (");
	System.out.print(Chamod);
	System.out.println(")");
}
public void printabilitystats(){
	System.out.print(name);
	System.out.println(":");
	System.out.print("Str: ");
	System.out.println(this.Str);
	System.out.print("Dex: ");
	System.out.println(this.Dex);
	System.out.print("Con: ");
	System.out.println(this.Con);
	System.out.print("Wis: ");
	System.out.println(this.Wis);
	System.out.print("Int: ");
	System.out.println(this.Int);
	System.out.print("Cha: ");
	System.out.println(this.Cha);
}

public void printabilitymods() {
	
}

public void Fullheal(String bywhatprocess) {
	System.out.print("INFO: ");
	System.out.print(this.name);
	System.out.print(" was Fully Healed by ");
	System.out.print(bywhatprocess);
	System.out.println(".");
	this.HP = this.MaxHP;
}
public int handoverhitdicesize() {
	return hitdicesize;
}
public void sethitdicesize(){
	switch(this.DisplayedClass) { 
	case "Barbarian": this.hitdicesize = 12;
	default://donothing		
	}
}
public void setcharclass(String Charclass) {
	this.DisplayedClass = Charclass;
}
public int calcattackroll() {
	int tempattackroll = 0;
	int tempattackd20roll = Dice.RollFinalResult(1, 20);
	tempattackroll = tempattackd20roll; 
	switch(AttackProgression) {
	
	case FULL:
		tempattackroll =+ this.level;
		break;
	case HALF:
		tempattackroll =+ ((this.level) / 2);
		break;
	case MED:
		tempattackroll =+ (((this.level)*3) / 4);
		break;
	default:
		System.out.println("Uh, Houston, we have a problem.");
		System.out.print("this.name");
		System.out.println(" does not have an attack progression.");
		System.out.println("Shit.");
		break;
}
	tempattackroll =+ this.Strmod;
	tempattackroll =+ 0;//For other modifiers later
	int attackroll = tempattackroll;
	return attackroll;
}
@SuppressWarnings("static-access")
@Override
public void Attack(creature target) {
	if (this.calcattackroll() >= target.ArmorClass) {
		target.addhp(-(Dice.RollFinalResult(1, 3)));
		System.out.print("COMBAT: Attack by ");
		System.out.print(this.name);
		System.out.print(" hit ");
		System.out.print(target.name);
		System.out.println(".");//will add for X damage later
	}
	else {
		System.out.print("COMBAT: Attack by ");
		System.out.print(this.name);
		System.out.print(" missed ");
		System.out.print(target.name);
		System.out.println(".");
	}
		
	
	
	
	
}
@Override
public void combathandler(creature...thoseincombat) {
	System.out.print("COMBAT: COMBAT BEGUN WITH ");
	
	int begunwithcounter;
	for(begunwithcounter = 0; thoseincombat.length > begunwithcounter;) {
		System.out.print(thoseincombat[begunwithcounter].name);
		begunwithcounter++;
			if(thoseincombat.length > begunwithcounter){
				System.out.print(", ");
			} 
			else{
				System.out.println(".");
					}
			
			// find initiative order
			
			//start combat loops
			
			
			
			
	}
		//List<creature> thoseincombatlist = new ArrayList<creature>(Arrays.asList(thoseincombat));													}			
	
	
	
	//System.out.print("COMBAT: Combat between ");
	//System.out.print(A);
	//System.out.print(" and ");
	//System.out.print(B);
	//System.out.println("has started.");
	//boolean iscombatgoing = true;
	//while(iscombatgoing = true){
		//if(this.rollinitiative(A, B)) {
			//A.Attack(B);
			//if (B.HP > B.MaxHP && A.HP > A.MaxHP){
			//	B.Attack(A);
			//}
		//}
		//else{
			//B.Attack(A);
			//if (B.HP > B.MaxHP && A.HP > A.MaxHP){
			//	A.Attack(B);
		}
			//else{
				
			//}
			
		//}
	//}
//}
@Override
public initiativecontainer[] rollinitiative(creature... thoseforinit) {
	int initiativecounter;
	initiativecontainer[] initaivearray = new initiativecontainer[thoseforinit.length];
	for(initiativecounter = 0; thoseforinit.length > initiativecounter;) {
		System.out.print("Rolling initiative for ");
	
		System.out.print(thoseforinit[initiativecounter].name);
		initiativecounter++;
		System.out.println(".");
		
		
			initaivearray[initiativecounter].Creatureheld = thoseforinit[initiativecounter];
			initaivearray[initiativecounter].Initativeroll = (Dice.RollFinalResult(1, 20) + (thoseforinit[initiativecounter].Dexmod));
		System.out.print(initaivearray[initiativecounter].Creatureheld.name);
		System.out.print(" rolled ");
		System.out.print(initaivearray[initiativecounter].Initativeroll);
		System.out.println(".");
			
		//sort initiative
			

	}
	Collections.sort(initaivearray.length);
	return initaivearray[a].Initativeroll;
			

	
	
	//boolean isafirst;
	//if ((Dice.RollFinalResult(1, 20) + A.Dexmod) > (Dice.RollFinalResult(1, 20) + B.Dexmod)){
		//isafirst = true;
		//System.out.print("COMBAT:");
		//System.out.print(A.name);
		//System.out.println("moves first.");
		//return isafirst;
	//}
	//else{
		//System.out.print("COMBAT:");
		//System.out.print(B.name);
		//System.out.println("moves first.");
		//isafirst = false;
		//return isafirst;
	}





}

//}

