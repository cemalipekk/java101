import java.util.Scanner;

public class Kullanıcıgirişi {
    public static void main(String[] args) {
        String userName,password,newPass,cevap,newPass3;

        Scanner inp = new Scanner(System.in);
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
// yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
// ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        System.out.print("Kullanici adinizi giriniz : ");
        userName = inp.nextLine();

        System.out.print("Parolanizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("cemalipek") && password.equals("patika123")){
            System.out.println("Basariyla Giris Yaptiniz :))");

        }else {
            System.out.println("Sifreniz Yanlis");
            System.out.print("Sifrenizi Sifirlamak Istiyorsaniz Evet veya Hayiri secin\nE-Evet\nH-Hayir\n:");
            cevap = inp.nextLine();
            switch (cevap){
                case "E":
                    System.out.print("Yeni sifrenizi giriniz : ");
                    newPass = inp.nextLine();
                    if (newPass.equals("patika123")) {
                        System.out.print("Sifre olusturulamadi.\nLutfen baska sifre giriniz:");
                        newPass3 = inp.nextLine();
                        }
                        else {
                            System.out.println("Sifre Basariyla Olusturuldu Iyi gunleer :D");
                        }
                    break;



                case "H":
                    System.out.println("Sizin Pasa Gonlunuz bilir :'D");


            }






        }

    }
}
