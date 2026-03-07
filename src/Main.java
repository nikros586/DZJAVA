import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todolist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Что вы хотите сделать?");
            int a = scanner.nextInt();
            scanner.nextLine();
            if(a == 1){
                String b = scanner.nextLine();
                todolist.add(b);
            }
            else {
                int c = scanner.nextInt();
                todolist.remove(c);
            }
            System.out.println(todolist);
        }

    }

}
