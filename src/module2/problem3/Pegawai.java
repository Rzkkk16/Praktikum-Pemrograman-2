package module2.problem3;

public class Pegawai {
    public String nama;
//    harusnya memakai tipe data String
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

//    kurang parameter
//    public void setJabatan() {
    public void setJabatan(String jabatan) {
//        harusnya nilai kembali ke variabel jabatan
//        this.jabatan = j;
        this.jabatan = jabatan;
    }

    // Menambahkan method getUmur
    public int getUmur() {
        return umur;
    }
}
