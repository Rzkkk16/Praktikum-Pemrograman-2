package module2.problem1;

public class Main {
    public static void main(String[] args) {
        Fruit Apple    = new Fruit("Apel", 7000, 0.4, 40 );
        Fruit Mango  = new Fruit("mangga", 3500, 0.2, 15);
        Fruit Avocado = new Fruit("alpukat", 10000, 0.25, 12);

        Apple.printInfo();
        Mango.printInfo();
        Avocado.printInfo();
    }
}
