package module2.problem2;

public class Main {
    public static void main(String[] args) {
        Coffee kopi1 = new Coffee();
        kopi1.coffeeName = "Espresso";
        kopi1.size = "Medium";
        kopi1.price = 25000;

        kopi1.info();
        kopi1.setBuyer("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getBuyer());
        System.out.println("Pajak Kopi: Rp. "+kopi1.getFee());
    }
}
