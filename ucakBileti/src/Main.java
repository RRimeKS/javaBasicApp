import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas, tip, ucret, mesafe;
        double normalT, yasIndirim, gidisDonus, indirimliT, toplamT;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi KM olarak giriniz...");
        mesafe = inp.nextInt();

        if (mesafe > 0) {
            System.out.println("Yaşınızı giriniz...");
            yas = inp.nextInt();

            if (yas > 0) {
                System.out.println("Yolculuk tipini giriniz...\nTek yön için 1'i\nGidiş-dönüş için 2'yi tuşlayınız...");
                tip = inp.nextInt();

                if (tip > 0 || tip <= 2) {
                    switch (tip) {
                        case 1:
                            if (yas <= 11) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.50);
                                System.out.println("Toplam tutar = " + yasIndirim);
                            } else if (yas >= 12 && yas <= 24) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.10);
                                System.out.println("Toplam tutar = " + yasIndirim);
                            } else if (yas > 65) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.30);
                                System.out.println("Toplam tutar = " + yasIndirim);
                            } else {
                                normalT = mesafe * 0.10;
                                System.out.println("Toplam tutar = " + normalT);
                            }
                            break;
                        case 2:
                            if (yas <= 11) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.50);
                                gidisDonus = yasIndirim - (yasIndirim * 0.20);
                                indirimliT = gidisDonus * 2;
                                System.out.println("Toplam tutar = " + indirimliT);
                            } else if (yas >= 12 && yas <= 24) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.10);
                                gidisDonus = yasIndirim - (yasIndirim * 0.20);
                                indirimliT = gidisDonus * 2;
                                System.out.println("Toplam tutar = " + indirimliT);
                            } else if (yas > 65) {
                                normalT = mesafe * 0.10;
                                yasIndirim = normalT - (normalT * 0.30);
                                gidisDonus = yasIndirim - (yasIndirim * 0.20);
                                indirimliT = gidisDonus * 2;
                                System.out.println("Toplam tutar = " + indirimliT);
                            } else {
                                normalT = mesafe * 0.10;
                                gidisDonus = normalT - (normalT * 0.20);
                                indirimliT = gidisDonus * 2;
                                System.out.println("Toplam tutar = " + indirimliT);
                            }
                            break;
                    }
                } else {
                    System.out.println("Hatalı değer girdiniz lütfen sayfayı yeniledikten sonra tekrar deneyiniz...");
                }
            } else {
                System.out.println("Hatalı değer girdiniz lütfen sayfayı yeniledikten sonra tekrar deneyiniz...");
            }
        } else {
            System.out.println("Hatalı değer girdiniz lütfen sayfayı yeniledikten sonra tekrar deneyiniz...");
        }
    }
}
