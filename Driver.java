public class Driver{
	public static void main(String[] args){
		Character willis = new Character();
		Alchemist alch = new Alchemist("David", false);
		System.out.println(willis);
		System.out.println(alch);
		System.out.println(alch.transmute());
	}
}
