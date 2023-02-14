import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,u;
        double alan,cevre;
        Scanner girdi = new Scanner(System.in);

        System.out.println("1.Kenarı giriniz...");
        a=girdi.nextInt();
        System.out.println("2.Kenarı giriniz...");
        b=girdi.nextInt();
        System.out.println("3.Kenarı giriniz...");
        c=girdi.nextInt();

        u=(a+b+c)/2;
        cevre=2*u;
        System.out.println("Üçgenin çevrisi : "+cevre);

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : "+alan);

    }
}