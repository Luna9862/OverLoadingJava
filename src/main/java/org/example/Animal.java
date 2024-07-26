package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with both parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor with only name, defaults isDog to false
    public Animal(String name) {
        this(name, false);
    }

    // Constructor with only isDog, defaults name to "Unknown"
    public Animal(boolean isDog) {
        this("Unknown", isDog);
    }

    // Default constructor, defaults name to "Unknown" and isDog to false
    public Animal() {
        this("Unknown", false);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // Override toString method to display animal details in the desired format
    @Override
    public String toString() {
        return name + " is a dog=" + isDog;
    }

    // Main method
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a name (entering nothing will stop the loop): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is it a dog? (yes/no): ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        // Print out all animals in the list with the updated format
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
