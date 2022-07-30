import java.util.Scanner;

public class deseneGoreMetot {
    static int a(int x) {

        if (x <= 0) {
            return x;
        }else{
            System.out.print(x + ",");
        }return a(x - 5);
    }
    static int b(int x,int y){
        if (x > y){
            return x;

        }else {
            System.out.print(x + ",");
        }return b(x+5,y);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while(true) {
            System.out.print("Bir sayi Giriniz : ");
            int x = inp.nextInt();

            System.out.println(b(a(x), x - 5));
        }
    }
}
