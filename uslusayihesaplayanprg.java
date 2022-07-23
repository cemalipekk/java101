import java.util.Scanner;

public class uslusayihesaplayanprg {
    public static void main(String[] args) {
        int a, b,Total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ussu alinacak sayi  :");
        a= inp.nextInt();

        System.out.print("Uss olacak sayi : ");
        b = inp.nextInt();


            for (int i = 1; i <= b; i++) {
                Total*= a;

        }
            System.out.println("Sonuc : " + Total);
    }
}
