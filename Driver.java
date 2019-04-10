public class Driver{
	public static void main(String[] args){
		Character willis = new Character();
		Alchemist alch = new Alchemist("David", false);
		System.out.println(willis);
		System.out.println(alch);
		Item item1 = new Item("Gem", 250);
		alch.inventory.add(item1);
		System.out.println(alch.inventory.get(0).name);
	}
}
