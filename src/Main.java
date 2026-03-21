import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String qwe = "Guest1 neguest ne ne";
        Set<String> qwe1 = new TreeSet<>();
        List<String> qwe2 = Arrays.asList(qwe.split("\\s+"));
        for (String i : qwe2){
            qwe1.add(i);
        }
        System.out.println(qwe1);

    }

}
