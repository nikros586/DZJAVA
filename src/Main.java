import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] yui = {2, 5, 3, 8, 6};
        String otv = "NO";
        for(int i = 0; i < yui.length; i++){
            for(int j = i+1; j < yui.length; j++){
                if(yui[i] == yui[j]){
                    otv = "YES";
                }
            }
        }
        System.out.println(otv);

    }
}