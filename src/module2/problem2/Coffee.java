package module2.problem2;

public class Coffee {
    public String coffeeName, size, buyer;
    public double price;
    private double fee;

    public Coffee () {
        this.coffeeName = " ";
        this.size   = " ";
        this.price    = 0;
    }

    public void info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran : " + size);
        System.out.println("Harga  : Rp. " + price);
    }

    public String getBuyer(){
        return buyer;
    }
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getFee() {
        return price * 0.11;
    }
}
