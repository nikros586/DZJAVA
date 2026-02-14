import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(10, "Name", 10);
        System.out.println(employee.getAge());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int setAge(int ages){
        age = ages;
        return age;
    }
    public String setName(String names){
        name = names;
        return name;
    }
}
class Employee extends Person{
    private int salary;
    public Employee(int salary, String name, int age){
        super(name, age);
        this.salary = salary;

    }

    public int getSalary(){
        return salary;
    }

    public int getSalary( int salarys){
        salary = salarys;
        return salary;
    }
}


