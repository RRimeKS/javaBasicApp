import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne, numberTwo, value, total;
        Scanner input = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("**** 4 İŞLEM HESAP MAKİNESİ ****");
        System.out.println("********************************");

        System.out.println("\n");

        System.out.println("İlk sayıyı giriniz...");
        numberOne = input.nextInt();
        System.out.println("İkinci sayıyı giriniz...");
        numberTwo = input.nextInt();

        System.out.println("1.Toplama\n2.Çıkartma\n3.Bölme\n4.Çarpma\nYapmak istediğiniz işlemi seçiniz...");
        value = input.nextInt();

        if (value == 1) {
            total = numberOne + numberTwo;
            System.out.println(numberOne + " Değeri ile" + numberTwo + " Toplanınca sonuç = " + total);
        } else if (value == 2) {
            total = numberOne - numberTwo;
            System.out.println(numberOne + " Değerinden " + numberTwo + " Çıkarılınca sonuç = " + total);
        } else if (value == 3) {
            if (numberTwo != 0) {
                total = numberOne / numberTwo;
                System.out.println(numberOne + " Değeri ile " + numberTwo + " Değerini Çarpınca sonuç  = " + total);
            } else {
                System.out.println("Bir sayı 0'a bölünemez!");
            }
        } else if (value == 4) {
            total = numberOne * numberTwo;
            System.out.println(numberOne + " Değeri ile " + numberTwo + " Değerini Bölünce sonuç  = " + total);
        } else {
            System.out.println("Geçersiz bir değer girdiniz. Lütfen tekrar deneyiniz...");
        }
    }
}