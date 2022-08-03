import java.util.Scanner;

public class donguminmaxdeger {
    public static void main(String[] args) {
        int max = 0, min = 0, a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz :");
        a = inp.nextInt();

        for (int i= 1; i <= a; i++) {

            System.out.print(i + ". Sayiyi giriniz : ");
            int number = inp.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

    }
}
