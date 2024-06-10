package _05_DIP;

public class PetRun {

	public static void main(String[] args) {

	Pet pet = new Pet();
		
		IPet cat= new Cat();
		IPet dog = new Dog();
		
		pet.setPet(dog);
		System.out.println(pet.getPet());
		pet.setPet(cat);
		System.out.println(pet.getPet());
		
	}

}
