import java.util.ArrayList;

class Character{
	public String name;
	public boolean enemy;
	public ArrayList<Item> inventory;

	public Character(){
		name = "Willis";
		enemy = false;
	}

	public Character(String name, boolean enemy){
		this.name = name;
		this.enemy = enemy;
	}

	public String toString(){
		return ("Character name: " + this.name + "\nCharacter enemy status: " + this.enemy);
	}
}
