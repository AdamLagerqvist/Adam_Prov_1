import java.util.Scanner;

public class Uppgift_do_while {
    public static void main(String[] args) {
        int i = 1;
        Scanner tgb = new Scanner(System.in);
        int n = Integer.parseInt(tgb.nextLine());
        do {
            System.out.println(i + " * " + n + " = " + n * i);
            i++;
        } while (i <= 10);
    }
}
