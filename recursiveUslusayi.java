import java.util.Scanner;

public class recursiveUslusayi {
    static int power(int a,int b) {
        int result = 1;
        if (b == 0) {
            return 1;
        }
        result =power(a,b-1);
        result*=a;
        return result;


    }
    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Taban Degerini Giriniz : ");
            a = inp.nextInt();

            System.out.print("Us Degerini Giriniz : ");
            b = inp.nextInt();

            System.out.print("Sonuc : ");
            System.out.println(power(a, b));
        }
    }
}
