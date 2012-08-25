
public interface Combat {
	public int ArmorClass = 1;
	public int TouchArmorClass = 1;
	public int FlatFootArmorClass = 1;
	void Attack(creature target);
void combathandler(creature...thoseincombat);
initiativecontainer[] rollinitiative(creature... thoseforinit);
public enum lifestatus { ALIVE, STABLE, UNSTABLE, DEAD };








}
