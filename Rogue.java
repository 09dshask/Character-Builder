import java.util.ArrayList;

class Rogue extends Character{
	public int health;
	public int stamina;
	public ArrayList<Item> inventory;

	public Rogue(){
		super();
		health = 100;
		stamina = 100;
		inventory = new ArrayList<Item>();
	}

	public Rogue(String name, boolean enemy){
		super(name, enemy);
		this.health = 100;
		this.stamina = 100;
		inventory = new ArrayList<Item>();
	}

	public void counterfeit(Item item){
		String newName = item.name;
		int newValue = item.value;
		Item newItem = new Item("Counterfeit " + newName, newValue);
		this.inventory.add(newItem);
	}
}
