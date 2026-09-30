package module2.problem1;

public class Main {
    public static void main(String[] args) {
        Fruit Apel    = new Fruit("Apel", 7000, 0.4, 40 );
        Fruit Mangga  = new Fruit("mangga", 3500, 0.2, 15);
        Fruit Alpukat = new Fruit("alpukat", 10000, 0.25, 12);

        Apel.printInfo();
        Mangga.printInfo();
        Alpukat.printInfo();
    }
}
