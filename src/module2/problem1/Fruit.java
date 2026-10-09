package module2.problem1;

public class Fruit {
    private String name;
    private double price;
    private double weight;
    private double buying;
    private double preDiscountPrice;
    private double pricePerKg;



    public Fruit(String name, double price, double weight, double buying) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.buying = buying;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + buying + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + getPreDiscountPrice());
        System.out.println("Total Diskon: Rp" + getDiscountTotal());
        System.out.println("Harga Setelah Diskon: Rp" + getPostDiscountPrice());
        System.out.println(" ");
    }

    public double getPreDiscountPrice() {
        preDiscountPrice = (price / weight) * buying;
        return preDiscountPrice;
    }

    public double getDiscountTotal() {
        double discountPercentage = 0.02;
        int discountBatches = (int) (this.buying / 4);
        return discountBatches * (this.pricePerKg * 4) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
