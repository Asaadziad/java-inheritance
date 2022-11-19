package polymorphism;

public class IceCream extends FrozenDessert {
	
	private boolean sprinkles;
	
	
	public IceCream(String name, int cost, int amount, boolean sprinkles) {
		super(name, cost, amount);
		this.sprinkles = sprinkles;
	}
	
	public String toString() {
		return super.toString() + (this.sprinkles ? "free are Sprinkles" : "");
	}
}
