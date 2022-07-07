import java.util.Scanner;

public class hipotenüsbulanprog {
    public static void main(String[] args) {
        int a,b,c;
        double cevre,n,alan;
        Scanner inp = new Scanner(System.in);

        System.out.println("1.Kenari Yaz :");
        a = inp.nextInt();
        System.out.println("2.Kenari Yaz :");
        b = inp.nextInt();
        System.out.println("3.Kenari Yaz :");
        c = inp.nextInt();

        cevre = (a+b+c);
        n= (a+b+c)/2;
        alan = Math.sqrt(n*(n-a)*(n-b)*(n-c));
        System.out.println(alan);





    }
}
