package polymorphism;

public class Dessert {
	private String name;
	private int cost;
	private int amount;
	
	public Dessert(String name,int cost,int amount) {
		this.name = name;
		this.cost = cost;
		this.amount = amount;
	}

	public int totalCost() {
		return this.amount*this.cost;
	}
	
	public String toString() {
		return "Name:"+this.name+" Cost:"+this.cost+" Amount:"+this.amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
