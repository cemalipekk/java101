import java.util.Scanner;
public class java101patikasi {
    public static void main(String[] args) {
        float n1, n2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 = input.nextFloat();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextFloat();

        System.out.println("\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bolme : " + (n1 / n2));
                }else{
                    System.out.println("Bir sayi sifira bolunmez !");
                    break;
                }
            default:
                System.out.println("Yanlis secim yaptiniz.Tekrar deneyiniz");
                break;

        }


    }

}
