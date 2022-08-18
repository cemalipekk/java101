import jdk.swing.interop.SwingInterOpUtils;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int firstShot;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstShot = 50;
    }

    void run() {

        if (isCheck()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=====YENI ROAUND=====");
                if (isFirstShot ()) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }
                if (isFirstShot ()) {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
                    System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                    System.out.println(this.f2.name + " Saglik : " + this.f2.health);
            }

            }else{
                System.out.println("Sporcuların Sikletleri Uymuyor.!");
            }
        }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandi");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandi");
            return true;
        }
        return false;
    }

    boolean isFirstShot() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.firstShot;
    }
}

