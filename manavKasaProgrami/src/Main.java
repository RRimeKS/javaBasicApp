import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double elma,muz,armut,ptlcn,dmts; double tMuz,tElma,tPtlcn,tDmts,tArmut;
        double apple=3.67,pear=2.14,tomatoes=1.11,aubergine=5.00,banana=0.95,total;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kg muz aldın ?");
        muz=input.nextInt();
        tMuz=muz*banana;

        System.out.print("Kaç kg elma aldın ?");
        elma=input.nextInt();
        tElma=elma*apple;

        System.out.print("Kaç kg armut aldın ?");
        armut=input.nextInt();
        tArmut=armut*pear;

        System.out.print("Kaç kg patlıcan aldın ?");
        ptlcn=input.nextInt();
        tPtlcn=ptlcn*aubergine;

        System.out.print("Kaç kg domates aldın ?");
        dmts=input.nextInt();
        tDmts=dmts*tomatoes;
        System.out.println("********************************");
        total=tArmut+tDmts+tMuz+tPtlcn+tElma;

        System.out.println(muz+" Kilo muz "+ tMuz+" TL.");
        System.out.println(elma+" Kilo elma "+ tElma+" TL.");
        System.out.println(armut+" Kilo armut "+ tArmut+" TL.");
        System.out.println(ptlcn+" Kilo patlıcan "+ tPtlcn+" TL.");
        System.out.println(dmts+" Kilo domates "+ tDmts+" TL.");
        System.out.println("********************************");
        System.out.println("Toplam tutar : "+total);






    }
}