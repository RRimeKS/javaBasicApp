import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double tutar,kdvOrani=0.18,kdv,kdvDahil;
        Scanner in = new Scanner(System.in);

        System.out.print("Tutar'ı giriniz...");
        tutar=in.nextDouble();

        kdv=kdvOrani*tutar;
        kdvDahil=kdv+tutar;

        if (tutar>=1000)
        {
            kdvOrani = 0.8;
            System.out.println("KDV Oranı = " + kdvOrani);
            System.out.println("KDVsiz tutar = " + tutar);
            System.out.println("KDV tutarı = " + kdv);
            System.out.println("KDV dahil tutar = " + kdvDahil);
        }
        else
        {
            System.out.println("KDV Oranı = "+kdvOrani);
            System.out.println("KDVsiz tutar = "+tutar);
            System.out.println("KDV tutarı = "+kdv);
            System.out.println("KDV dahil tutar = "+kdvDahil);
        }



    }

}