import java.security.KeyStore;
import java.time.Month;
import java.util.Scanner;

public class burcbulanprogram {
    public static void main(String[] args) {
        int month, day , döngü=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        month = inp.nextInt();

        System.out.print("Dogdudunuz gun : ");
        day = inp.nextInt();
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Oglak Burcusunuz");
                } else {
                    System.out.println("Kova Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    System.out.println("Kova Burcusunuz");
                } else {
                    System.out.println("Balık Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Balık Burcusunuz");
                } else {
                    System.out.println("Koc Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    System.out.println("Koc Burcusunuz");
                } else {
                    System.out.println("Boğa Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Boga Burcusunuz");
                } else {
                    System.out.println("İkizler Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Ikizler Burcusunuz");
                } else {
                    System.out.println("Yengec Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Yengec Burcusunuz");
                } else {
                    System.out.println("Aslan Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Aslan Burcusunuz");
                } else {
                    System.out.println("Basak Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Basak Burcusunuz");
                } else {
                    System.out.println("Terazi Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Terazi Burcusunuz");
                } else {
                    System.out.println("Akrep Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.print("Akrep Burcusunuz");
                } else {
                    System.out.println("Yay Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Yay Burcusunuz");
                } else {
                    System.out.println("Oglak Burcusunuz");
                }
            } else {
                System.out.println("Gecersiz bir gun girdiniz");
            }
        }
    }
}