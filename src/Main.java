import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String [] books = {"fun", "time", "mine", "xyz"};
        Library library = new Library(books);
        library.addbook("iop");
        library.allbook();
        library.findbook("xyz");
    }

}

class Library{
    String [] name;
    public  Library(String [] name){
        this.name = name;
    }
    public void addbook(String book){
        name[3] = book;
    }
    public void allbook(){
        for(String i  : name){
            System.out.print(i + " ");
        }
    }
    public void findbook(String book){
        for (String i : name){
            if(i == book){
                System.out.println("Книга есть");
                break;
            }
            if(i == name[3]){
                System.out.println("Книги нет");
                break;
            }
        }

    }


}