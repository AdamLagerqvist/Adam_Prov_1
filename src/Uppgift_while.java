import java.util.Scanner;

public class Uppgift_while {
    public static void main(String[] args) {
        int i = 1;
        Scanner tgb = new Scanner(System.in);
        int n = Integer.parseInt(tgb.nextLine());
        while (i <= 10){
            System.out.println(i + " * " + n + " = " + n * i);
            i++;
        }
    }
}
