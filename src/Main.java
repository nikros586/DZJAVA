import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();

        if(a >= 2 && a <=6){
            System.out.println("Дeтский сад");
        }
        else if(a >= 7 && a <=17){
            System.out.println("Школа");
        }
        else if (a >= 18 && a <=24){
            System.out.println("университет");
        }
        else if(a >= 24){
            System.out.println("работа");
        }
        else {
            System.out.println("You very small");
        }

    }
}