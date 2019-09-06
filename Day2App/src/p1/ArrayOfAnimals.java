package p1;

public class ArrayOfAnimals {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Animal animalArr[] = new Animal[10];
		
		for(Object animal : animalArr) {
			if(animal instanceof Dog) {
				Dog d = (Dog)animal;
			}
		}

	}

}
//can't extend final class