package p1;

public class Animal {
	
	private int weight;
	private int legs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Animal() {
		super();
	}
	public Animal(int weight, int legs) {
		super();
		this.weight = weight;
		this.legs = legs;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String move() {
		if(weight <= 30) return "Fast";
		else return "Slow";
	}
	

}
