import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        do{
            if(i%7 == 0){
                System.out.println(i);
            }
            i++;
        }while(i < 100);

    }
}