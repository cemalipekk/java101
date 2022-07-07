import java.util.Scanner;

public class kdvhesaplayanprogram {
    public static void main(String[] args) {
        // Değişkenlerimizi belirleyelim
        double kdvsizTutar, kdvOran=0.18 , kdvliTutar, kdvTutar;
        boolean kdvDurum;

        //Kullanıcıdan veri alalım
        Scanner inp = new Scanner(System.in);
        System.out.println("Fiyat giriniz : " );
        kdvsizTutar = inp.nextInt();

        //KDV oranını belirle
        kdvDurum= (0<kdvsizTutar) && (1000>kdvsizTutar);
        kdvOran=kdvDurum ? 0.18 : 0.08;

        //KDV tutarını ve KDV'li tutarı hesaplayıp ve ekrana yazdıralım
        kdvTutar = kdvsizTutar * kdvOran;
        kdvliTutar= kdvsizTutar+ kdvTutar;

        System.out.println("KDV'siz tutar : " + kdvsizTutar );
        System.out.println("KDV Orani : " + kdvOran);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.println("KDV Tutari : " + kdvTutar);


















    }
}
