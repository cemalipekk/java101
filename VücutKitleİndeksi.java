import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
        //Değişkenlerimizi Belirledim
        double boy,kilo, VucutKitleIndeksi;

        //Kullanıcıdan veri
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz :");
        boy = inp.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        //Vücut Kitle İndeksi Formülünü yazdık ve yazdırdık
        VucutKitleIndeksi= kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz : " + VucutKitleIndeksi);

    }
}
