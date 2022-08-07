import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayisi Giriniz : ");
        int n = inp.nextInt();

        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
            for (int j = (n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
