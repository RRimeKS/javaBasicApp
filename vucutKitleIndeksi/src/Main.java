import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        int kilo;
        double boy,Indeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz : ");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo=inp.nextInt();

        Indeks=kilo/(boy*boy);

        System.out.println("Kilonuz : "+kilo);
        System.out.println("Boyunuz : "+boy);
        System.out.println("Vücut Kitle İndeksiniz : "+Indeks);


    }
}