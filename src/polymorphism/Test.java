package polymorphism;

import javax.crypto.Cipher;

public class Test {
	
	public static void main(String args[]) {
		Cake c1 = new Cake("Choco",10,2,true);
		Cake c2 = new Cake("fostoq", 15, 2, false);
		IceCream c3 = new IceCream("glida", 3, 8, true);
		Dessert c4 = new Dessert("titiana", 6, 9);
		FrozenDessert c5 = new FrozenDessert("ligma doodle", 100, 69);

		
		System.out.println(c1.toString() + "\n"+c2.toString()+"\n"+c3.toString()+
				"\n"+c4.toString()+"\n"+c5.toString());
		
		System.out.println("MENU");
		System.out.println(c1.getName() + " Costs:"+c1.totalCost());
		System.out.println(c2.getName() + " Costs:"+c2.totalCost());
		System.out.println(c3.getName() + " Costs:"+c3.totalCost());
		System.out.println(c4.getName() + " Costs:"+c4.totalCost());
		System.out.println(c5.getName() + " Costs:"+c5.totalCost());
	}
}
