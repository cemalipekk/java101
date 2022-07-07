import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        int armutkg, elmakg, domateskg, muzkg,patlıcankg;
        double armutf, elmaf, domatesf, muzf, patlıcanf,toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        armutkg = inp.nextInt();
        System.out.print("Elma Kac Kilo ? : ");
        elmakg = inp.nextInt();
        System.out.print("Domates Kac Kilo ? : ");
        domateskg = inp.nextInt();
        System.out.print("Muz Kac Kilo ? : ");
        muzkg = inp.nextInt();
        System.out.print("Patlican Kac Kilo ? : ");
        patlıcankg = inp.nextInt();

        armutf=2.14*armutkg;
        elmaf=3.67*elmakg;
        domatesf=1.11*domateskg;
        muzf= 0.95*muzkg;
        patlıcanf=5.00*patlıcankg;

        toplam=armutf+elmaf+domatesf+muzf+patlıcanf;
        System.out.println("Toplam Tutar = "+ toplam);





    }
}
