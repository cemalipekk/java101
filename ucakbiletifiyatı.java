import java.util.Scanner;

public class ucakbiletifiyatı {
    public static void main(String[] args) {
        int mesafe,yas,yolctip,NormalTutar;
        double mesafeBasıUcret = 0.10,tutar,yasIndirim = 0,indirimliTutar = 0,toplamTutar,sonindirim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM turundan giriniz :");
        mesafe = inp.nextInt();

        tutar = mesafe*mesafeBasıUcret;

        System.out.print("Yas'inizi giriniz :");
        yas = inp.nextInt();

        if (yas<12){
            yasIndirim=tutar*0.5;
            indirimliTutar=tutar-yasIndirim;
        } 
        else if (yas>12 && yas<=24) {
            yasIndirim=tutar*0.10;
            indirimliTutar=tutar-yasIndirim;
        } 
        else if (yas>24 && yas<65) {
            indirimliTutar=tutar;
            indirimliTutar=tutar-yasIndirim;
        } 
        else if (yas>65) {
            yasIndirim = tutar * 0.3;
            indirimliTutar = tutar - yasIndirim;
        }
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus :");
        yolctip = inp.nextInt();
        if ((yolctip<1 || yolctip>2 || mesafe < 0 || yas < 0)) {
            indirimliTutar=0;
            System.out.println("Hatali Veri Girdiniz!!");
        }
        if (yolctip==1) {

            toplamTutar = indirimliTutar;
            System.out.println(toplamTutar);
        }
        else if (yolctip==2) {

            sonindirim = indirimliTutar * 0.20;
            toplamTutar = (indirimliTutar - sonindirim) * 2;
            System.out.print("Toplam Tutar : " + toplamTutar);

        }
    }
}
