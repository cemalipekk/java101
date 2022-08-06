import java.util.Scanner;

public class atmPratik {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1000;
        while(right > 0){
            System.out.print("Kullanici Adiniz : ");
            userName = inp.nextLine();

            System.out.print("Parolaniz : ");
            password = inp.nextLine();

            if (userName.equals("cemal.ipekk") && password.equals("patika123")){
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz :)) ");
                do {
                    System.out.println("1-Para Yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis Yap");
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatiracaginiz Para Miktari : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Cekeceginiz Para Miktari : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz.");
                            } else {
                                balance -= price;
                            }break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                        break;
                    }
                }while (select != 4);
                System.out.println("Tekrar Gorusmek Uzere :)");
                break;
            }else{
                right--;
                System.out.println("Hatali Giris Yaptiniz Tekrar Giris Yapiniz");
                if (right == 0) {
                    System.out.println("Hesabiniz Bloke Olmustur lutfen banka ile iletisime geciniz!! ");
                }else{
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }
    }
}
