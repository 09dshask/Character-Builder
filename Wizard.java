class Wizard extends Character{
	public int health;
	public int mana;

	public Wizard(){
		super();
		health = 100;
		mana = 100;
	}

	public Wizard(String name, boolean enemy, int health, int mana){
		super(name, enemy);
		this.health = health;
		this.mana = mana;
	}
}
