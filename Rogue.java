class Rogue extends Character{
	public int health;
	public int stamina;

	public Rogue(){
		super();
		health = 100;
		mana = 100;
	}

	public Rogue(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.stamina = 100;
	}

	public String counterfeit(){
		return(name + " couterfeit a thing.");
	}
}
