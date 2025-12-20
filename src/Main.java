import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int g = (int)(Math.random() * 20);
        while (g != 15){
            g = (int)(Math.random() * 20);
            i++;
        }
        System.out.println(i);

    }
}