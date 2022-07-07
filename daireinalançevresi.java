import java.util.Scanner;

public class daireinalançevresi {
    public static void main(String[] args) {
        //Değişkenleri belirleme
        double PI =3.14,alan,merkezaçısı,r;
        //Kullanıcıdan veri alma
        Scanner inp = new Scanner(System.in);
        System.out.println("Daire'nin yari capini girin : ");
        r = inp.nextInt();
        System.out.println("Merkez Acisini yaziniz : ");
        merkezaçısı = inp.nextInt();
        // Alan Formülü ve Alanın yazdırılması
        alan = (PI*(r*r)*merkezaçısı)/360;

        System.out.println("Daire'nin Alani :" + alan);



    }
}
