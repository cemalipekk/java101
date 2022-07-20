import java.util.Scanner;

public class TekSayiBulanProgram {
    public static void main(String[] args) {
        int k,toplam = 0;

        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Sayi giriniz : ");
            k = inp.nextInt();
            if (k % 4== 0){
                toplam+= k;
            }
        }
        while(k % 2 ==0);
        System.out.println("Toplam : " + toplam);


    }
}
