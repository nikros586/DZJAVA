import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] mas = {5, 7, 3, 8};

        for(int i : mas){
            System.out.print(i + " ");
        }

        System.out.print("\n");

        for(int i = 0; i < mas.length; i++){
            mas[i] *= 2;
            System.out.print(mas[i] + " ");
        }
    }

}