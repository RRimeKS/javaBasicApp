import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Matematikten kaç aldın ?");
        int mat = input.nextInt();

        System.out.println("Türkçeden kaç aldın ?");
        int tr = input.nextInt();

        System.out.println("Kimyadan kaç aldın?");
        int ka = input.nextInt();

        System.out.println("Fizikten kaç aldın ?");
        int fk = input.nextInt();

        System.out.println("Tarihten kaç aldın ?");
        int th = input.nextInt();

        System.out.println("Müzikten kaç aldın ?");
        int mk = input.nextInt();

        int toplam = mat + tr + fk + ka+th+mk;
        int ort = toplam /= 6;
        boolean sonuc = ort >= 60;
        String vSonuc = sonuc ? "Geçti" : "Kaldı";
        System.out.println("Toplam not ortalaması : " + ort);
        System.out.println("Durum " + vSonuc);
    }
}