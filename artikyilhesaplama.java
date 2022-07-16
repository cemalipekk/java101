import java.util.Scanner;

public class artikyilhesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        yil = inp.nextInt();
        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println("Bu Bir Artik yildir");
            } else {
                System.out.println("Bu Bir Artik yil degildir");
            }
        }
        else if (yil % 4 == 0) {
            System.out.println("Bu Bir Artik yildir");
        }
        else{
            System.out.println("Bu Bir Artik yil degildir");
        }
    }
}
