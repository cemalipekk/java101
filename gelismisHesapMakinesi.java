import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return  result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Cikarma : " + result);
        return  result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }
    static int divided(int a,int b) {
        if (b == 0) {
            System.out.println("ikinci sayi 0'dan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolum : " + result);
        return result;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        System.out.println("Us Hesabi : " + result);
        return result;
    }
    static int mod(int a, int b){
        return a % b;

    }
    static void calc(int a,int b){
        System.out.println("Alan : " + (a * b));
        System.out.println("Cevre : " + (2 *(a + b)));
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1- Toplama islemi\n"
                +"2- Cikarma islemi\n"
                +"3- Carpma islemi\n"
                +"4- Bolme islemi\n"
                +"5- Uslu Sayi Hesaplama\n"
                +"6- Mod alma\n"
                +"7- Dikdortgen Alan ve Cevre Hesaplama\n"
                +"0- Cikis Yapp!";

        while(true){
            System.out.print("islem seciniz : ");
            select = inp.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("ilk sayiyi giriniz :");
            int a = inp.nextInt();

            System.out.print("ikinci sayiyi giriniz : ");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum(a , b);
                    break;
                case 2:
                    minus(a , b);
                    break;
                case 3:
                    times(a , b);
                    break;
                case 4:
                    divided( a , b);
                    break;
                case  5:
                    power(a , b);
                    break;
                case 6:
                    System.out.println("Mod : " + mod(a , b));
                    break;
                case 7:
                    calc(a , b);
                    break;
                default:
                    System.out.println("Gecersiz Bir islem Girdiniz");

            }
        }
    }
}
