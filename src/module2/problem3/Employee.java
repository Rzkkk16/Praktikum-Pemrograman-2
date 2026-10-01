package module2.problem3;

public class Employee {
    public String name;
//    harusnya memakai tipe data String
//    public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

//    kurang parameter
//    public void setRole() {
    public void setRole(String role) {
//        harusnya nilai kembali ke variabel jabatan
//        this.jabatan = j;
        this.role = role;
    }

    // Menambahkan method getUmur
    public int getAge() {
        return age;
    }
}
