//Your task is to create your own Java application that serves some purpose or has a general
//theme. You can choose to create a game, a simulation, or just a simple program that does some
//task given some input. Keep it fairly simple; you will have about one week to complete this!

//1. Your project must include at least one class file and one runner file.          | Refer back, constructor.
//2. Your class file can be a static or non-static class                             | Non-Static Method
//3. You should be using iteration and conditional statements in some way            | If/else
//4. Your program should have some sort of "random" element involved                 | Math.Random
//5. Your program should NOT just be a re-creation of something that already exists. | Has to be original

//Project: Mini - Pet Simulator
// Random Pet referred from constructr blahb albha lbah, introduce they get to choose name, age, type of pet.
// Get age of pet static, age is math random
// Have choices to do depending on the choice they will surivve or die.
// INPUT IS NOT CASE SENSSITIVEIE.
import java.util.Scanner;
import java.util.Random;

public class PetSim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome!");
        System.out.println("Lets create your pet!");

        System.out.println("Enter your pets name here: ");
        String name = scanner.nextLine();

        System.out.println("Enter your pets gender here: ");
        String gender = scanner.nextLine();

        Pet myPet = new Pet(name, gender);


    }
}
