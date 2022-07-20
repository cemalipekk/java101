import java.util.Scanner;

public class kuvvetBulanprogram2 {
    public static void main(String[] args) {
        int k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        k = inp.nextInt();

        System.out.println("\n4'un Katlari");
        for (int i=4; i<=k; i*=4){
            System.out.print(i + "  ");

        }
        System.out.println("\n\n5'in Katlari");
        for (int a=5; a<=k; a*=5){
            System.out.print(a + "  ");
        }

    }
}
