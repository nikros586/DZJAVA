import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Book{
    Map<String, Boolean> books;
    public Book(){
        books = new HashMap<>();
    }
    public void tr_fls(String bk){
        books.remove(bk);
        books.put(bk, true);
    }
    public void add(String bk){
        books.put(bk, false);
    }
    public void remove(String bk){
        books.remove(bk);
    }
}




