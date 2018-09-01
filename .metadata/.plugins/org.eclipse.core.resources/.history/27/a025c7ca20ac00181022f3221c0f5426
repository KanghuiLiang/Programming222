package Game;

public class Monster extends Card_Constructor {
	int monsterLVL;
	int treasureFor; //How many treasure player gets for defeating the monster
	int looseLVL; //How many levels player looses in case ihe looses the fight
	int escapeStat; //How hard it is to escape from monster. May add or substract chances for escape
	
	public Monster(String name, int mstrLVL, int trsureFr, int lseLVL, int scapStt, String specialCondition) {
		super(name, specialCondition);
		
		this.monsterLVL = mstrLVL;
		this.treasureFor = trsureFr;
		this.looseLVL = lseLVL;
		this.escapeStat = scapStt;
	}

	public String toString() {
		return "This monster name's " + name + ", it's level is: " + monsterLVL 
											+ "\n\t *Treasure: " + treasureFor 
											+ "\n\t *In case of fail you will loose: " + looseLVL + " lvl(s),"
											+ "\n\t *Escape?: " + escapeStat
											+ "\n\t *Special Condition: " + specialCondition + ".";
        }
}
