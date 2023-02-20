import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, toplam = 0;

        do {
            System.out.print("Sayı girin");
            n = inp.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }

        } while (n % 2 == 0);
        System.out.println("Girilen değerlerin toplamı = " + toplam);
    }
}