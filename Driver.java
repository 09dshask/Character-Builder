public class Driver{
	public static void main(String[] args){
		Character willis = new Character();
		Wizard wiz = new Wizard("Brad", false);
		Alchemist alch = new Alchemist("David", false);
		Rogue rogue = new Rogue("Paul", false);

		System.out.println(willis);

		Item item1 = new Item("Gem", 250);
		Item item2 = new Item("Staff", 50);
		alch.inventory.add(item1);
		alch.inventory.add(item2);
		alch.transmute(item1, item2);
		System.out.println(alch.name + " has " + alch.inventory.size() + " items: " + alch.inventory.get(0).name);

		wiz.inventory.add(item1);
		wiz.conjure();
		System.out.println(wiz.name + " has " + wiz.inventory.size() + " items: " + wiz.inventory.get(0).name + " and " + wiz.inventory.get(1).name);

		rogue.inventory.add(item1);
		rogue.counterfeit(rogue.inventory.get(0));
		System.out.println(rogue.name + " has " + rogue.inventory.size() + " items: " + rogue.inventory.get(0).name + " and " + rogue.inventory.get(1).name);
	}
}
