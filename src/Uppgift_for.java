import java.util.Scanner;

public class Uppgift_for {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        int n = Integer.parseInt(tgb.nextLine());
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * " + n + " = " + n * i);
        }
    }
}

