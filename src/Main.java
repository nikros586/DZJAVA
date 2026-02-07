import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Арбуз", "Полосатый");
        animal.tis();
    }

}

class Animal{
    String name;
    String type;
    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void tis(){
        System.out.println("\u001B[1mЭто " + type + " по имени " + name);
    }
}