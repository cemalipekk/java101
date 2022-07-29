import java.util.Scanner;

public class recursiveAsalSayi {
    static boolean asal(int k, int i){
        if (k <= 2){
            return (k == 2);
        }
        if (k % i == 0) {
            return false;
        }
        if (i * i > k){
            return true;
        }

        return asal(k, i + 1);
    }


    public static void main(String[] args) {
        int k;

        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print("Sayi Giriniz :");
            k = inp.nextInt();


            if (asal(k, 2)) {
                System.out.println(k + " sayisi asal sayidir. ");
            } else {
                System.out.println(k + " sayisi asal sayi degildir.");
            }
        }
    }
}
