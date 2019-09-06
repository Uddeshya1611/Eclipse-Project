package p1;

public class Dog extends Animal {

	private String name;
	
	public static void main(String[] args) {}

	public Dog() {}
	public Dog(int weight, int legs, String name) {
		super(weight, legs);
		this.name = name;
	}
	
	@Override
	public String move() {
		return "Move method called";
	}
}
