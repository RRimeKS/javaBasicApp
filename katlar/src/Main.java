import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, i;
        System.out.println("Bir değer giriniz...");
        n = inp.nextInt();

        System.out.println("4'ün katları...");
        System.out.println("********************");
        for (i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in katları...");
        System.out.println("********************");
        for (i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}