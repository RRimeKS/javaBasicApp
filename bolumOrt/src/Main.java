import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, toplam = 0, ort, sayac = 0;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                toplam += i;
            }
        }
        ort = toplam / sayac;
        System.out.println("Girdiğiniz değer içerisinde 3&4'e bölünen sayılarının toplamının ortalaması = "+ort);

    }
}