import java.util.Random;

public class Pet{

    private String name;
    private String gender;
    private int age;
    private boolean isAlive;

    public Pet(String petName, String petGender) {
        this.name = petName;
        this.gender = petGender;
        this.isAlive = true;

        Random rand = new Random();
        this.age = rand.nextInt(16)+1; //the pet age limit is 17, this will be used so when choices are made its going to be bad or good, either keeping their lifespan or increasing it to 17.

        System.out.println("Your pet, " + this.name + "(" + this.gender + ")" + " is age " + this.age + ".");

    }


}
