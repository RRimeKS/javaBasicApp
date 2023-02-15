import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Hava kaç derece ?\n4 derece küçükse 1'i\n5 derece ile 15 derece ise 2'yi\n15 derece ile 25 derece ise 3'ü\n25'den büyük ise 4'ü tuşlayınız...");
        heat=input.nextInt();

        switch (heat){
            case 1:
                System.out.println("Kayak yapabilirsin.");
                break;
            case 2:
                System.out.println("Sinemaya gidebilirsin.");
                break;
            case 3:
                System.out.println("Pikink yapabilirsin.");
                break;
            case 4:
                System.out.println("Yüzmeye gidebilirsin.");
                break;
        }
    }
}