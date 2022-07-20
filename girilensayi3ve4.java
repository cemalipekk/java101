import java.util.Scanner;

public class girilensayi3ve4 {
    public static void main(String[] args) {
        int k;
        double ortalama, toplam = 0, sayiadedi = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0) {
                toplam+=i;
                sayiadedi++;

            } if (i % 4 == 0) {
                toplam+= i;
                sayiadedi++;
            }
        }
        ortalama = toplam/sayiadedi;
        System.out.println("Sayilarin Ortalamasi : " + ortalama);
    }
}
