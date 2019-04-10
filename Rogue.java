import java.util.ArrayList;

class Rogue extends Character{
	public int health;
	public int stamina;
	public ArrayList<Item> inventory;

	public Rogue(){
		super();
		health = 100;
		mana = 100;
		inventory = new Inventory<Item>();
	}

	public Rogue(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.stamina = 100;
		inventory = new Inventory<Item>();
	}

	public String counterfeit(){
		return(name + " couterfeit a thing.");
	}
}
