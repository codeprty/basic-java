// Parent class Animal
class Animal {
    // Method to make an animal sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the Animal and Cat classes
public class Q15Main {
    public static void main(String[] args) {
        // Creating an Animal and Cat object
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound(); // Calls the Animal's makeSound() method
        cat.makeSound(); // Calls the overriden makeSound() method in Cat
    }
}