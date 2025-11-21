//Your task is to create your own Java application that serves some purpose or has a general
//theme. You can choose to create a game, a simulation, or just a simple program that does some
//task given some input. Keep it fairly simple; you will have about one week to complete this!

//1. Your project must include at least one class file and one runner file.          | Refer back, constructor.
//2. Your class file can be a static or non-static class                             | Non-Static Method
//3. You should be using iteration and conditional statements in some way            | If/else for choices
//4. Your program should have some sort of "random" element involved                 | Math.Random choices


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
//while(myPet.age<17){
        System.out.println(name + " has awoken!");
        //Choices
        System.out.println(name + " is hungry!" + " What will you feed them?");
        System.out.println("Chocolate Cake or Pet food?");
        String Choice1 = scanner.nextLine();



    }



}

