import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Kontact kontact = new Kontact();
        kontact.add("umniy");
        kontact.add("glupi");
        kontact.see();
    }
}

class Kontact{
    TreeMap<String, Integer> kontact;
    public Kontact(){
        kontact = new TreeMap<>();
    }
    public void tr_fls(String bk){
        System.out.println(kontact.get(bk));
    }
    public void add(String bk){
        kontact.put(bk, 5);
    }
    public void remove(String bk){
        kontact.remove(bk);
    }
    public void see(){
        System.out.println(kontact);
    }
}




