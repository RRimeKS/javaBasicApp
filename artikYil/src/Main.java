import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl giriniz...");
        year = inp.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " Yılı bir artık yıldır.");
        }else{
            System.out.println(year + " Yılı bir artık yıl değildir.");
        }
    }
}