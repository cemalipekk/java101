import java.util.Scanner;

public class sinifgecmedurumu {
    public static void main(String[] args) {
        double mat,fiz,turkce,kim,muzik,average;
        double bolen = 5;

        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat=inp.nextDouble();

        System.out.print("Fizik notunuzu giriniz:");
        fiz=inp.nextDouble();

        System.out.print("Turkce notunuzu giriniz:");
        turkce=inp.nextDouble();

        System.out.print("Kimya notunuzu giriniz:");
        kim=inp.nextDouble();

        System.out.print("Muzik notunuzu giriniz:");
        muzik=inp.nextDouble();

        if (mat<0 || mat>100){
            mat = 0;
            bolen--;

        }
        else if (fiz<0 || fiz>100) {
            fiz = 0;
            bolen--;
        }
        else if (turkce<0 || turkce>100){
            turkce = 0;
            bolen--;

        }
        else if (kim < 0 || kim>100) {
            kim = 0;
            bolen--;

        }
        else if (muzik<0 || muzik>100) {
            muzik = 0;
            bolen--;

        }
        average= (mat + fiz + turkce + kim + muzik)/bolen;
        if (average>=55){
            System.out.println("Sinifi Gectiniz Tebrikler :))");
        }
        else{
            System.out.println("Sinif'ta kaldiniz daha cok calismalisin :')");
        }
        System.out.print("Ortalamaniz : " + average);


    }

}
