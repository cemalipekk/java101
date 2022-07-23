import java.util.Scanner;

public class faktoriyelprog {
    public static void main(String[] args) {
        int k,nf = 1,rf = 1,n,r,kombinasyon;

        Scanner inp = new Scanner(System.in);
        System.out.println("N nin r li kombinasyonu C(n,r) seklinde gosterilir. ");
        System.out.println("Kombinasyon Formulu : C(n,r) = n! / (r! * (n-r)!)\n");
        System.out.print("n : ");
        n = inp.nextInt();

        System.out.print("r : ");
        r = inp.nextInt();

        for (int i=1; i<=n; i++){
            nf*=i;
        }
        for (int c=1; c<=r; c++){
            rf*=c;
        }
        kombinasyon=nf/(rf*(n-r));
        System.out.println("C(n,r) = n! / (r! * (n-r)!) : " + kombinasyon);

    }
}
