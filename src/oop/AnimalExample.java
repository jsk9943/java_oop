package oop;

public class AnimalExample {

	public static void main(String[] args) {
		Animal animal = new Bird();
		animal.cry();
		System.out.println(animal.hashCode());
		
//		강제형변환
		Bird animal2 = (Bird) animal;
		animal2.fly();
		System.out.println(animal2.hashCode());
		
		animal = new Cat();
		animal.cry();
		System.out.println(animal.hashCode());
		animal = new Dog();
		animal.cry();
		System.out.println(animal.hashCode());
		
		
		
		
		
		
	}

}
