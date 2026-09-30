package module2.problem2;

public class Kopi {
    public String namaKopi, ukuran, pembeli;
    public double harga;
    private double pajak;

    public Kopi () {
        this.namaKopi = " ";
        this.ukuran   = " ";
        this.harga    = 0;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga  : Rp. " + harga);
    }

    public String getPembeli(){
        return pembeli;
    }
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public double getPajak() {
        return harga * 0.11;
    }
}
