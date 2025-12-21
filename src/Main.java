import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] yui = {2, 5, 3, 8, 6};
        int sum = 0, otv = 0;
        for(int i = 0; i < yui.length; i++){
            if(sum < yui[i]){
                sum = yui[i];
                otv = i;
            }
        }
        System.out.println(otv);

    }
}