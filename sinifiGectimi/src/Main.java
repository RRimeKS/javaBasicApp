import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fizik, mat, turkce, kimya, muzik, ders = 0;
        double avarage, total = 0;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz...");
        mat = girdi.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            ders++;
        }
        System.out.println("Türkçe notunuzu giriniz...");
        turkce = girdi.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            ders++;
        }
        System.out.println("Fizik notunuzu giriniz...");
        fizik = girdi.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            ders++;
        }
        System.out.println("Kimya notunuzu giriniz...");
        kimya = girdi.nextInt();
        if (kimya >= 0) {
            total += kimya;
            ders++;
        }
        System.out.println("Müzik notunuzu giriniz...");
        muzik = girdi.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            ders++;
        }
        avarage = total / ders;
        if (avarage <= 55) {
            System.out.println("Ortalaman = " + avarage + "\nSınıfta kaldın");
        } else {
            System.out.println("Ortalaman = " + avarage + "\nTebrikler! Sınıfı geçtin.");
        }
    }
}