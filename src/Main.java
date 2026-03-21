import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbrs = Arrays.asList(2, 53, 8, 65, 91);
        List<Integer> numb = numbrs.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 3)
                .collect(Collectors.toList());
        System.out.println(numb);

    }

}
