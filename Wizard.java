class Wizard extends Character{
	public int health;
	public int mana;

	public Wizard(){
		super();
		health = 100;
		mana = 100;
	}

	public Wizard(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.mana = 200;
	}

	public String conjure(){
		return(name + " conjured a thing.");
	}
}
