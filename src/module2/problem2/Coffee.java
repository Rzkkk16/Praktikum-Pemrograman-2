package module2.problem2;

public class Coffee {
    public String coffeeName, size, customer;
    public double price;
    private double tax;

    public Coffee () {
    }

    public void printInfo() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran : " + size);
        System.out.println("Harga  : Rp. " + price);
    }

    public void setName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTax() {
        return price * 0.11;
    }
}
