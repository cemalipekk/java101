import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a1 = 0, a2 = 1, a3;
        System.out.print("Basamak Sayisini giriniz : ");
        int n = inp.nextInt();

        for (int i = 1; i < n; i++) {
            a3 = a1 + a2;
            System.out.println(a1 + " + " + a2 + " = " + a3);
            a1 = a2;
            a2 = a3;
        }


    }
}
