//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int bcol = 5, bc = 80;
        int mcol = 2, mc = 105;
        int mocol = 2, moc = 100;
        int ycol = 4, yc = 70;
        int sum = (bcol * bc) + (mcol * mc) + (mocol * moc) + (ycol * yc);
        float sumk = sum / 1000F;

        System.out.println("Gramm " + sum + " Kilogramm " + sumk);


    }
}