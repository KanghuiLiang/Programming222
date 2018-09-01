package practice;

public class Armor {
	private String name;
	private String defenseDetail;
	
	public Armor(String name, String defenseDetail){
		this.name = name;
		if ((defenseDetail.equalsIgnoreCase("Physical"))||(defenseDetail.equalsIgnoreCase("Magic")))
		    this.defenseDetail = defenseDetail;
		else 
			this.defenseDetail = "Physical";
	}
	
	public Armor() {
		this.name = "er";
		this.defenseDetail = "haha";
	} //default constructor 
	
	public String toString() {
		return "Armor name: "+name+"\nDefense detail: "+defenseDetail;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefenseDetail() {
		return defenseDetail;
	}
	public void setDefenseDetail(String defenseDetail) {
		this.defenseDetail = defenseDetail;
	}

}
