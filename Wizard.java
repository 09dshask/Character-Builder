import java.util.ArrayList;

class Wizard extends Character{
	public int health;
	public int mana;
	public ArrayList<Item> inventory;

	public Wizard(){
		super();
		health = 100;
		mana = 100;
		inventory = new ArrayList<Item>();
	}

	public Wizard(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.mana = 200;
		inventory = new ArrayList<Item>();
	}

	public void conjure(){
		Item conjuredItem = new Item("Conjured Thing", 10);
		this.inventory.add(conjuredItem);
	}
}
