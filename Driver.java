public class Driver{
	public static void main(String[] args){
		Character willis = new Character();
		Wizard wiz = new Wizard("Brad", false);
		Alchemist alch = new Alchemist("David", false);
		System.out.println(willis);
		System.out.println(alch);
		Item item1 = new Item("Gem", 250);
		alch.inventory.add(item1);
		System.out.println(alch.inventory.get(0).name);
		Item item2 = wiz.conjure();
		wiz.inventory.add(item1);
		System.out.println(wiz.name + " has items: " + wiz.inventory.get(0).name + " and " + wiz.inventory.get(1).name);
	}
}
