import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] yui = {2, 5, 3, 8, 6};
        float sum = 0;
        for(int i = 0; i < yui.length; i++){
              sum += yui[i];
        }
        sum = sum / yui.length;
        System.out.println(sum);
    }
}