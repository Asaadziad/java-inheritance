package polymorphism;

public class Cake extends Dessert {
	
	private boolean isDairy;
	
	public Cake(String name, int cost, int amount, boolean isDairy) {
		super(name, cost, amount);
		this.isDairy = isDairy;
	}

	public String toString() {
		return super.toString() + " is dairy:"+this.isDairy;
	}
	
	public boolean isAllowed(int time) {
		if(time >= 3) {
			return true;
		}
		return this.isDairy;
	}
	
	@Override
	public int totalCost() {
		return this.getCost();
	}
	
	public boolean isDairy() {
		return isDairy;
	}

	public void setDairy(boolean isDairy) {
		this.isDairy = isDairy;
	}

}
