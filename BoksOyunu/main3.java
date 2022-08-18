public class main3 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Myke Tyson",10,120,100,50);
        Fighter f2 = new Fighter("Muhammed Ali", 20,120,85, 70);

        Match match = new Match(f1, f2, 85,100);
        match.run();

    }
}
