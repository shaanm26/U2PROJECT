import java.util.Random;

public class Pet{

    private String name;
    private String gender;
    public int age;
    private boolean isAlive;

    public Pet(String petName, String petGender) {
        this.name = petName;
        this.gender = petGender;
        this.isAlive = true;

        Random rand = new Random();
        this.age = rand.nextInt(16)+1;

        System.out.println("Your pet, " + this.name + "(" + this.gender + ")" + " is age " + this.age + ".");

    }


}
