package programming2Week2;

public class Character {
		 int MP;
		 int HP;
		 
	public Character() {
				MP=10;
				HP=10;
			}
	
	public Character(int hp, int mp) {
		MP=mp;
		HP=hp;
	}
	
		public int getMP() {
			return MP;
		}
		
		public int getHP() {
//			if(this.HP<0) {return 0;}
//			else  
			return HP;}
		
		public void setMP(int MP) {this.MP = MP;}
		
		public void setHP(int HP) {this.HP = HP;}
		
		public void decreasehealth(int minusHP) {
			setHP(getHP()-minusHP);
		}
		 void heal(int hp) {}
         void attack(int speed) {}
         
         public String toString () {
     		return "MP:"+MP+ " HP:" +HP;
         }
}
