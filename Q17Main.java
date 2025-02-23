// Base class Animal
class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Bird inheriting from Animal
class Bird extends Animal {
    // Overriding the makeSound() method for Bird
    @Override
    public void makeSound() {
        System.out.println("The bird sings.");
    }
}

// Sub class Cat inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound() method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test polymorphism
public class Q17Main {
    public static void main(String[] args) {
        // Creating objects of Animal, Bird, and Cat
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal cat = new Cat();

        // Calling the makeSound() method on each object
        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
    }
}