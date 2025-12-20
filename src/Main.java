import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] yui = {{2, 5, 3, 8, 6},
                        {1, 4, 2, 7, 5}};
        float sum = 0;
        for(int i = 0; i < yui.length; i++){
            for(int j = 0; j < yui[i].length; j++){
                sum += yui[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }

    }
}