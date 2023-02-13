import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematikten kaç aldın ?");
        int mat = input.nextInt();

        System.out.println("Türkçeden kaç aldın ?");
        int tr=input.nextInt();

        System.out.println("Coğrafyadan kaç aldın?");
        int cog=input.nextInt();

        System.out.println("Fizikten kaç aldın ?");
        int fk=input.nextInt();

        toplam=mat+tr+fk+cog;
        int ort=toplam/=4;
        boolean sonuc;
        sonuc =(ort>=60);
        String vSonuc=sonuc ? "Geçti" : "Kaldı";
        System.out.println("Toplam not ortalaması : "+ort);
        System.out.println("Durum " + vSonuc);

    }
}

