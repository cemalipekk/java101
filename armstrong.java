import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        int number, numberCounter = 0, result = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        number = inp.nextInt();

        while(number != 0){
            numberCounter = number % 10;
            number/=10;
            result+=numberCounter;
        }
        System.out.println("toplam : " + result);
    }
}
