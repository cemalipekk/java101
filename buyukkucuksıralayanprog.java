import java.util.Scanner;

public class buyukkucuksıralayanprog {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("A Sayisini Giriniz : ");
        a = inp.nextInt();

        System.out.print("B Sayisini Giriniz : ");
        b = inp.nextInt();

        System.out.print("C Sayisini Giriniz : ");
        c = inp.nextInt();
        if ((a > b) && (a>c)) {
            if (b > c) {
                System.out.println("A > B > C");
            } else {
                System.out.println("A > C > B");
            }
        }else if ((b > a) && (b>c)){
            if (a>c){
                System.out.println("B > A > C");
                }else{
                System.out.println("B > C > A");
            }
        }else if ((c>a) && (c>b)){
            if (a>b){
                System.out.println("C > A > B");
            }else{
                System.out.println("C > B > A");
            }
        }
    }
}
