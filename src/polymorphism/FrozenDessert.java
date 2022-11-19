package polymorphism;

public class FrozenDessert extends Dessert {
	
	private int default_temperature = -4;
	
	private int temperature;
	
	public FrozenDessert(String name, int cost, int amount) {
		super(name, cost, amount);
		this.temperature = default_temperature;
	}
	
	public String toString() {
		return super.toString() + " Temperature:"+this.temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
