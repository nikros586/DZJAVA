import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [][] mass = {
                {"Egor Vedyakin", "21", "5"},
                {"David Romanov", "19", "3"},
                {"Sergey Ivanov", "24", "5"},
                {"Maxim Lukin", "17", "2"},
                {"Gorshkova Ulyana", "25", "4"}
        };

        int h = 0;
        int max = 0;
        int srd = 0;


        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                if(j != mass[i].length-1){
                    System.out.print(mass[i][j] + " ");
                }
                else {
                    System.out.print(mass[i][j] + "\n");
                }
            }
        }
        for (int i = 0; i < mass.length; i++){
            if(max <= Integer.parseInt(mass[i][2])){
                max = Integer.parseInt(mass[i][2]);
                h += 1;
            }
        }

        int [] ind = new int[h];
        h = 0;
        for (int i = 0; i < mass.length; i++){
            if(max == Integer.parseInt(mass[i][2])){
                ind[h] = i;
                h+=1;
            }
        }
        System.out.print("\n");
        for (int i = 0; i < ind.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                if(j != mass[i].length-1){
                    System.out.print(mass[ind[i]][j] + " ");
                }
                else {
                    System.out.print(mass[ind[i]][j] + "\n");
                }
            }
        }

        System.out.print("\n");

        for (int i = 0; i < mass.length; i++){
            srd += Integer.parseInt(mass[i][2]);
        }
        srd /= mass.length;
        System.out.print(srd);

    }
}