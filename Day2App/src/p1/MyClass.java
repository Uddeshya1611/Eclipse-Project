package p1;

public class MyClass {

	public static void main(String[] args) {
		MyClass game = new MyClass();
		
		Animal a = new Dog(40, 4, "A");
		
		game.startGames(a);
	}
	
	public void startGames(Animal a) {
		System.out.println(a.move());
		System.out.println(a.getWeight());
	}

}
