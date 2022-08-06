import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            while (true) {
                System.out.print("Sayi Giriniz : ");
                int n = inp.nextInt();

                int toplam = 0;

                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        toplam += i;
                    }
                }
                if (toplam == n) {
                    System.out.println(n + " Mukemmel Sayidir.");
                } else {
                    System.out.println(n + " Mukemmel Sayi Degildir.");
                }
            }
    }
}
