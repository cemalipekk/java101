import java.util.Scanner;
public class Notortalama {
    public static void main(String[] args) {
         // Değişkenleri  oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan  değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6;

        System.out.println("Ortalamaniz : " + sonuc);

        String str= sonuc>=70 ? "Sınıfı Gecti"  : " Sınıfta Kaldi";
        System.out.println(str);
    }
}
