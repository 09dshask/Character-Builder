import java.util.ArrayList;

class Alchemist extends Character{
	public int health;
	public int mana;
	public ArrayList<Item> inventory;

	public Alchemist(){
		super();
		health = 100;
		mana = 100;
		inventory = new ArrayList<Item>();
	}

	public Alchemist(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.mana = 100;
		inventory = new ArrayList<Item>();
	}

	public String transmute(){
		return(name + " transmuted a thing.");
	}
}
