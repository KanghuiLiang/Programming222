package Mid;

public class Boss_Monster extends Monster implements Skill{
  private int Mana;
	public Boss_Monster(String Name, int Health, int Damage,int Mana) {
		super(Name, Health, Damage);
		this.Mana = Mana;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Attack() {
		// TODO Auto-generated method stub
		System.out.println("Monster Attack with"+Damage+" damage");
		return Damage;
	}
	
	public String toString() {
		return "Name: " +Name +"(Boss)"+"\nHealth"+Health+"\nDamage: "+Damage;
	}
	
	

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	@Override
	public int Physical_skill() {
		// TODO Auto-generated method stub
		System.out.println("Monster Attack with physical skill"+Damage*1.5);
		return Damage;
	}

	@Override
	public int Magic_Skill(int mana) {
		// TODO Auto-generated method stub
		if (mana<=0) {
		System.out.println("Not enough mana");
		return 0;
		}
		else {
			System.out.println("Monster Attack wirh magic skill"+Damage+Damage*(1+mana/100)+"Damage");
		return Damage;
		}
	}

}
