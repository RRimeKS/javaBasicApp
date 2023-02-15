import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int er = 0, er2 = 3, select;
        String userName, password, newPassword;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz...");
        userName = inp.nextLine();
        System.out.println("Lütfen şifrenizi girini...");
        password = inp.nextLine();
        if (userName.equals("rks") && password.equals("1234")) {
            System.out.print("Giriş yaptınız anasayfaya yönlendiriliyorsunuz... ");
            for (int t = 0; t <= 5; t++) {
                System.out.print(t + " ");
            }
        } else {
            System.out.print("Hatalı giriş\nKullanıcı adınız ile şifrenizi kontrol edip tekrar deneyiniz...");
            er++;
            if (er == 1) {
                for (int b = 1; b <= 3; b++) {

                    System.out.println("Yanlış hakkınız " + er2);
                    er2--;
                    System.out.println("Lütfen kullanıcı adınızı giriniz...");
                    userName = inp.nextLine();
                    System.out.println("Lütfen şifrenizi giriniz...");
                    password = inp.nextLine();
                }
                if (er2 == 0) {
                    System.out.println("3 Hatalı işlem yaptınız şifrenizin sıfırlanmasını ister misiniz?\nEvet diyorsanız 1'i\nHayır diyorsanız 2'yi tuşlayınız");
                    select = inp.nextInt();
                    Scanner input = new Scanner(System.in);
                    switch (select) {
                        case 1:
                            System.out.println("Yeni şifrenizi giriniz...");
                            newPassword = input.nextLine();
                            if (newPassword.equals("1234")) {
                                System.out.println("Lütfen eski şifrenizden farklı bir şifre giriniz...");
                                System.out.println("Yeni şifrenizi giriniz...");
                                newPassword = input.nextLine();

                            } else {
                                System.out.println("Şifreniz değişmiştir...");
                            }
                            break;
                        case 2:
                            System.out.println("İşlem iptal edildi anasayfaya yönlendiriliyorusnuz...");
                            break;
                    }
                }
            }
        }
    }
}