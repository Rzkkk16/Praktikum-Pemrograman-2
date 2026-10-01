package module2.problem3;

public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee();
//        kurang titik koma
//        p1.nama = "Roi"
        p1.name = "Roi";
        p1.origin = "Kingdom of Orvel";
        p1.setRole("Assasin");
        // Menambahkan assignment untuk umur
        p1.age = 17;

        System.out.println("Nama Pegawai: " + p1.getName());
        System.out.println("Asal: " + p1.getOrigin());
        System.out.println("Jabatan: " + p1.role);
        System.out.println("Umur: " + p1.age);
    }
}
