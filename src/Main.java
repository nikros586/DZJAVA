import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Kontact{
    LinkedHashMap<Integer, Boolean> kontact;
    public Kontact(){
        kontact = new LinkedHashMap<>();
    }
    public void tr_fls(int bk){
        System.out.println(kontact.get(bk));
    }
    public void add(int bk){
        kontact.put(bk, false);
    }
    public void remove(int bk){
        kontact.remove(bk);
    }
}




