
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

        while(myPet.isAlive() && myPet.getAge() < 17) {

            int event = random.nextInt(3); //Later add as many choices but for now 3

            if (event == 0) {
                System.out.println(myPet.getName() + " is hungry!");
                System.out.println("Kibble or Chocolate?");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Kibble")) {
                    System.out.println("Good choice! Your pets age is increased by 1!");
                    myPet.ageUp();
                    System.out.println("Your pets age is " + myPet.getAge());

                } else if (choice.equalsIgnoreCase("Chocolate")) {
                    System.out.println("No! Chocolate is poisonous to pets!");
                    myPet.ageDeath();
                    System.out.println("Your pet is dead! Try Again!");
                }
            }
            else if (event == 1) {
                System.out.println(myPet.getName() + " is bored!");
                System.out.println("Pet toy or MORE KIBBLE");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Pet toy")) {
                    System.out.println("Excellent choice! Your pets age is increased by 1!");
                    myPet.ageUp();
                    System.out.println("Your pets age is " + myPet.getAge());

                } else if (choice.equalsIgnoreCase("MORE KIBBLE")) {
                    System.out.println(myPet.getName() + " is now morbidly obese! You lose!");
                    myPet.ageDeath();
                    System.out.println("Your pet is dead. Try again!");
                }
            }

                else if (event == 2) {
                    System.out.println(myPet.getName() + " is smelly");
                    System.out.println("Give " + myPet.getName() + " shower with HUMAN SHAMPOO OR PET SHAMPOO");
                    String choice2 = scanner.nextLine();

                    if(choice2.equalsIgnoreCase("HUMAN SHAMPOO")) {
                        System.out.println("Bad choice, your pet died.");
                        myPet.ageDeath();
                    } else if (choice2.equalsIgnoreCase("PET SHAMPOO")){
                        System.out.println("Nice! You chose the right shampoo. Your pet age is increased by 1.");
                        myPet.ageUp();
                    }
                }
            }

        System.out.println("Game Over!");
        if (myPet.isAlive()) {
            System.out.println("Congratulations! " + myPet.getName() + " has lived a long fulfilling life with you as their owner!");

        } else {
            System.out.println(myPet.getName() + " is dead:(");
        }
    }
}











