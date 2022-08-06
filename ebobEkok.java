
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("n1 sayisini giriniz : ");
        int n1 = inp.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1 ;
        int ekok = 1;
        int i = 1;
        while(i <= n1){
            i++;
            if (n1 % i == 0  &&  n2 % i == 0){
                ebob = i;
            }
        }
        while(i <= (n1 *n2)){
            i++;
            if (i % n1 == 0  &&  i % n2 == 0){
                ekok = i/ebob;
            }
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
